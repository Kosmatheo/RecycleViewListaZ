package com.example.listazakupowrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ZakupyAdapter zakupyAdapter;
    private ArrayList<Produkt> listaZakopowArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        recyclerView = findViewById(R.id.recyc);
        listaZakopowArrayList.add(new Produkt("mąka"));
        listaZakopowArrayList.add(new Produkt("mleko"));
        listaZakopowArrayList.add(new Produkt("cukier"));
        listaZakopowArrayList.add(new Produkt("cynamon"));
        listaZakopowArrayList.add(new Produkt("drożdże"));
        listaZakopowArrayList.add(new Produkt("drożdże"));
        listaZakopowArrayList.add(new Produkt("drożdże"));
        listaZakopowArrayList.add(new Produkt("drożdże"));
        listaZakopowArrayList.add(new Produkt("drożdże"));
        listaZakopowArrayList.add(new Produkt("drożdże"));
        listaZakopowArrayList.add(new Produkt("drożdże"));
        zakupyAdapter = new ZakupyAdapter(MainActivity.this , listaZakopowArrayList);
        recyclerView.setAdapter(zakupyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }
}
