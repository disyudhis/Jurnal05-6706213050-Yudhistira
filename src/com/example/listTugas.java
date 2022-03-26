package com.example;

public class listTugas {
    String namaTugas;

    public listTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    @Override
    public String toString() {
        return namaTugas;
    }
}
