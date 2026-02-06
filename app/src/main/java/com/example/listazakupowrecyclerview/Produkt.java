package com.example.listazakupowrecyclerview;

import androidx.annotation.NonNull;

public class Produkt {
    String nazwaProduktu;
    boolean kupione;

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public boolean isKupione() {
        return kupione;
    }

    public void setKupione(boolean kupione) {
        this.kupione = kupione;
    }

    public Produkt(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        kupione = false;
    }

    @NonNull
    @Override
    public String toString() {
        return nazwaProduktu;
    }
}
