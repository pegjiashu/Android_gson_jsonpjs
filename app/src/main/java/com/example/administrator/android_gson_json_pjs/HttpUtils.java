package com.example.administrator.android_gson_json_pjs;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


//通过HttpURLCnnection获取链接里的数据，放到流里，然后把流里面的数据转换为字符串（借鉴于：老罗老版本1-04）
public class HttpUtils {

        public HttpUtils() {
            // TODO Auto-generated constructor stub
        }

        public static String getJsonContent(String url_path) {
            try {
                URL url = new URL(url_path);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                conn.setRequestMethod("GET");
                conn.setReadTimeout(5000);
                conn.setConnectTimeout(5000);

                if (conn.getResponseCode() == 200) {
                    InputStream is = conn.getInputStream();
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = is.read(buf)) != -1) {
                        baos.write(buf, 0, len);
                    }
                    byte[] array = baos.toByteArray();
                    return new String(array, "UTF-8");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }