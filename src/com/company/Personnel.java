package com.company;

public class Personnel extends Store implements Printable {
    private String namePer;
    private String work;

    public Personnel(String name, int quality,String namePer,String work) {
        super(name, quality);
        this.namePer=namePer;
        this.work=work;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Name: "+namePer+" work:"+work);

    }
}
