package com.example.myweather_2318_20duxuchen.bean;

import java.util.List;

public class ForeCast {

    /**七天预报
     * code : 200
     * updateTime : 2024-11-07T09:34+08:00
     * fxLink : https://www.qweather.com/weather/xi'an-101110101.html
     * daily : [{"fxDate":"2024-11-07","sunrise":"07:11","sunset":"17:47","moonrise":"12:28","moonset":"22:16","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"18","tempMin":"9","iconDay":"101","textDay":"多云","iconNight":"151","textNight":"多云","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"67","precip":"0.0","pressure":"971","vis":"25","cloud":"25","uvIndex":"4"},{"fxDate":"2024-11-08","sunrise":"07:11","sunset":"17:46","moonrise":"13:11","moonset":"23:26","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"19","tempMin":"10","iconDay":"100","textDay":"晴","iconNight":"150","textNight":"晴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"63","precip":"0.0","pressure":"970","vis":"25","cloud":"25","uvIndex":"4"},{"fxDate":"2024-11-09","sunrise":"07:12","sunset":"17:45","moonrise":"13:50","moonset":"","moonPhase":"上弦月","moonPhaseIcon":"802","tempMax":"17","tempMin":"11","iconDay":"101","textDay":"多云","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"62","precip":"0.0","pressure":"972","vis":"25","cloud":"10","uvIndex":"4"},{"fxDate":"2024-11-10","sunrise":"07:13","sunset":"17:45","moonrise":"14:24","moonset":"00:37","moonPhase":"盈凸月","moonPhaseIcon":"803","tempMax":"18","tempMin":"13","iconDay":"101","textDay":"多云","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"65","precip":"0.0","pressure":"972","vis":"25","cloud":"25","uvIndex":"4"},{"fxDate":"2024-11-11","sunrise":"07:14","sunset":"17:44","moonrise":"14:54","moonset":"01:48","moonPhase":"盈凸月","moonPhaseIcon":"803","tempMax":"16","tempMin":"14","iconDay":"101","textDay":"多云","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"67","precip":"0.0","pressure":"969","vis":"25","cloud":"25","uvIndex":"3"},{"fxDate":"2024-11-12","sunrise":"07:15","sunset":"17:43","moonrise":"15:24","moonset":"02:58","moonPhase":"盈凸月","moonPhaseIcon":"803","tempMax":"17","tempMin":"14","iconDay":"104","textDay":"阴","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"79","precip":"0.0","pressure":"964","vis":"25","cloud":"25","uvIndex":"1"},{"fxDate":"2024-11-13","sunrise":"07:16","sunset":"17:43","moonrise":"15:54","moonset":"04:07","moonPhase":"盈凸月","moonPhaseIcon":"803","tempMax":"15","tempMin":"13","iconDay":"305","textDay":"小雨","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"84","precip":"0.0","pressure":"965","vis":"25","cloud":"25","uvIndex":"1"}]
     * refer : {"sources":["QWeather"],"license":["CC BY-SA 4.0"]}
     */

    private String code;
    private String updateTime;
    private String fxLink;
    private ReferBean refer;
    private List<DailyBean> daily;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getFxLink() {
        return fxLink;
    }

    public void setFxLink(String fxLink) {
        this.fxLink = fxLink;
    }

    public ReferBean getRefer() {
        return refer;
    }

    public void setRefer(ReferBean refer) {
        this.refer = refer;
    }

    public List<DailyBean> getDaily() {
        return daily;
    }

    public void setDaily(List<DailyBean> daily) {
        this.daily = daily;
    }

    public static class ReferBean {
        private List<String> sources;
        private List<String> license;

        public List<String> getSources() {
            return sources;
        }

        public void setSources(List<String> sources) {
            this.sources = sources;
        }

        public List<String> getLicense() {
            return license;
        }

        public void setLicense(List<String> license) {
            this.license = license;
        }
    }

