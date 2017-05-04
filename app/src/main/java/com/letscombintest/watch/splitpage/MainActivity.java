package com.letscombintest.watch.splitpage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ListView list;
    private String[] family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);

        LinearLayout linearLayoutMain = (LinearLayout)inflater.inflate(R.layout.main,null);
        LinearLayout linearLayoutTop = (LinearLayout)inflater.inflate(R.layout.top,null);
        LinearLayout linearLayoutbottom = (LinearLayout)inflater.inflate(R.layout.bottom,null);

        linearLayoutMain.addView(linearLayoutTop);
        linearLayoutMain.addView(linearLayoutbottom);

        setContentView(linearLayoutMain);

        family = getResources().getStringArray(R.array.family);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,family);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(arrayAdapter);
    }

}
