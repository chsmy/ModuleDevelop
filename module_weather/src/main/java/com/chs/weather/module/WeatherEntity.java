package com.chs.weather.module;

import java.util.List;

/**
 * 作者：chs on 2017-08-04 15:30
 * 邮箱：657083984@qq.com
 */

public class WeatherEntity {

    /**
     * code : 200
     * message :
     * redirect :
     * value : [{"alarms":[{"alarmContent":"江西省气象台08月04日10时21分发布高温黄色预警信号：预计未来三天我省大部分地区日最高气温将在35℃～37℃，请各地注意防暑降温。","alarmDesc":"江西省气象台发布高温黄色预警","alarmId":"5ce85232053ebc5463a36fc5d38df46c","alarmLevelNo":"02","alarmLevelNoDesc":"黄色","alarmType":"07","alarmTypeDesc":"高温黄色","precaution":"1.避免在高温时段进行户外活动； 2.对老.弱.病.幼人群要准备防暑降温措施。","publishTime":"2017-08-04 10:21:00"}],"city":"南昌","cityid":101240101,"indexes":[{"abbreviation":"pp","alias":"","content":"请选用水质无油粉底霜。","level":"去油防晒","name":"化妆指数"},{"abbreviation":"gm","alias":"","content":"感冒容易发生，少去人群密集的场所有利于降低感冒的几率。","level":"易发","name":"感冒指数"},{"abbreviation":"xc","alias":"","content":"洗车后，可至少保持4天车辆清洁，非常适宜洗车。","level":"非常适宜","name":"洗车指数"},{"abbreviation":"ct","alias":"","content":"潮湿闷热，衣物排汗透气，手帕擦汗环保时尚，不建议在露天场所逛街。","level":"闷热","name":"穿衣指数"},{"abbreviation":"uv","alias":"","content":"涂擦SPF20以上，PA++护肤品，避强光。","level":"强","name":"紫外线强度指数"},{"abbreviation":"yd","alias":"","content":"气温过高，特别容易中暑，较不适宜户外运动，建议室内运动。","level":"不适宜","name":"运动指数"}],"pm25":{"advice":"0","aqi":"55","citycount":605,"cityrank":44,"co":"7","color":"0","level":"0","no2":"5","o3":"39","pm10":"55","pm25":"41","quality":"良","so2":"4","timestamp":"","upDateTime":"2017-08-04 14:00:00"},"provinceName":"江西省","realtime":{"img":"0","sD":"56","sendibleTemp":"36","temp":"34","time":"2017-08-04 15:00:00","wD":"西南风","wS":"2级","weather":"晴","ziwaixian":"N/A"},"weatherDetailsInfo":{"publishTime":"2017-08-04 15:00:00","weather3HoursDetailsInfos":[{"endTime":"2017-08-04 19:00:00","highestTemperature":"34","img":"2","isRainFall":"","lowerestTemperature":"34","precipitation":"0","startTime":"2017-08-04 16:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-04 22:00:00","highestTemperature":"32","img":"2","isRainFall":"","lowerestTemperature":"32","precipitation":"0","startTime":"2017-08-04 19:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-05 01:00:00","highestTemperature":"30","img":"2","isRainFall":"","lowerestTemperature":"30","precipitation":"0","startTime":"2017-08-04 22:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-05 04:00:00","highestTemperature":"29","img":"1","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-05 01:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 07:00:00","highestTemperature":"29","img":"1","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-05 04:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 10:00:00","highestTemperature":"30","img":"1","isRainFall":"","lowerestTemperature":"30","precipitation":"0","startTime":"2017-08-05 07:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 13:00:00","highestTemperature":"33","img":"1","isRainFall":"","lowerestTemperature":"33","precipitation":"0","startTime":"2017-08-05 10:00:00","wd":"","weather":"少云","ws":""}]},"weathers":[{"date":"2017-08-04","img":"0","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"晴","week":"星期五","ws":""},{"date":"2017-08-05","img":"0","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"晴","week":"星期六","ws":""},{"date":"2017-08-06","img":"1","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"35","temp_day_f":"95.0","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"多云","week":"星期日","ws":""},{"date":"2017-08-07","img":"0","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"29","temp_night_f":"84.2","wd":"","weather":"晴","week":"星期一","ws":""},{"date":"2017-08-08","img":"1","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"34","temp_day_f":"93.2","temp_night_c":"27","temp_night_f":"80.6","wd":"","weather":"多云","week":"星期二","ws":""},{"date":"2017-08-09","img":"4","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"32","temp_day_f":"89.6","temp_night_c":"26","temp_night_f":"78.8","wd":"","weather":"雷阵雨","week":"星期三","ws":""},{"date":"2017-08-03","img":"1","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"35","temp_day_f":"95.0","temp_night_c":"27","temp_night_f":"80.6","wd":"","weather":"多云","week":"星期四","ws":""}]}]
     */

