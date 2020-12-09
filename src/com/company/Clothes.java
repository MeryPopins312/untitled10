package com.company;

public class Clothes extends Store implements Printable{
    private int size;
    private String nameClo;

    public Clothes(String name, int quality,int size,String nameClo) {
        super(name, quality);
        this.nameClo=nameClo;
        this.size=size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Size: "+size+" Name: "+nameClo);

    }
}
