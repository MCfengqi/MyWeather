package com.example.myweather_2318_20duxuchen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import com.example.myweather_2318_20duxuchen.adapter.ForeAdapter;
import com.example.myweather_2318_20duxuchen.bean.Air;
import com.example.myweather_2318_20duxuchen.bean.ForeCast;
import com.example.myweather_2318_20duxuchen.bean.NowWeather;
import com.example.myweather_2318_20duxuchen.bean.indices;
import com.example.myweather_2318_20duxuchen.databinding.ActivityMainBinding;
import com.example.myweather_2318_20duxuchen.utils.Config;
import com.example.myweather_2318_20duxuchen.utils.Tools;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel model;
    private ForeAdapter adapter;
    private boolean isnow=false;
    private boolean isfore=false;
    private boolean isair=false;
    private boolean isindices=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        model = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication())).get(MainViewModel.class);
        initView();
        initData();
    }

    // 初始化数据
    private void initData() {
        model.getNowWeather(Config.cityCode);
        model.getAir();
        model.getForecast(Config.cityCode);
        model.getIndices(Config.cityCode);
    }

    // 初始化视图
    private void initView() {
        model.getNowBean().observe(this, new Observer<NowWeather.NowBean>() {
            @Override
            public void onChanged(NowWeather.NowBean nowBean) {
                binding.tvCityName.setText(Config.cityname);
                binding.tvUpdateTime.setText(nowBean.getObsTime().replace("T", " ").replace("+08:00", ""));
                binding.tvText.setText(nowBean.getText());
                binding.tvTemp.setText(nowBean.getTemp() + "℃");
                binding.ivlcon.setImageResource(Tools.getWeatherIcon(nowBean.getIcon()));
                isnow=true;
                isloadingEnd();
            }
        });

        model.getAirLiveData().observe(this, new Observer<Air>() {
            @Override
            public void onChanged(Air air) {
                binding.tvApi.setText(air.getNow().getAqi());
                binding.tvPm.setText(air.getNow().getPm10());
                isair=true;
                isloadingEnd();
            }
        });

        binding.rvForecase.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ForeAdapter();
        binding.rvForecase.setAdapter(adapter);

        model.mutableDailyList.observe(this, new Observer<List<ForeCast.DailyBean>>() {
            @Override
            public void onChanged(List<ForeCast.DailyBean> dailyBeans) {
                adapter.setData(dailyBeans);
                isfore=true;
                isloadingEnd();
            }
        });
        model.mIndices.observe(this, new Observer<indices>() {
            @Override
            public void onChanged(indices indices) {
              binding.tvlncide1.setText(indices.getDaily().get(0).getName()+"\n"+indices.getDaily().get(0).getText());
              binding.tvlncide2.setText(indices.getDaily().get(1).getName()+"\n"+indices.getDaily().get(1).getText());
              binding.tvlncide3.setText(indices.getDaily().get(2).getName()+"\n"+indices.getDaily().get(2).getText());
              binding.tvlncide4.setText(indices.getDaily().get(3).getName()+"\n"+indices.getDaily().get(3).getText());
              isindices=true;
                isloadingEnd();
            }
        });
        binding.swip.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initData();
                isair=false;
                isfore=false;
                isindices=false;
                isnow=false;

            }
        });

    }
    public void isloadingEnd() {
        if (isair&& isfore  && isindices && isnow)
        {
            binding.swip.setRefreshing(false);
        }
    }
}