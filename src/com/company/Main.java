package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("1").print();
        createObject("2").print();
        createObject("3").print();

    }

    public static Printable createObject(String number) {
        Printable print = null;
        switch (number) {
            case "1":
                print = new Product("Tomato", 5, "Помидор", "red");
                break;
            case "2":
                print=new Personnel("Cashier", 1, "Derik", "кассир");
                break;
            case "3":
                print=new Clothes("Clothes", 2, 38, "Dress");
                break;
        }return print;
    }
}
