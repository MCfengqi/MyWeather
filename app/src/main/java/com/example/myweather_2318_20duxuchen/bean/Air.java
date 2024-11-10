package com.example.myweather_2318_20duxuchen.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Air {


    /**空气
     * code : 200
     * updateTime : 2024-11-07T08:58+08:00
     * fxLink : https://www.qweather.com/air/xi'an-101110101.html
     * now : {"pubTime":"2024-11-07T08:00+08:00","aqi":"117","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"132","pm2p5":"88","no2":"52","so2":"7","co":"0.9","o3":"4"}
     * station : [{"pubTime":"2024-11-07T08:00+08:00","name":"高压开关厂","id":"CNA1462","aqi":"118","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"135","pm2p5":"89","no2":"63","so2":"8","co":"0.9","o3":"4"},{"pubTime":"2024-11-07T08:00+08:00","name":"兴庆小区","id":"CNA1463","aqi":"72","level":"2","category":"良","primary":"PM2.5","pm10":"82","pm2p5":"52","no2":"52","so2":"7","co":"0.9","o3":"7"},{"pubTime":"2024-11-07T08:00+08:00","name":"纺织城","id":"CNA1464","aqi":"93","level":"2","category":"良","primary":"PM10","pm10":"135","pm2p5":"66","no2":"34","so2":"8","co":"0.9","o3":"2"},{"pubTime":"2024-11-07T08:00+08:00","name":"小寨","id":"CNA1465","aqi":"109","level":"3","category":"轻度污染","primary":"NA","pm10":"167","pm2p5":"82","no2":"55","so2":"6","co":"0.9","o3":"2"},{"pubTime":"2024-11-07T08:00+08:00","name":"市人民体育场","id":"CNA1466","aqi":"120","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"108","pm2p5":"91","no2":"58","so2":"6","co":"0.9","o3":"3"},{"pubTime":"2024-11-07T08:00+08:00","name":"高新西区","id":"CNA1467","aqi":"137","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"141","pm2p5":"104","no2":"48","so2":"6","co":"1.0","o3":"4"},{"pubTime":"2024-11-07T08:00+08:00","name":"经开区","id":"CNA1468","aqi":"133","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"114","pm2p5":"101","no2":"64","so2":"7","co":"0.6","o3":"2"},{"pubTime":"2024-11-07T08:00+08:00","name":"长安区","id":"CNA1469","aqi":"108","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"163","pm2p5":"81","no2":"48","so2":"6","co":"0.7","o3":"6"},{"pubTime":"2024-11-07T08:00+08:00","name":"临潼区","id":"CNA1471","aqi":"98","level":"2","category":"良","primary":"PM2.5","pm10":"132","pm2p5":"73","no2":"53","so2":"7","co":"0.8","o3":"4"},{"pubTime":"2024-11-07T08:00+08:00","name":"草滩","id":"CNA1472","aqi":"85","level":"2","category":"良","primary":"PM2.5","pm10":"107","pm2p5":"63","no2":"47","so2":"3","co":"0.6","o3":"3"},{"pubTime":"2024-11-07T08:00+08:00","name":"曲江文化产业集团","id":"CNA1473","aqi":"170","level":"4","category":"中度污染","primary":"PM2.5","pm10":"160","pm2p5":"129","no2":"49","so2":"8","co":"1.0","o3":"2"},{"pubTime":"2024-11-07T08:00+08:00","name":"广运潭","id":"CNA1474","aqi":"119","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"144","pm2p5":"90","no2":"50","so2":"4","co":"0.8","o3":"3"},{"pubTime":"2024-11-07T08:00+08:00","name":"文体局","id":"CNA3524","aqi":"137","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"145","pm2p5":"104","no2":"41","so2":"9","co":"0.9","o3":"7"},{"pubTime":"2024-11-07T08:00+08:00","name":"无线电监控中心","id":"CNA3605","aqi":"132","level":"3","category":"轻度污染","primary":"PM2.5","pm10":"109","pm2p5":"100","no2":"60","so2":"10","co":"1.0","o3":"6"}]
     * refer : {"sources":["中国环境监测总站 (CNEMC)"],"license":["CC BY-SA 4.0"]}
     */

    private String code;
    private String updateTime;
    private String fxLink;
    private NowBean now;
    private ReferBean refer;
    private List<StationBean> station;

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

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public ReferBean getRefer() {
        return refer;
    }

    public void setRefer(ReferBean refer) {
        this.refer = refer;
    }

    public List<StationBean> getStation() {
        return station;
    }

    public void setStation(List<StationBean> station) {
        this.station = station;
    }

    public static class NowBean {
        /**
         * pubTime : 2024-11-07T08:00+08:00
         * aqi : 117
         * level : 3
         * category : 轻度污染
         * primary : PM2.5
         * pm10 : 132
         * pm2p5 : 88
         * no2 : 52
         * so2 : 7
         * co : 0.9
         * o3 : 4
         */

        private String pubTime;
        private String aqi;
        private String level;
        private String category;
        private String primary;
        private String pm10;
        private String pm2p5;
        private String no2;
        private String so2;
        private String co;
        private String o3;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getPrimary() {
            return primary;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm2p5() {
            return pm2p5;
        }

        public void setPm2p5(String pm2p5) {
            this.pm2p5 = pm2p5;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }
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

    public static class StationBean {
        /**
         * pubTime : 2024-11-07T08:00+08:00
         * name : 高压开关厂
         * id : CNA1462
         * aqi : 118
         * level : 3
         * category : 轻度污染
         * primary : PM2.5
         * pm10 : 135
         * pm2p5 : 89
         * no2 : 63
         * so2 : 8
         * co : 0.9
         * o3 : 4
         */

        private String pubTime;
        private String name;
        private String id;
        private String aqi;
        private String level;
        private String category;
        private String primary;
        private String pm10;
        private String pm2p5;
        private String no2;
        private String so2;
        private String co;
        private String o3;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getPrimary() {
            return primary;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm2p5() {
            return pm2p5;
        }

        public void setPm2p5(String pm2p5) {
            this.pm2p5 = pm2p5;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }
    }
}
