package com.example.examentoms;

import java.util.ArrayList;
import java.util.List;

// 4.a - Java
public class Naranjas {
    private int periodo;
    private String variedad;
    private double diametro;

    public Naranjas(int minuto, String variedad, double diametro) {
        this.periodo = minuto;
        this.variedad = variedad;
        this.diametro = diametro;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Naranjas{" +
                "periodo=" + periodo +
                ", variedad='" + variedad + '\'' +
                ", diametro=" + diametro +
                '}';
    }

    // 4.b - Java
    public static List<Naranjas> creaLista(List<Integer> minutos, List<String> variedades, List<Double> diametros){
        List<Naranjas> lista = new ArrayList<>();
        for (int i = 0; i < variedades.size(); i++) {
            lista.add(new Naranjas(minutos.get(i+1)- minutos.get(i), variedades.get(i), diametros.get(i)));
        }
        return lista;
    }
}
