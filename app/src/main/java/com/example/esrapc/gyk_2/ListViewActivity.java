package com.example.esrapc.gyk_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    List<Person> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        iniatilize();
    }

    private void iniatilize() {
        arrayList = new ArrayList<>();
        arrayList.add(new Person(true, "Esra", "https://twitter.com/esramertturk"));
        arrayList.add(new Person(true, "Buse", "https://twitter.com/busegizemd"));
        arrayList.add(new Person(false, "Ahmet", "https://twitter.com/ahmet"));
        arrayList.add(new Person(true, "Sedanur", "https://twitter.com/sedanursurmen"));
        arrayList.add(new Person(false, "Ronaldo", "https://twitter.com/cristiano"));
        arrayList.add(new Person(false, "Kıvanç", "https://twitter.com/kivanctatlitug"));
        arrayList.add(new Person(true, "Seda", "https://twitter.com/sedaaggez"));
        arrayList.add(new Person(true, "Buse", "https://twitter.com/busegizemd"));
        arrayList.add(new Person(false, "Ahmet", "https://twitter.com/ahmet"));
        arrayList.add(new Person(true, "Sedanur", "https://twitter.com/sedanursurmen"));
        arrayList.add(new Person(false, "Ronaldo", "https://twitter.com/cristiano"));
        arrayList.add(new Person(false, "Kıvanç", "https://twitter.com/kivanctatlitug"));
        arrayList.add(new Person(true, "Seda", "https://twitter.com/sedaaggez"));

        ListView personListView = findViewById(R.id.peoplelistview);
        CustomAdapter adapter = new CustomAdapter(ListViewActivity.this, arrayList);
        personListView.setAdapter(adapter);

        personListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(arrayList.get(position).getAccountname()));
                startActivity(browserIntent);
            }
        });
    }
}
