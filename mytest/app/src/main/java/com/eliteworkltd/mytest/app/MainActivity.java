package com.eliteworkltd.mytest.app;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.view.MenuItem;


public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取tabhost
        TabHost tabHost = (TabHost) this.findViewById(R.id.tabhost);
        tabHost.setup();//实例化了tabWidget和tabContent

        //第一个tab
        TabHost.TabSpec tabSpec01 = tabHost.newTabSpec("tab1"); //选项卡其实就是一个tabspec，获取一个新的TabHost.TabSpec，并关联到当前tabhost
        tabSpec01.setIndicator("first tab", this.getResources().getDrawable(R.drawable.ic_launcher));//往选项卡里添加东西
        tabSpec01.setContent(R.id.tab1_txt);

        //第二个tab
        TabHost.TabSpec tabSpec02 = tabHost.newTabSpec("tab2");
        tabSpec02.setIndicator("second tab", this.getResources().getDrawable(R.drawable.ic_launcher));
        tabSpec02.setContent(R.id.tab2_txt);

        //第三个tab
        TabHost.TabSpec tabSpec03 = tabHost.newTabSpec("tab3");
        tabSpec03.setIndicator("third tab", this.getResources().getDrawable(R.drawable.ic_launcher));
        tabSpec03.setContent(R.id.tab3_txt);

        tabHost.addTab(tabSpec01);
        tabHost.addTab(tabSpec02);
        tabHost.addTab(tabSpec03);

    }
}