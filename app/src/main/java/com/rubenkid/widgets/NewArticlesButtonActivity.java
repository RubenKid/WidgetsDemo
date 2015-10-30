package com.rubenkid.widgets;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class NewArticlesButtonActivity extends BaseActivity {

    List<String> fruits = Arrays.asList("Apple", "Banana", "Pear",
            "Blueberry", "Fig", "Lemon", "Orange", "Peach",
            "Blackberry", "Strawberry", "Kiwi", "Papaya", "Mango", "Avocado",
            "Grape", "Melon", "Watermelon", "Grenade");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_articles_button);

        //Initialize List with fruits
        final ListView listview = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, fruits);
        listview.setAdapter(adapter);
    }

    @Override
    protected String getActionBarTitle() {
        return MainActivity.Widgets.NEW_UPDATES_BUTTON.toString();
    }
}