    private String code;
    private String message;
    private String redirect;
    private List<ValueEntity> value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public List<ValueEntity> getValue() {
        return value;
    }

    public void setValue(List<ValueEntity> value) {
        this.value = value;
    }

    public static class ValueEntity {
        /**
         * alarms : [{"alarmContent":"江西省气象台08月04日10时21分发布高温黄色预警信号：预计未来三天我省大部分地区日最高气温将在35℃～37℃，请各地注意防暑降温。","alarmDesc":"江西省气象台发布高温黄色预警","alarmId":"5ce85232053ebc5463a36fc5d38df46c","alarmLevelNo":"02","alarmLevelNoDesc":"黄色","alarmType":"07","alarmTypeDesc":"高温黄色","precaution":"1.避免在高温时段进行户外活动； 2.对老.弱.病.幼人群要准备防暑降温措施。","publishTime":"2017-08-04 10:21:00"}]
         * city : 南昌
         * cityid : 101240101
         * indexes : [{"abbreviation":"pp","alias":"","content":"请选用水质无油粉底霜。","level":"去油防晒","name":"化妆指数"},{"abbreviation":"gm","alias":"","content":"感冒容易发生，少去人群密集的场所有利于降低感冒的几率。","level":"易发","name":"感冒指数"},{"abbreviation":"xc","alias":"","content":"洗车后，可至少保持4天车辆清洁，非常适宜洗车。","level":"非常适宜","name":"洗车指数"},{"abbreviation":"ct","alias":"","content":"潮湿闷热，衣物排汗透气，手帕擦汗环保时尚，不建议在露天场所逛街。","level":"闷热","name":"穿衣指数"},{"abbreviation":"uv","alias":"","content":"涂擦SPF20以上，PA++护肤品，避强光。","level":"强","name":"紫外线强度指数"},{"abbreviation":"yd","alias":"","content":"气温过高，特别容易中暑，较不适宜户外运动，建议室内运动。","level":"不适宜","name":"运动指数"}]
         * pm25 : {"advice":"0","aqi":"55","citycount":605,"cityrank":44,"co":"7","color":"0","level":"0","no2":"5","o3":"39","pm10":"55","pm25":"41","quality":"良","so2":"4","timestamp":"","upDateTime":"2017-08-04 14:00:00"}
         * provinceName : 江西省
         * realtime : {"img":"0","sD":"56","sendibleTemp":"36","temp":"34","time":"2017-08-04 15:00:00","wD":"西南风","wS":"2级","weather":"晴","ziwaixian":"N/A"}
         * weatherDetailsInfo : {"publishTime":"2017-08-04 15:00:00","weather3HoursDetailsInfos":[{"endTime":"2017-08-04 19:00:00","highestTemperature":"34","img":"2","isRainFall":"","lowerestTemperature":"34","precipitation":"0","startTime":"2017-08-04 16:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-04 22:00:00","highestTemperature":"32","img":"2","isRainFall":"","lowerestTemperature":"32","precipitation":"0","startTime":"2017-08-04 19:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-05 01:00:00","highestTemperature":"30","img":"2","isRainFall":"","lowerestTemperature":"30","precipitation":"0","startTime":"2017-08-04 22:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-05 04:00:00","highestTemperature":"29","img":"1","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-05 01:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 07:00:00","highestTemperature":"29","img":"1","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-05 04:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 10:00:00","highestTemperature":"30","img":"1","isRainFall":"","lowerestTemperature":"30","precipitation":"0","startTime":"2017-08-05 07:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 13:00:00","highestTemperature":"33","img":"1","isRainFall":"","lowerestTemperature":"33","precipitation":"0","startTime":"2017-08-05 10:00:00","wd":"","weather":"少云","ws":""}]}
         * weathers : [{"date":"2017-08-04","img":"0","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"晴","week":"星期五","ws":""},{"date":"2017-08-05","img":"0","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"晴","week":"星期六","ws":""},{"date":"2017-08-06","img":"1","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"35","temp_day_f":"95.0","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"多云","week":"星期日","ws":""},{"date":"2017-08-07","img":"0","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"29","temp_night_f":"84.2","wd":"","weather":"晴","week":"星期一","ws":""},{"date":"2017-08-08","img":"1","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"34","temp_day_f":"93.2","temp_night_c":"27","temp_night_f":"80.6","wd":"","weather":"多云","week":"星期二","ws":""},{"date":"2017-08-09","img":"4","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"32","temp_day_f":"89.6","temp_night_c":"26","temp_night_f":"78.8","wd":"","weather":"雷阵雨","week":"星期三","ws":""},{"date":"2017-08-03","img":"1","sun_down_time":"19:06","sun_rise_time":"05:39","temp_day_c":"35","temp_day_f":"95.0","temp_night_c":"27","temp_night_f":"80.6","wd":"","weather":"多云","week":"星期四","ws":""}]
         */

