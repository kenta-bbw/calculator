package org.example;

import java.util.Scanner;

public class substraction {
    private int zahl1;
    private int zahl2;

    private double result;
    private String output;

    public void readIn(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Zahl 1:");
        zahl1=keyboard.nextInt();
        System.out.println("Zahl 2:");
        zahl2= keyboard.nextInt();
    }
    public void calculate(){
        result = zahl1-zahl2;
    }

    @Override
    public String toString() {
        return output += "The result is:"+zahl1 +" - "+ zahl2+ " = "+result;
    }
}
