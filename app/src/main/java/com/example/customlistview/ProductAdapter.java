package com.example.customlistview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

public class ProductAdapter extends ArrayAdapter<Product> {

    private final Context context;
    private final ArrayList<Product> values;

    public ProductAdapter(Context context, ArrayList<Product> list) {
        super(context,R.layout.row_layout,list);
        this.context = context;
        this.values = list;
    }

    @Nullable
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout,parent,false);

        TextView tvProduct = (TextView) rowView.findViewById(R.id.tvProduct);
        TextView tvPrice = (TextView) rowView.findViewById(R.id.tvPrice);
        TextView tvDescription = (TextView) rowView.findViewById(R.id.tvDescription);

        ImageView imgProduct = (ImageView)  rowView.findViewById(R.id.imgProduct);
        ImageView imgSale = (ImageView) rowView.findViewById(R.id.imgSale);

        tvProduct.setText(values.get(position).getTitle());
        tvPrice.setText("$" +values.get(position).getPrice());
        tvDescription.setText(values.get(position).getDescription());

        if(values.get(position).getSale())
        {
            imgSale.setImageResource(R.mipmap.on_sale_big);
        }
        else
        {
            imgSale.setImageResource(R.mipmap.best_price);
        }

        if(values.get(position).getType().equals("laptop"))
        {
            imgProduct.setImageResource(R.mipmap.laptop);
        }
        else if(values.get(position).getType().equals("hdd"))
        {
            imgProduct.setImageResource(R.mipmap.hdd);
        }
        else if(values.get(position).getType().equals("memory"))
        {
            imgProduct.setImageResource(R.mipmap.memory);
        }

        else
        {
            imgProduct.setImageResource(R.mipmap.screen);
        }


        return rowView;
    }
}
