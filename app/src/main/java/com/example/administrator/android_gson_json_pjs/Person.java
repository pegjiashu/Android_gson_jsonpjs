package com.example.administrator.android_gson_json_pjs;


    import java.util.ArrayList;

    public class Person {
        private  String reason;
        private Result result = new Result();
        private String error_code;
        public String getReason() {
            return reason;
        }
        public void setReason(int id) {
            this.reason = reason;
        }
        public Result getResult() {
            return result;
        }
        public void setResult(Result  result) {
            this.result = result;
        }
        public String getError_code() {
            return error_code;
        }
        public void setError_code(String error_code) {
            this.error_code = error_code;
        }
        public String toString() {
            return "Person [reason=" + getReason() + ", \n result=" + getResult() + ", \n error_code=" + getError_code() + "]";
        }


        public  static  class Result {
            private ArrayList<Data> data = new ArrayList<Data>();

            public ArrayList<Data> getData() {
                return data;
            }

            public void setData(ArrayList<Data> data) {
                this.data = data;
            }
            public String toString() {
                return "result [data=" + data + "]";
            }


            public  static  class Data {

                private String content;
                private String hashId;
                private int unixtime;
                private String updatetime;

                public Data() {
                    super();
                }

                public Data(String content, String hashId, int unixtime, String updatetime) {
                    super();
                    this.content = content;
                    this.hashId = hashId;
                    this.unixtime = unixtime;
                    this.updatetime = updatetime;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(int id) {
                    this.content = content;
                }

                public String getHashId() {
                    return hashId;
                }

                public void setHashId(String hashId) {
                    this.hashId = hashId;
                }

                public int getUnixtime() {
                    return unixtime;
                }

                public void setUnixtime(String address) {
                    this.unixtime = unixtime;
                }

                public String getUpdatetime() {
                    return updatetime;
                }

                public void setUpdatetime(String updatetime) {
                    this.updatetime = updatetime;
                }

                @Override
                public String toString() {
                    return "data [content=" + getContent() + ", \n hashId=" + getHashId() + ", \n unixtime=" + getUnixtime()
                            + ", \n updatetime=" + getUpdatetime() + "]";
                }
            }
        }

    }