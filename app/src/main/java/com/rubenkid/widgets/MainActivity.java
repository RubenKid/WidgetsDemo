package com.rubenkid.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize List with Widgets
        final ListView listview = (ListView) findViewById(R.id.widgets_list);
        final ArrayAdapter<Widgets> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Widgets.values());
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(Widgets.values()[position]) {
                    case NEW_UPDATES_BUTTON:
                        startActivity(new Intent(MainActivity.this, NewArticlesButtonActivity.class));
                        break;
                }
            }
        });
    }

    public enum Widgets {
        NEW_UPDATES_BUTTON("New Updates Button");
        private String displayName;

        Widgets(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return displayName;
        }
    }
}