    public static class DailyBean {
        /**
         * fxDate : 2024-11-07
         * sunrise : 07:11
         * sunset : 17:47
         * moonrise : 12:28
         * moonset : 22:16
         * moonPhase : 蛾眉月
         * moonPhaseIcon : 801
         * tempMax : 18
         * tempMin : 9
         * iconDay : 101
         * textDay : 多云
         * iconNight : 151
         * textNight : 多云
         * wind360Day : 0
         * windDirDay : 北风
         * windScaleDay : 1-3
         * windSpeedDay : 3
         * wind360Night : 0
         * windDirNight : 北风
         * windScaleNight : 1-3
         * windSpeedNight : 3
         * humidity : 67
         * precip : 0.0
         * pressure : 971
         * vis : 25
         * cloud : 25
         * uvIndex : 4
         */

        private String fxDate;
        private String sunrise;
        private String sunset;
        private String moonrise;
        private String moonset;
        private String moonPhase;
        private String moonPhaseIcon;
        private String tempMax;
        private String tempMin;
        private String iconDay;
        private String textDay;
        private String iconNight;
        private String textNight;
        private String wind360Day;
        private String windDirDay;
        private String windScaleDay;
        private String windSpeedDay;
        private String wind360Night;
        private String windDirNight;
        private String windScaleNight;
        private String windSpeedNight;
        private String humidity;
        private String precip;
        private String pressure;
        private String vis;
        private String cloud;
        private String uvIndex;

        public String getFxDate() {
            return fxDate;
        }

        public void setFxDate(String fxDate) {
            this.fxDate = fxDate;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getMoonrise() {
            return moonrise;
        }

        public void setMoonrise(String moonrise) {
            this.moonrise = moonrise;
        }

        public String getMoonset() {
            return moonset;
        }

        public void setMoonset(String moonset) {
            this.moonset = moonset;
        }

        public String getMoonPhase() {
            return moonPhase;
        }

        public void setMoonPhase(String moonPhase) {
            this.moonPhase = moonPhase;
        }

        public String getMoonPhaseIcon() {
            return moonPhaseIcon;
        }

        public void setMoonPhaseIcon(String moonPhaseIcon) {
            this.moonPhaseIcon = moonPhaseIcon;
        }

        public String getTempMax() {
            return tempMax;
        }

        public void setTempMax(String tempMax) {
            this.tempMax = tempMax;
        }

        public String getTempMin() {
            return tempMin;
        }

        public void setTempMin(String tempMin) {
            this.tempMin = tempMin;
        }

        public String getIconDay() {
            return iconDay;
        }

        public void setIconDay(String iconDay) {
            this.iconDay = iconDay;
        }

        public String getTextDay() {
            return textDay;
        }

        public void setTextDay(String textDay) {
            this.textDay = textDay;
        }

        public String getIconNight() {
            return iconNight;
        }

        public void setIconNight(String iconNight) {
            this.iconNight = iconNight;
        }

        public String getTextNight() {
            return textNight;
        }

        public void setTextNight(String textNight) {
            this.textNight = textNight;
        }

        public String getWind360Day() {
            return wind360Day;
        }

        public void setWind360Day(String wind360Day) {
            this.wind360Day = wind360Day;
        }

        public String getWindDirDay() {
            return windDirDay;
        }

        public void setWindDirDay(String windDirDay) {
            this.windDirDay = windDirDay;
        }

        public String getWindScaleDay() {
            return windScaleDay;
        }

        public void setWindScaleDay(String windScaleDay) {
            this.windScaleDay = windScaleDay;
        }

        public String getWindSpeedDay() {
            return windSpeedDay;
        }

        public void setWindSpeedDay(String windSpeedDay) {
            this.windSpeedDay = windSpeedDay;
        }

        public String getWind360Night() {
            return wind360Night;
        }

        public void setWind360Night(String wind360Night) {
            this.wind360Night = wind360Night;
        }

        public String getWindDirNight() {
            return windDirNight;
        }

        public void setWindDirNight(String windDirNight) {
            this.windDirNight = windDirNight;
        }

        public String getWindScaleNight() {
            return windScaleNight;
        }

        public void setWindScaleNight(String windScaleNight) {
            this.windScaleNight = windScaleNight;
        }

        public String getWindSpeedNight() {
            return windSpeedNight;
        }

        public void setWindSpeedNight(String windSpeedNight) {
            this.windSpeedNight = windSpeedNight;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPrecip() {
            return precip;
        }

        public void setPrecip(String precip) {
            this.precip = precip;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public String getCloud() {
            return cloud;
        }

        public void setCloud(String cloud) {
            this.cloud = cloud;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }
    }
}
