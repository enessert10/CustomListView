package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvProducts;
    ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProducts=(ListView) findViewById(R.id.lvProducts);
        list = new ArrayList<Product>();

        list.add(new Product("Dell Latitude 3500",
                "DELL SPECTRE x360 13-AP0002NT 6AV77EA  i7-8565U/8GB/512GB NVMe M.2 SSD PREMIUM NOTEBOOK",
                "laptop",1554.60,true));
        list.add(new Product("Hp",
                "HP 15-DB0002NT 4JU37EA Amd A9-9425 3.1 Ghz 4GB 1TB Amd Radeon 520 15.6 Notebook",
                "screen",1740.60,true));
        list.add(new Product("Sandisk USB 32 GB",
                "Vpw Sta-Usb004 Micro Usb Charger And Data Transfer Cable",
                "memory",90.00,false));
        list.add(new Product("Toshiba HDD",
                "Toshiba 2.5 '' 1TB SATA 3.0 128MB Cache 5400Rpm Harddisk",
                "hdd",150.00,false));


        ProductAdapter adapter = new ProductAdapter(this,list);
        lvProducts.setAdapter(adapter);
    }
}
