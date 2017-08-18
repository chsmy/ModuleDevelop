package com.chs.moduledevelop.first;

import java.util.List;

/**
 * 作者：chs on 2017-08-17 17:55
 * 邮箱：657083984@qq.com
 */

public class BannerEntity {
    /**
     * next :
     * this_page_num : 5
     * list : [{"channel_id":"<2>:<13>","channel_desc":"鎺ㄨ崘","article_id":"35760","content_id":"35760","insert_date":"2017-08-17 17:43:07","publication_date":"2017-08-17 17:40:49","is_direct":"True","is_top":"False","article_url":"http://lol.qq.com/m/act/a20170721mall/","title":"缁忓吀鐗堢粓鏋佺毊鑲や粎鍞�129鍏冿紒","image_url_small":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/171743078521755_282.jpg","image_url_big":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/171743078521755_480.jpg","image_spec":"1","image_with_btn":"False","score":"3","summary":"搴嗘帉鐩熺Щ鍔ㄥ晢鍩庝笂绾匡紒绉诲姩鍟嗗煄闄愭椂鍙戝敭锛�","targetid":"2081480399","is_act":"0","is_hot":"0","is_subject":"0","is_report":"True","is_new":"0"},{"channel_id":"<2>:<10>,<2>:<13>,<2>:<368>","channel_desc":"鎺ㄨ崘","article_id":"35648","content_id":"35648","insert_date":"2017-08-15 16:53:20","publication_date":"2017-08-15 16:40:38","is_direct":"False","is_top":"False","article_url":"48/article_35648.shtml","title":"鎺岀洘澶х鍥細宄¤胺鏈\u20ac寮虹媯鏆翠箣蹇�","image_url_small":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/17120132254960_282.jpg","image_url_big":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/17120132254960_480.jpg","image_spec":"1","image_with_btn":"False","score":"3","summary":"涓冨ぉ榛勯噾鍒扮帇鑰呯殑濂囪抗锛屼簩绾у崟鏉\u20ac鎶\u20ac宸у寘鏁欏寘浼氾紒","targetid":"2080987584","video_info":"k053780pkvp 89","is_act":"0","is_hot":"0","is_subject":"0","is_report":"True","is_new":"0"},{"channel_id":"<2>:<13>","channel_desc":"鎺ㄨ崘","article_id":"35638","content_id":"35638","insert_date":"2017-08-15 15:25:47","publication_date":"2017-08-15 15:25:05","is_direct":"True","is_top":"False","article_url":"http://lolriotmall-wx.qq.com/act/a20170809biglong/index.html?ADTAG=lolriotmall.h5.lolapp.ad","title":"闄愭椂鎶㈠ぇ榫欏紑鍚紒","image_url_small":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/161045002957838_282.jpg","image_url_big":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/161045002957838_480.jpg","image_spec":"1","image_with_btn":"False","score":"3","summary":"","targetid":"2077992502","is_act":"0","is_hot":"0","is_subject":"0","is_report":"True","is_new":"0"},{"channel_id":"<2>:<13>","channel_desc":"鎺ㄨ崘","article_id":"35633","content_id":"35633","insert_date":"2017-08-15 14:37:32","publication_date":"2017-08-15 14:35:52","is_direct":"False","is_top":"False","article_url":"33/article_35633.shtml","title":"鐢电帺浠诲姟","image_url_small":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/151901140414444_282.jpg","image_url_big":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/151901140414444_480.jpg","image_spec":"1","image_with_btn":"False","score":"3","summary":"","targetid":"2077839209","intent":"qtpage://mall_latest_shelf_all","is_act":"0","is_hot":"0","is_subject":"0","is_report":"True","is_new":"0"},{"channel_id":"<2>:<13>","channel_desc":"鎺ㄨ崘","article_id":"35364","content_id":"35364","insert_date":"2017-08-09 20:25:55","publication_date":"2017-08-08 20:11:18","is_direct":"True","is_top":"False","article_url":"http://lpl.qq.com/es/act/a20170803sixthticket/index.html","title":"鍏懆骞村敭绁ㄥ紑鍚�","image_url_small":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/100935037191023_282.jpg","image_url_big":"http://ossweb-img.qq.com/upload/qqtalk/news/201708/100935037191023_480.jpg","image_spec":"1","image_with_btn":"False","score":"3","summary":"","targetid":"2069195553","is_act":"0","is_hot":"0","is_subject":"0","is_report":"True","is_new":"0"}]
     */

    private String next;
    private String this_page_num;
    private List<ListEntity> list;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getThis_page_num() {
        return this_page_num;
    }

    public void setThis_page_num(String this_page_num) {
        this.this_page_num = this_page_num;
    }

    public List<ListEntity> getList() {
        return list;
    }

