package org.example;

public class Main {
    public static void main(String[] args) {

        Printable[] b = new Printable[3];
        b[0] = new Book();
        b[1]=new Magazine();
        b[2]=new Book();

        for (Printable bo: b){
            bo.print();
        }

    }
}