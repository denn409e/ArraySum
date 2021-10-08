package com.company;

public class Dyr {

    int antalBen = 4;
    double kropsTempartur = 37;
    boolean levende = true;
    String navn = "John";

    public Dyr(int antalBen){
        this.antalBen = antalBen;
    }
    public Dyr(double kropsTempartur){
        this.kropsTempartur = kropsTempartur;
    }
    public Dyr(boolean levende){
        this.levende = levende;
    }
    public Dyr(String navn){
        this.navn = navn;
    }

    public static void main(String[] args) {

        Dyr x1 = new Dyr(4);
        Dyr x2 = new Dyr(true);
        Dyr x3 = new Dyr("Michael");
    }
}


