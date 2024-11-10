package com.example.myweather_2318_20duxuchen.utils;

import android.util.Log;

import com.example.myweather_2318_20duxuchen.R;

public class Tools {
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    public static String getCurrentDateTime(String datestr) {
//
//        LocalDateTime time = LocalDateTime.parse(datestr, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String str = time.format(formatter);
//        return str;
//    }

    public static int getWeatherIcon(String icon) {
        Log.d("TAG", "getWeatherIcon: "+icon);
        switch (icon) {
            case "100":
                return R.drawable.w100;
            case "101":
                return R.drawable.w101;
            case "102":
                return R.drawable.w102;
            case "103":
                return R.drawable.w103;
            case "104":
                return R.drawable.w104;
            case "150":
                return R.drawable.w150;
            case "151":
                return R.drawable.w151;
            case "300":
                return R.drawable.w300;
            case "301":
                return R.drawable.w301;
            case "302":
                return R.drawable.w302;
            case "303":
                return R.drawable.w303;
            case "304":
                return R.drawable.w304;
            case "305":
                return R.drawable.w305;
            case "306":
                return R.drawable.w306;
            case "307":
                return R.drawable.w307;
            case "308":
                return R.drawable.w308;
            case "309":
                return R.drawable.w309;
            case "310":
                return R.drawable.w310;
            case "311":
                return R.drawable.w311;
            case "312":
                return R.drawable.w312;
            default:
                return R.drawable.w999;


        }
    }

}