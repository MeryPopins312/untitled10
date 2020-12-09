package com.company;

public class Product extends Store implements Printable {
    private String prodName;
    private String color;

    public Product(String name, int quality,String prodName,String color) {
        super(name, quality);
        this.color=color;
        this.prodName=prodName;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Name:"+prodName+" color :"+color);
    }
}