    public void setList(List<ListEntity> list) {
        this.list = list;
    }

    public static class ListEntity {
        /**
         * channel_id : <2>:<13>
         * channel_desc : 鎺ㄨ崘
         * article_id : 35760
         * content_id : 35760
         * insert_date : 2017-08-17 17:43:07
         * publication_date : 2017-08-17 17:40:49
         * is_direct : True
         * is_top : False
         * article_url : http://lol.qq.com/m/act/a20170721mall/
         * title : 缁忓吀鐗堢粓鏋佺毊鑲や粎鍞�129鍏冿紒
         * image_url_small : http://ossweb-img.qq.com/upload/qqtalk/news/201708/171743078521755_282.jpg
         * image_url_big : http://ossweb-img.qq.com/upload/qqtalk/news/201708/171743078521755_480.jpg
         * image_spec : 1
         * image_with_btn : False
         * score : 3
         * summary : 搴嗘帉鐩熺Щ鍔ㄥ晢鍩庝笂绾匡紒绉诲姩鍟嗗煄闄愭椂鍙戝敭锛�
         * targetid : 2081480399
         * is_act : 0
         * is_hot : 0
         * is_subject : 0
         * is_report : True
         * is_new : 0
         * video_info : k053780pkvp 89
         * intent : qtpage://mall_latest_shelf_all
         */

        private String channel_id;
        private String channel_desc;
        private String article_id;
        private String content_id;
        private String insert_date;
        private String publication_date;
        private String is_direct;
        private String is_top;
        private String article_url;
        private String title;
        private String image_url_small;
        private String image_url_big;
        private String image_spec;
        private String image_with_btn;
        private String score;
        private String summary;
        private String targetid;
        private String is_act;
        private String is_hot;
        private String is_subject;
        private String is_report;
        private String is_new;
        private String video_info;
        private String intent;

        public String getChannel_id() {
            return channel_id;
        }

        public void setChannel_id(String channel_id) {
            this.channel_id = channel_id;
        }

        public String getChannel_desc() {
            return channel_desc;
        }

        public void setChannel_desc(String channel_desc) {
            this.channel_desc = channel_desc;
        }

        public String getArticle_id() {
            return article_id;
        }

        public void setArticle_id(String article_id) {
            this.article_id = article_id;
        }

        public String getContent_id() {
            return content_id;
        }

        public void setContent_id(String content_id) {
            this.content_id = content_id;
        }

        public String getInsert_date() {
            return insert_date;
        }

        public void setInsert_date(String insert_date) {
            this.insert_date = insert_date;
        }

        public String getPublication_date() {
            return publication_date;
        }

        public void setPublication_date(String publication_date) {
            this.publication_date = publication_date;
        }

        public String getIs_direct() {
            return is_direct;
        }

        public void setIs_direct(String is_direct) {
            this.is_direct = is_direct;
        }

        public String getIs_top() {
            return is_top;
        }

        public void setIs_top(String is_top) {
            this.is_top = is_top;
        }

        public String getArticle_url() {
            return article_url;
        }

        public void setArticle_url(String article_url) {
            this.article_url = article_url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage_url_small() {
            return image_url_small;
        }

        public void setImage_url_small(String image_url_small) {
            this.image_url_small = image_url_small;
        }

        public String getImage_url_big() {
            return image_url_big;
        }

        public void setImage_url_big(String image_url_big) {
            this.image_url_big = image_url_big;
        }

        public String getImage_spec() {
            return image_spec;
        }

        public void setImage_spec(String image_spec) {
            this.image_spec = image_spec;
        }

        public String getImage_with_btn() {
            return image_with_btn;
        }

        public void setImage_with_btn(String image_with_btn) {
            this.image_with_btn = image_with_btn;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getTargetid() {
            return targetid;
        }

        public void setTargetid(String targetid) {
            this.targetid = targetid;
        }

        public String getIs_act() {
            return is_act;
        }

        public void setIs_act(String is_act) {
            this.is_act = is_act;
        }

        public String getIs_hot() {
            return is_hot;
        }

        public void setIs_hot(String is_hot) {
            this.is_hot = is_hot;
        }

        public String getIs_subject() {
            return is_subject;
        }

        public void setIs_subject(String is_subject) {
            this.is_subject = is_subject;
        }

        public String getIs_report() {
            return is_report;
        }

        public void setIs_report(String is_report) {
            this.is_report = is_report;
        }

        public String getIs_new() {
            return is_new;
        }

        public void setIs_new(String is_new) {
            this.is_new = is_new;
        }

        public String getVideo_info() {
            return video_info;
        }

        public void setVideo_info(String video_info) {
            this.video_info = video_info;
        }

        public String getIntent() {
            return intent;
        }

        public void setIntent(String intent) {
            this.intent = intent;
        }
    }
}
