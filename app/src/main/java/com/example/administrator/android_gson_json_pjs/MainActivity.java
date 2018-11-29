package com.example.administrator.android_gson_json_pjs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {

    private Button button;
    private static final String TAG = "MainActivity";
    private static final String path = "http://v.juhe.cn/joke/content/list.php?key=c037fdc5bbb9e640d6b5a701dcb11441%20&page=1&pageSize=10&sort=asc&time=1418745237";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    //点击按钮，开始使用Gson解析Json数据：Person对象、List嵌套的Person对象的集合
    public void onClick(final View v) {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                switch (v.getId()) {
                    case R.id.button:
                        String jsonString1 = HttpUtils.getJsonContent(path);//从网络获取数据
                        Person person = GsonTools.getData(jsonString1, Person.class);//解析json数据
                        //Log.i(TAG, person.toString());
                        System.out.println(person.toString());
                        break;
                }

            }
        });
        thread.start();

    }

}