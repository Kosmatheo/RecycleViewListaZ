package com.example.listazakupowrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ZakupyAdapter extends RecyclerView.Adapter<ZakupyAdapter.ProduktViewHolder> {
    private ArrayList<Produkt> listaZakupow;
    private LayoutInflater inflater;

    public ZakupyAdapter(Context context, ArrayList<Produkt> listaZakupow) {
        this.listaZakupow = listaZakupow;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProduktViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.product_layout,parent, false);
        return new ProduktViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduktViewHolder holder, int position) {
        holder.checkBoxProdukt.setText(listaZakupow.get(position).toString());
        holder.checkBoxProdukt.setChecked(listaZakupow.get(position).isKupione());
    }

    @Override
    public int getItemCount() {
        return listaZakupow.size();
    }


    public class ProduktViewHolder extends RecyclerView.ViewHolder implements CompoundButton.OnCheckedChangeListener {
        CheckBox checkBoxProdukt;
        ZakupyAdapter zakupyAdapter;

        public ProduktViewHolder(@NonNull View itemView, ZakupyAdapter adapter) {
            super(itemView);
            zakupyAdapter = adapter;
            checkBoxProdukt = itemView.findViewById(R.id.checkBoxProdukt);
            checkBoxProdukt.setOnCheckedChangeListener(this);
        }

        @Override
        public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
            int indeksProduktu = getLayoutPosition();
            listaZakupow.get(indeksProduktu).setKupione(b);
        }
    }
}