        private String city;
        private int cityid;
        private Pm25Entity pm25;
        private String provinceName;
        private RealtimeEntity realtime;
        private WeatherDetailsInfoEntity weatherDetailsInfo;
        private List<AlarmsEntity> alarms;
        private List<IndexesEntity> indexes;
        private List<WeathersEntity> weathers;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getCityid() {
            return cityid;
        }

        public void setCityid(int cityid) {
            this.cityid = cityid;
        }

        public Pm25Entity getPm25() {
            return pm25;
        }

        public void setPm25(Pm25Entity pm25) {
            this.pm25 = pm25;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public RealtimeEntity getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeEntity realtime) {
            this.realtime = realtime;
        }

        public WeatherDetailsInfoEntity getWeatherDetailsInfo() {
            return weatherDetailsInfo;
        }

        public void setWeatherDetailsInfo(WeatherDetailsInfoEntity weatherDetailsInfo) {
            this.weatherDetailsInfo = weatherDetailsInfo;
        }

        public List<AlarmsEntity> getAlarms() {
            return alarms;
        }

        public void setAlarms(List<AlarmsEntity> alarms) {
            this.alarms = alarms;
        }

        public List<IndexesEntity> getIndexes() {
            return indexes;
        }

        public void setIndexes(List<IndexesEntity> indexes) {
            this.indexes = indexes;
        }

        public List<WeathersEntity> getWeathers() {
            return weathers;
        }

        public void setWeathers(List<WeathersEntity> weathers) {
            this.weathers = weathers;
        }

        public static class Pm25Entity {
            /**
             * advice : 0
             * aqi : 55
             * citycount : 605
             * cityrank : 44
             * co : 7
             * color : 0
             * level : 0
             * no2 : 5
             * o3 : 39
             * pm10 : 55
             * pm25 : 41
             * quality : 良
             * so2 : 4
             * timestamp :
             * upDateTime : 2017-08-04 14:00:00
             */

            private String advice;
            private String aqi;
            private int citycount;
            private int cityrank;
            private String co;
            private String color;
            private String level;
            private String no2;
            private String o3;
            private String pm10;
            private String pm25;
            private String quality;
            private String so2;
            private String timestamp;
            private String upDateTime;

            public String getAdvice() {
                return advice;
            }

