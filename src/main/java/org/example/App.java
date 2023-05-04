package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        while (true){
            Scanner operatorscaner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Was wollen sie machen?");
            System.out.println("Wählen sie zwischen Addition/ Substraction/ Multiplication/ Division");

            String operator = operatorscaner.nextLine();

            if (operator.equals("Addition")) {
                addition Additionnumber = new addition();
                Additionnumber.readIn();
                Additionnumber.calculate();
                System.out.println(Additionnumber);
            }

            else if (operator.equals("Division")) {
                division Division = new division();
                Division.readIn();
                Division.calculate();
                System.out.println(Division);
            }
            else if (operator.equals("Substraction")) {
                substraction Substractionfunction = new substraction();
                Substractionfunction.readIn();
                Substractionfunction.calculate();
                System.out.println(Substractionfunction);
            }
            else if (operator.equals("Multiplication")) {
                multiplication multiplicationNumber = new multiplication();
                multiplicationNumber.readIn();
                multiplicationNumber.calculate();
                System.out.println(multiplicationNumber);
            } else {
                System.out.println("kein Operater");
            }
        }
    }
}

