package com.gurjeet.customelistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends BaseAdapter {

    private ArrayList<Country> countries;
    private LayoutInflater inflater;//we need this to link with the row_list.xml

    //constructor
    public CountryAdapter(Context context, ArrayList<Country> countries) {
        this.countries = countries;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //here we are creating the view
        ViewHolder holder;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.list_row,null); //here we linked listview of this class
            holder=new ViewHolder();
            holder.name=convertView.findViewById(R.id.txvCountry);
            holder.capital=convertView.findViewById(R.id.txvCapital);
            holder.flag=convertView.findViewById(R.id.flag);
            convertView.setTag(holder);
        }else
            holder=(ViewHolder)convertView.getTag();
        holder.name.setText(countries.get(position).getCountryName());
        holder.capital.setText(countries.get(position).getCapitalCity());
        holder.flag.setImageResource(countries.get(position).getFlagImage());

        return convertView;
    }

    static class ViewHolder{
        //create attributes that match the components of list_row.xml
        private TextView name,capital;
        private ImageView flag;

    }



}
