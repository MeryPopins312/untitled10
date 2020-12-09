package com.company;

public class Store implements Printable {
    private String name;
    private int quality;

    public Store(String name, int quality) {
        this.name = name;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void print() {
        System.out.println("Name: "+name+" quality:"+quality);
    }
}
