package com.example.myweather_2318_20duxuchen.bean;

import java.util.List;

public class NowWeather {
//    实时天气

    private static final String EMPTY_STRING = "";

    private String code;
    private String updateTime;
    private String fxLink;
    private NowBean now;
    private ReferBean refer;

    public NowWeather() {}

    public NowWeather(String code, String updateTime, String fxLink, NowBean now, ReferBean refer) {
        setCode(code);
        setUpdateTime(updateTime);
        setFxLink(fxLink);
        setNow(now);
        setRefer(refer);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code != null && !code.isEmpty()) {
            this.code = code;
        } else {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        if (updateTime != null && !updateTime.isEmpty()) {
            this.updateTime = updateTime;
        } else {
            throw new IllegalArgumentException("Update time cannot be null or empty");
        }
    }

    public String getFxLink() {
        return fxLink;
    }

    public void setFxLink(String fxLink) {
        if (fxLink != null && !fxLink.isEmpty()) {
            this.fxLink = fxLink;
        } else {
            throw new IllegalArgumentException("FX link cannot be null or empty");
        }
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        if (now != null) {
            this.now = now;
        } else {
            throw new IllegalArgumentException("NowBean cannot be null");
        }
    }

    public ReferBean getRefer() {
        return refer;
    }

    public void setRefer(ReferBean refer) {
        if (refer != null) {
            this.refer = refer;
        } else {
            throw new IllegalArgumentException("ReferBean cannot be null");
        }
    }

    public static class NowBean {
        private String obsTime;
        private int temp;
        private int feelsLike;
        private String icon;
        private String text;
        private int wind360;
        private String windDir;
        private int windScale;
        private int windSpeed;
        private int humidity;
        private double precip;
        private int pressure;
        private int vis;
        private int cloud;
        private int dew;

        public NowBean() {}

        public NowBean(String obsTime, int temp, int feelsLike, String icon, String text, int wind360, String windDir, int windScale, int windSpeed, int humidity, double precip, int pressure, int vis, int cloud, int dew) {
            setObsTime(obsTime);
            setTemp(temp);
            setFeelsLike(feelsLike);
            setIcon(icon);
            setText(text);
            setWind360(wind360);
            setWindDir(windDir);
            setWindScale(windScale);
            setWindSpeed(windSpeed);
            setHumidity(humidity);
            setPrecip(precip);
            setPressure(pressure);
            setVis(vis);
            setCloud(cloud);
            setDew(dew);
        }

        public String getObsTime() {
            return obsTime;
        }

        public void setObsTime(String obsTime) {
            if (obsTime != null && !obsTime.isEmpty()) {
                this.obsTime = obsTime;
            } else {
                throw new IllegalArgumentException("Observation time cannot be null or empty");
            }
        }

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }

        public int getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(int feelsLike) {
            this.feelsLike = feelsLike;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            if (icon != null && !icon.isEmpty()) {
                this.icon = icon;
            } else {
                throw new IllegalArgumentException("Icon cannot be null or empty");
            }
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            if (text != null && !text.isEmpty()) {
                this.text = text;
            } else {
                throw new IllegalArgumentException("Text cannot be null or empty");
            }
        }

        public int getWind360() {
            return wind360;
        }

        public void setWind360(int wind360) {
            this.wind360 = wind360;
        }

        public String getWindDir() {
            return windDir;
        }

        public void setWindDir(String windDir) {
            if (windDir != null && !windDir.isEmpty()) {
                this.windDir = windDir;
            } else {
                throw new IllegalArgumentException("Wind direction cannot be null or empty");
            }
        }

        public int getWindScale() {
            return windScale;
        }

        public void setWindScale(int windScale) {
            this.windScale = windScale;
        }

        public int getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(int windSpeed) {
            this.windSpeed = windSpeed;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getPrecip() {
            return precip;
        }

        public void setPrecip(double precip) {
            this.precip = precip;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getVis() {
            return vis;
        }

        public void setVis(int vis) {
            this.vis = vis;
        }

        public int getCloud() {
            return cloud;
        }

        public void setCloud(int cloud) {
            this.cloud = cloud;
        }

        public int getDew() {
            return dew;
        }

        public void setDew(int dew) {
            this.dew = dew;
        }

        public void getnow() {
        }
    }

    public static class ReferBean {
        private List<String> sources;
        private List<String> license;

        public ReferBean() {}

        public ReferBean(List<String> sources, List<String> license) {
            setSources(sources);
            setLicense(license);
        }

        public List<String> getSources() {
            return sources;
        }

        public void setSources(List<String> sources) {
            if (sources != null && !sources.isEmpty()) {
                this.sources = sources;
            } else {
                throw new IllegalArgumentException("Sources list cannot be null or empty");
            }
        }

        public List<String> getLicense() {
            return license;
        }

        public void setLicense(List<String> license) {
            if (license != null && !license.isEmpty()) {
                this.license = license;
            } else {
                throw new IllegalArgumentException("License list cannot be null or empty");
            }
        }
    }
}
