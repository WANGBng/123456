package com.bwie.bean;

import java.util.List;

/**
 * Created by wang on 2018/8/25.
 */

public class BannerBean {

    /**
     * code : 200
     * body : {"result":[{"BarnerPic":"https://yunxue-bucket.oss-cn-shanghai.aliyuncs.com/imgurl/banner/banner_1534744481374.jpg","BarnerName":"企业大学上线","BarnerType":1,"JumpType":0,"Url":"http://yunxuekeji.com/"},{"BarnerPic":"https://yunxue-bucket.oss-cn-shanghai.aliyuncs.com/imgurl/banner/banner_1533267193841.jpg","BarnerName":"从跟风者到破风手，你要了解的八大创新原则","BarnerType":1,"JumpType":1,"Url":"1357"},{"BarnerPic":"https://yunxue-bucket.oss-cn-shanghai.aliyuncs.com/imgurl/banner/banner_1533266571976.jpg","BarnerName":"《销售技巧》：业务员没客户的7大原因","BarnerType":1,"JumpType":1,"Url":"1356"}]}
     * message : Succes!
     */

    private int code;
    private BodyBean body;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class BodyBean {
        private List <ResultBean> result;

        public List <ResultBean> getResult() {
            return result;
        }

        public void setResult(List <ResultBean> result) {
            this.result = result;
        }

        public static class ResultBean {
            /**
             * BarnerPic : https://yunxue-bucket.oss-cn-shanghai.aliyuncs.com/imgurl/banner/banner_1534744481374.jpg
             * BarnerName : 企业大学上线
             * BarnerType : 1
             * JumpType : 0
             * Url : http://yunxuekeji.com/
             */

            private String BarnerPic;
            private String BarnerName;
            private int BarnerType;
            private int JumpType;
            private String Url;

            public String getBarnerPic() {
                return BarnerPic;
            }

            public void setBarnerPic(String BarnerPic) {
                this.BarnerPic = BarnerPic;
            }

            public String getBarnerName() {
                return BarnerName;
            }

            public void setBarnerName(String BarnerName) {
                this.BarnerName = BarnerName;
            }

            public int getBarnerType() {
                return BarnerType;
            }

            public void setBarnerType(int BarnerType) {
                this.BarnerType = BarnerType;
            }

            public int getJumpType() {
                return JumpType;
            }

            public void setJumpType(int JumpType) {
                this.JumpType = JumpType;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }
        }
    }
}
