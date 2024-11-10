   package com.example.myweather_2318_20duxuchen;

   import android.util.Log;
   import androidx.annotation.NonNull;
   import androidx.lifecycle.LiveData;
   import androidx.lifecycle.MutableLiveData;
   import androidx.lifecycle.ViewModel;

   import com.example.myweather_2318_20duxuchen.bean.Air;
   import com.example.myweather_2318_20duxuchen.bean.ForeCast;
   import com.example.myweather_2318_20duxuchen.bean.NowWeather;
   import com.example.myweather_2318_20duxuchen.bean.indices;
   import com.example.myweather_2318_20duxuchen.utils.Config;
   import com.google.gson.Gson;
   import java.io.IOException;
   import java.util.List;

   import okhttp3.Call;
   import okhttp3.Callback;
   import okhttp3.OkHttpClient;
   import okhttp3.Request;
   import okhttp3.Response;

   public class MainViewModel extends ViewModel {
       private static final String TAG = "MainViewModel";
       private final MutableLiveData<NowWeather.NowBean> mNowWeather = new MutableLiveData<>();
       private final MutableLiveData<Air> airMutableLiveData = new MutableLiveData<>();
       MutableLiveData<List<ForeCast.DailyBean>> mutableDailyList=new MutableLiveData<>();

       MutableLiveData<indices> mIndices = new MutableLiveData<>();

       public LiveData<NowWeather.NowBean> getNowBean() {
           return mNowWeather;
       }
       public LiveData<Air> getAirLiveData() {
           return airMutableLiveData;
       }
       public void getNowWeather(String cityId) {
           OkHttpClient client = new OkHttpClient();
           Request request = new Request.Builder()
                   .url(Config.url_current_weather + "?location=" + cityId + "&key=" + Config.key)
                   .build();

           Call call = client.newCall(request);
           call.enqueue(new okhttp3.Callback() {
               @Override
               public void onFailure(@NonNull Call call, @NonNull IOException e) {
                   Log.d(TAG, "onFailure: " + e.getMessage());
               }

               @Override
               public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                   String resp = response.body().string();
                   Log.d(TAG, "onResponse: " + resp);
                   NowWeather nowWeather = new Gson().fromJson(resp, NowWeather.class);
                   mNowWeather.postValue(nowWeather.getNow());
               }
           });
       }
       public void getAir() {
           OkHttpClient.Builder builder = new OkHttpClient.Builder();
           Request request = new Request.Builder().url(Config.url_air + "?location=" + Config.cityCode + "&key=" + Config.key).build();
           Call call = builder.build().newCall(request);
           call.enqueue(new okhttp3.Callback() {
               @Override
               public void onFailure(@NonNull Call call, @NonNull IOException e) {
                   Log.d(TAG, "onFailure: " + e.getMessage());
               }

               @Override
               public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                   String json = response.body().string();
                   Log.d(TAG, "onResponse: " + json);
                   Air air = new Gson().fromJson(json, Air.class);
                   airMutableLiveData.postValue(air);
               }
           });
       }
//       生活建议
       public void getIndices(String cityCode)
       {
           OkHttpClient client = new OkHttpClient();
           Request request = new Request.Builder()
                   .url(Config.url_indices+"?key="+Config.key+"&location="+cityCode+"&type=3,5,8,9")
                   .build();
           Call call= client.newCall(request);
           call.enqueue(new Callback() {
               @Override
               public void onFailure(@NonNull Call call, @NonNull IOException e) {
                   Log.d(TAG, "onFailure: " + e.getMessage());
               }
               @Override
               public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                 String json = response.body().string();
                 Log.d(TAG, "onResponse: " + json);
                 indices indices = new Gson().fromJson(json, indices.class);
                 mIndices.postValue(indices);
               }

           });
       }
//       预报天气
       public void getForecast(String cityCode)
       {
           OkHttpClient client = new OkHttpClient();
           Request request = new Request.Builder()
                   .url(Config.url_7d+"?location="+cityCode+"&key="+Config.key)
                   .build();
           Call call = client.newCall(request);
           call.enqueue(new Callback() {
               @Override
               public void onFailure(@NonNull Call call, @NonNull IOException e) {
                   Log.d(TAG, "onFailure: "+e.getMessage());
               }

               @Override
               public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                   String resp = response.body().string();
                   ForeCast foreCast = new Gson().fromJson(resp, ForeCast.class);
                   mutableDailyList.postValue(foreCast.getDaily());
               }
           });
       }

   }