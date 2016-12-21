package com.example.administrator.servicedemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

import java.util.List;

/**
 * Created by Administrator on 2016/11/30.
 */
public class BeanDemo extends BaseObservable{

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"allPages":1780,"ret_code":0,"contentlist":[{"id":"583e48cd6e362232476fb81f","title":"古诗都被你们玩坏了。。。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130110GJ10.jpg","type":2,"ct":"2016-11-30 11:34:37.653"},{"id":"583e48cd6e362232476fb81d","title":"选错的孩纸，你们英语课是怎么上的！","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130111QD46.jpg","type":2,"ct":"2016-11-30 11:34:37.625"},{"id":"583e48cd6e362232476fb81b","title":"看来吉林大学的女生都是有眼光的。。。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130110943546.jpg","type":2,"ct":"2016-11-30 11:34:37.584"},{"id":"583e425a6e362232476fa557","title":"\u201c你，你，给我把面包买回来\u201d","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130104533T8.jpg","type":2,"ct":"2016-11-30 11:07:06.132"},{"id":"583e425a6e362232476fa556","title":"姨妈血蹦了Orz。。。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130103IC19.jpg","type":2,"ct":"2016-11-30 11:07:06.131"},{"id":"583e425a6e362232476fa555","title":"这小摊卖的种类真有点跳\u2026\u2026","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130103212143.jpg","type":2,"ct":"2016-11-30 11:07:06.131"},{"id":"583e425a6e362232476fa553","title":"麻将是中华文化的国粹，打一打有益身心，玩一玩强身健骨","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130105P2404.jpg","type":2,"ct":"2016-11-30 11:07:06.126"},{"id":"583e425a6e362232476fa550","title":"哈哈哈这下可以放心去的超速了","img":"http://www.zbjuran.com/uploads/allimg/161130/10-16113010503J24.jpg","type":2,"ct":"2016-11-30 11:07:06.125"},{"id":"583e3b156e362232476f370e","title":"一只鸟，站在鸟上","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130101104135.jpg","type":2,"ct":"2016-11-30 10:36:05.204"},{"id":"583e3b156e362232476f370c","title":"当别人问：你们男人的唧唧除了小便还能用来干嘛时","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130102F6451.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e3b156e362232476f370b","title":"山寨的明目张胆","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130100K34D.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e3b156e362232476f370a","title":"教皇再往上升级，会变成什么职业？","img":"http://www.zbjuran.com/uploads/allimg/161130/10-16113010224SL.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e3b156e362232476f3709","title":"兔兔好会享受","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130102ZSL.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e33856e362232476f1e11","title":"每天放牛时顺便练功。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095423217.jpg","type":2,"ct":"2016-11-30 10:03:49.244"},{"id":"583e33856e362232476f1e10","title":"还挺和谐的感觉","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130094214356.jpg","type":2,"ct":"2016-11-30 10:03:49.244"},{"id":"583e33856e362232476f1e0f","title":"也有傲娇的一面","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095639455.jpg","type":2,"ct":"2016-11-30 10:03:49.244"},{"id":"583e33856e362232476f1e0e","title":"一看就是同宿舍的舍友","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095924531.jpg","type":2,"ct":"2016-11-30 10:03:49.187"},{"id":"583e33856e362232476f1e0d","title":"卧槽！这得多冷头发都结冰了","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095Q0D7.jpg","type":2,"ct":"2016-11-30 10:03:49.187"},{"id":"583e33786e362232476f1cde","title":"这只狗成精了，网友表示自从前几天给他剃了毛，就开始直立行走，停不下来。","img":"http://sc2.hao123img.com/data/2016-11-30/3_ec8d35e7fa40f5022db0e7049e08187a_430","type":2,"ct":"2016-11-30 10:03:36.542"},{"id":"583e2c5a6e362232476f03b6","title":"有大JJ的小姐姐","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130091Q61S.jpg","type":2,"ct":"2016-11-30 09:33:14.158"}],"currentPage":1,"allNum":35600,"maxResult":20}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }
    @Bindable
    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
        notifyPropertyChanged(BR.showapi_res_body);
    }

    public static class ShowapiResBodyBean extends BaseObservable{
        /**
         * allPages : 1780
         * ret_code : 0
         * contentlist : [{"id":"583e48cd6e362232476fb81f","title":"古诗都被你们玩坏了。。。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130110GJ10.jpg","type":2,"ct":"2016-11-30 11:34:37.653"},{"id":"583e48cd6e362232476fb81d","title":"选错的孩纸，你们英语课是怎么上的！","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130111QD46.jpg","type":2,"ct":"2016-11-30 11:34:37.625"},{"id":"583e48cd6e362232476fb81b","title":"看来吉林大学的女生都是有眼光的。。。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130110943546.jpg","type":2,"ct":"2016-11-30 11:34:37.584"},{"id":"583e425a6e362232476fa557","title":"\u201c你，你，给我把面包买回来\u201d","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130104533T8.jpg","type":2,"ct":"2016-11-30 11:07:06.132"},{"id":"583e425a6e362232476fa556","title":"姨妈血蹦了Orz。。。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130103IC19.jpg","type":2,"ct":"2016-11-30 11:07:06.131"},{"id":"583e425a6e362232476fa555","title":"这小摊卖的种类真有点跳\u2026\u2026","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130103212143.jpg","type":2,"ct":"2016-11-30 11:07:06.131"},{"id":"583e425a6e362232476fa553","title":"麻将是中华文化的国粹，打一打有益身心，玩一玩强身健骨","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130105P2404.jpg","type":2,"ct":"2016-11-30 11:07:06.126"},{"id":"583e425a6e362232476fa550","title":"哈哈哈这下可以放心去的超速了","img":"http://www.zbjuran.com/uploads/allimg/161130/10-16113010503J24.jpg","type":2,"ct":"2016-11-30 11:07:06.125"},{"id":"583e3b156e362232476f370e","title":"一只鸟，站在鸟上","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130101104135.jpg","type":2,"ct":"2016-11-30 10:36:05.204"},{"id":"583e3b156e362232476f370c","title":"当别人问：你们男人的唧唧除了小便还能用来干嘛时","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130102F6451.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e3b156e362232476f370b","title":"山寨的明目张胆","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130100K34D.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e3b156e362232476f370a","title":"教皇再往上升级，会变成什么职业？","img":"http://www.zbjuran.com/uploads/allimg/161130/10-16113010224SL.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e3b156e362232476f3709","title":"兔兔好会享受","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130102ZSL.jpg","type":2,"ct":"2016-11-30 10:36:05.202"},{"id":"583e33856e362232476f1e11","title":"每天放牛时顺便练功。","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095423217.jpg","type":2,"ct":"2016-11-30 10:03:49.244"},{"id":"583e33856e362232476f1e10","title":"还挺和谐的感觉","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130094214356.jpg","type":2,"ct":"2016-11-30 10:03:49.244"},{"id":"583e33856e362232476f1e0f","title":"也有傲娇的一面","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095639455.jpg","type":2,"ct":"2016-11-30 10:03:49.244"},{"id":"583e33856e362232476f1e0e","title":"一看就是同宿舍的舍友","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095924531.jpg","type":2,"ct":"2016-11-30 10:03:49.187"},{"id":"583e33856e362232476f1e0d","title":"卧槽！这得多冷头发都结冰了","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130095Q0D7.jpg","type":2,"ct":"2016-11-30 10:03:49.187"},{"id":"583e33786e362232476f1cde","title":"这只狗成精了，网友表示自从前几天给他剃了毛，就开始直立行走，停不下来。","img":"http://sc2.hao123img.com/data/2016-11-30/3_ec8d35e7fa40f5022db0e7049e08187a_430","type":2,"ct":"2016-11-30 10:03:36.542"},{"id":"583e2c5a6e362232476f03b6","title":"有大JJ的小姐姐","img":"http://www.zbjuran.com/uploads/allimg/161130/10-161130091Q61S.jpg","type":2,"ct":"2016-11-30 09:33:14.158"}]
         * currentPage : 1
         * allNum : 35600
         * maxResult : 20
         */

        private int allPages;
        private int ret_code;
        private int currentPage;
        private int allNum;
        private int maxResult;
        private List<ContentlistBean> contentlist;

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }
        @Bindable
        public List<ContentlistBean> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<ContentlistBean> contentlist) {
            this.contentlist = contentlist;
            notifyPropertyChanged(BR.contentlist);
        }

        public static class ContentlistBean extends BaseObservable{
            /**
             * id : 583e48cd6e362232476fb81f
             * title : 古诗都被你们玩坏了。。。
             * img : http://www.zbjuran.com/uploads/allimg/161130/10-161130110GJ10.jpg
             * type : 2
             * ct : 2016-11-30 11:34:37.653
             */

            private String id;
            private String title;
            private String img;
            private int type;
            private String ct;
            @Bindable
            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
                notifyPropertyChanged(BR.id);
            }
            @Bindable
            public String getTitle() {
                return title;

            }

            public void setTitle(String title) {
                this.title = title;
                notifyPropertyChanged(BR.title);
            }
            @Bindable
            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
                notifyPropertyChanged(BR.img);
            }
            @Bindable
            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
                notifyPropertyChanged(BR.type);
            }
            @Bindable
            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
                notifyPropertyChanged(BR.ct);
            }
        }
    }
}
