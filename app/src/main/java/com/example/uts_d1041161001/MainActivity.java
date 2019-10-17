package com.example.uts_d1041161001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKomponen;
    private ArrayList<Komponen> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKomponen = findViewById(R.id.rv_komponen);
        rvKomponen.setHasFixedSize(true);

        list.addAll(KomponenData.getListData());
        showRecyclerList();
    }



    private void showRecyclerList() {
        rvKomponen.setLayoutManager(new LinearLayoutManager(this));
        ListKomponenAdapter listKomponenAdapter = new ListKomponenAdapter(list);
        rvKomponen.setAdapter(listKomponenAdapter);

        listKomponenAdapter.setOnItemClickCallback(new ListKomponenAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Komponen data) {
                showSelectedKomponen(data);
            }
        });

    }

    private void showSelectedKomponen(Komponen komponen){
        Toast.makeText(this,"kamu memilih " + komponen.getName(), Toast.LENGTH_SHORT).show();
        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
        detailIntent.putExtra(DetailActivity.EXTRA_NAME, komponen.getName());
        detailIntent.putExtra(DetailActivity.EXTRA_DETAIL, komponen.getDetail());
        detailIntent.putExtra(DetailActivity.EXTRA_CODE, komponen.getCode());
        detailIntent.putExtra(DetailActivity.EXTRA_LINK, komponen.getLink());

        startActivity(detailIntent);
    }
}
