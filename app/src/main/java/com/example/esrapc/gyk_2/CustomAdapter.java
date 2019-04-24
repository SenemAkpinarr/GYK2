package com.example.esrapc.gyk_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<Person> personList;

    public CustomAdapter(Context context, List<Person> pList){
        this.context = context;
        this.personList = pList;
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.list_view_item, null);

        ImageView imageView = view.findViewById(R.id.listimage);
        TextView userTxt = view.findViewById(R.id.username);
        TextView accountTxt = view.findViewById(R.id.accountname);

        userTxt.setText(personList.get(position).getUsername());
        accountTxt.setText(personList.get(position).getAccountname());
        imageView.setImageResource(personList.get(position).isGender() ? R.drawable.woman : R.drawable.man);

       /* if (personList.get(position).isGender())
            imageView.setImageResource(R.drawable.woman);
        else
            imageView.setImageResource(R.drawable.man);*/

        return view;
    }
}