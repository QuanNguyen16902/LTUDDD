package com.android3.myapplication.Tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android3.myapplication.R;

import java.util.ArrayList;

public class T3Adapter extends BaseAdapter {

    private ArrayList<T3Contact> ls;
    private Context context;

    public T3Adapter(ArrayList<T3Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }



    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX vax;
        //neu chua co view thi tao view moi
        if(convertView==null){
            vax = new ViewAX();
            //anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan3_listview_item,null);
            //anh xa tung thanh phan trong layout
            vax.img_hinh = convertView.findViewById(R.id.t3ItemHinh);
            vax.tv_ten = convertView.findViewById(R.id.t3ItemTen);
            vax.tv_tuoi = convertView.findViewById(R.id.t3ItemTuoi);
            //tao template de lan sau su dung

            convertView.setTag(vax);
        }
        // neu da co view su dung lai view cu
        else{
            vax = (ViewAX) convertView.getTag();//lay view cu
        }
        //gan du lieu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());

        return convertView; // tra ve ket qua
    }

    class ViewAX{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;
    }
}