            public void setAdvice(String advice) {
                this.advice = advice;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public int getCitycount() {
                return citycount;
            }

            public void setCitycount(int citycount) {
                this.citycount = citycount;
            }

            public int getCityrank() {
                return cityrank;
            }

            public void setCityrank(int cityrank) {
                this.cityrank = cityrank;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getQuality() {
                return quality;
            }

            public void setQuality(String quality) {
                this.quality = quality;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public String getUpDateTime() {
                return upDateTime;
            }

            public void setUpDateTime(String upDateTime) {
                this.upDateTime = upDateTime;
            }
        }

        public static class RealtimeEntity {
            /**
             * img : 0
             * sD : 56
             * sendibleTemp : 36
             * temp : 34
             * time : 2017-08-04 15:00:00
             * wD : 西南风
             * wS : 2级
             * weather : 晴
             * ziwaixian : N/A
             */

            private String img;
            private String sD;
            private String sendibleTemp;
            private String temp;
            private String time;
            private String wD;
            private String wS;
            private String weather;
            private String ziwaixian;

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getSD() {
                return sD;
            }

            public void setSD(String sD) {
                this.sD = sD;
            }

            public String getSendibleTemp() {
                return sendibleTemp;
            }

            public void setSendibleTemp(String sendibleTemp) {
                this.sendibleTemp = sendibleTemp;
            }

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getWD() {
                return wD;
            }

            public void setWD(String wD) {
                this.wD = wD;
            }

            public String getWS() {
                return wS;
            }

            public void setWS(String wS) {
                this.wS = wS;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getZiwaixian() {
                return ziwaixian;
            }

            public void setZiwaixian(String ziwaixian) {
                this.ziwaixian = ziwaixian;
            }
        }

        public static class WeatherDetailsInfoEntity {
            /**
             * publishTime : 2017-08-04 15:00:00
             * weather3HoursDetailsInfos : [{"endTime":"2017-08-04 19:00:00","highestTemperature":"34","img":"2","isRainFall":"","lowerestTemperature":"34","precipitation":"0","startTime":"2017-08-04 16:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-04 22:00:00","highestTemperature":"32","img":"2","isRainFall":"","lowerestTemperature":"32","precipitation":"0","startTime":"2017-08-04 19:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-05 01:00:00","highestTemperature":"30","img":"2","isRainFall":"","lowerestTemperature":"30","precipitation":"0","startTime":"2017-08-04 22:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-05 04:00:00","highestTemperature":"29","img":"1","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-05 01:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 07:00:00","highestTemperature":"29","img":"1","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-05 04:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 10:00:00","highestTemperature":"30","img":"1","isRainFall":"","lowerestTemperature":"30","precipitation":"0","startTime":"2017-08-05 07:00:00","wd":"","weather":"少云","ws":""},{"endTime":"2017-08-05 13:00:00","highestTemperature":"33","img":"1","isRainFall":"","lowerestTemperature":"33","precipitation":"0","startTime":"2017-08-05 10:00:00","wd":"","weather":"少云","ws":""}]
             */

            private String publishTime;
            private List<Weather3HoursDetailsInfosEntity> weather3HoursDetailsInfos;

            public String getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(String publishTime) {
                this.publishTime = publishTime;
            }

            public List<Weather3HoursDetailsInfosEntity> getWeather3HoursDetailsInfos() {
                return weather3HoursDetailsInfos;
            }

            public void setWeather3HoursDetailsInfos(List<Weather3HoursDetailsInfosEntity> weather3HoursDetailsInfos) {
                this.weather3HoursDetailsInfos = weather3HoursDetailsInfos;
            }

            public static class Weather3HoursDetailsInfosEntity {
                /**
                 * endTime : 2017-08-04 19:00:00
                 * highestTemperature : 34
                 * img : 2
                 * isRainFall :
                 * lowerestTemperature : 34
                 * precipitation : 0
                 * startTime : 2017-08-04 16:00:00
                 * wd :
                 * weather : 阴
                 * ws :
                 */

                private String endTime;
                private String highestTemperature;
                private String img;
                private String isRainFall;
                private String lowerestTemperature;
                private String precipitation;
                private String startTime;
                private String wd;
                private String weather;
                private String ws;

                public String getEndTime() {
                    return endTime;
                }

                public void setEndTime(String endTime) {
                    this.endTime = endTime;
                }

                public String getHighestTemperature() {
                    return highestTemperature;
                }

                public void setHighestTemperature(String highestTemperature) {
                    this.highestTemperature = highestTemperature;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getIsRainFall() {
                    return isRainFall;
                }

                public void setIsRainFall(String isRainFall) {
                    this.isRainFall = isRainFall;
                }

                public String getLowerestTemperature() {
                    return lowerestTemperature;
                }

                public void setLowerestTemperature(String lowerestTemperature) {
                    this.lowerestTemperature = lowerestTemperature;
                }

                public String getPrecipitation() {
                    return precipitation;
                }

                public void setPrecipitation(String precipitation) {
                    this.precipitation = precipitation;
                }

                public String getStartTime() {
                    return startTime;
                }

                public void setStartTime(String startTime) {
                    this.startTime = startTime;
                }

                public String getWd() {
                    return wd;
                }

                public void setWd(String wd) {
                    this.wd = wd;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWs() {
                    return ws;
                }

                public void setWs(String ws) {
                    this.ws = ws;
                }
            }
        }

        public static class AlarmsEntity {
            /**
             * alarmContent : 江西省气象台08月04日10时21分发布高温黄色预警信号：预计未来三天我省大部分地区日最高气温将在35℃～37℃，请各地注意防暑降温。
             * alarmDesc : 江西省气象台发布高温黄色预警
             * alarmId : 5ce85232053ebc5463a36fc5d38df46c
             * alarmLevelNo : 02
             * alarmLevelNoDesc : 黄色
             * alarmType : 07
             * alarmTypeDesc : 高温黄色
             * precaution : 1.避免在高温时段进行户外活动； 2.对老.弱.病.幼人群要准备防暑降温措施。
             * publishTime : 2017-08-04 10:21:00
             */

            private String alarmContent;
            private String alarmDesc;
            private String alarmId;
            private String alarmLevelNo;
            private String alarmLevelNoDesc;
            private String alarmType;
            private String alarmTypeDesc;
            private String precaution;
            private String publishTime;

            public String getAlarmContent() {
                return alarmContent;
            }

            public void setAlarmContent(String alarmContent) {
                this.alarmContent = alarmContent;
            }

            public String getAlarmDesc() {
                return alarmDesc;
            }

            public void setAlarmDesc(String alarmDesc) {
                this.alarmDesc = alarmDesc;
            }

            public String getAlarmId() {
                return alarmId;
            }

            public void setAlarmId(String alarmId) {
                this.alarmId = alarmId;
            }

            public String getAlarmLevelNo() {
                return alarmLevelNo;
            }

            public void setAlarmLevelNo(String alarmLevelNo) {
                this.alarmLevelNo = alarmLevelNo;
            }

            public String getAlarmLevelNoDesc() {
                return alarmLevelNoDesc;
            }

            public void setAlarmLevelNoDesc(String alarmLevelNoDesc) {
                this.alarmLevelNoDesc = alarmLevelNoDesc;
            }

            public String getAlarmType() {
                return alarmType;
            }

            public void setAlarmType(String alarmType) {
                this.alarmType = alarmType;
            }

            public String getAlarmTypeDesc() {
                return alarmTypeDesc;
            }

            public void setAlarmTypeDesc(String alarmTypeDesc) {
                this.alarmTypeDesc = alarmTypeDesc;
            }

            public String getPrecaution() {
                return precaution;
            }

            public void setPrecaution(String precaution) {
                this.precaution = precaution;
            }

            public String getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(String publishTime) {
                this.publishTime = publishTime;
            }
        }

        public static class IndexesEntity {
            /**
             * abbreviation : pp
             * alias :
             * content : 请选用水质无油粉底霜。
             * level : 去油防晒
             * name : 化妆指数
             */

            private String abbreviation;
            private String alias;
            private String content;
            private String level;
            private String name;

            public String getAbbreviation() {
                return abbreviation;
            }

            public void setAbbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
            }

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class WeathersEntity {
            /**
             * date : 2017-08-04
             * img : 0
             * sun_down_time : 19:06
             * sun_rise_time : 05:39
             * temp_day_c : 36
             * temp_day_f : 96.8
             * temp_night_c : 28
             * temp_night_f : 82.4
             * wd :
             * weather : 晴
             * week : 星期五
             * ws :
             */

            private String date;
            private String img;
            private String sun_down_time;
            private String sun_rise_time;
            private String temp_day_c;
            private String temp_day_f;
            private String temp_night_c;
            private String temp_night_f;
            private String wd;
            private String weather;
            private String week;
            private String ws;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getSun_down_time() {
                return sun_down_time;
            }

            public void setSun_down_time(String sun_down_time) {
                this.sun_down_time = sun_down_time;
            }

            public String getSun_rise_time() {
                return sun_rise_time;
            }

            public void setSun_rise_time(String sun_rise_time) {
                this.sun_rise_time = sun_rise_time;
            }

            public String getTemp_day_c() {
                return temp_day_c;
            }

            public void setTemp_day_c(String temp_day_c) {
                this.temp_day_c = temp_day_c;
            }

            public String getTemp_day_f() {
                return temp_day_f;
            }

            public void setTemp_day_f(String temp_day_f) {
                this.temp_day_f = temp_day_f;
            }

            public String getTemp_night_c() {
                return temp_night_c;
            }

            public void setTemp_night_c(String temp_night_c) {
                this.temp_night_c = temp_night_c;
            }

            public String getTemp_night_f() {
                return temp_night_f;
            }

            public void setTemp_night_f(String temp_night_f) {
                this.temp_night_f = temp_night_f;
            }

            public String getWd() {
                return wd;
            }

            public void setWd(String wd) {
                this.wd = wd;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getWs() {
                return ws;
            }

            public void setWs(String ws) {
                this.ws = ws;
            }
        }
    }
}
