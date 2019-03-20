package com.company;

import com.company.Task1.Car;
import com.company.Task1.Plane;
import com.company.Task1.Ship;
import com.company.Task1.Vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Vehicle Plane = new Plane("42.2334, 53.3242, 73.2344", "432ml","900",1995,"9km",200 );
        Vehicle Ship = new Ship("42.6543, 86.3356, 97.2124", "20ml","50oz",2012,50,424);
        Vehicle Car = new Car("93.2343, 86.7656, 34.2753", "100k","200km/h",2015,"Toyota",5);

        System.out.println(Plane);
        System.out.println(Ship);
        System.out.println(Car);
        */
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Please enter the key: " +
                "\n" + "1: Pro" +
                "\n" + "2: Expert" +
                "\n" + "3: Default");
        while (flag) {
            String key = scanner.nextLine();
            switch (key) {
                case "Pro": {
                    DocumentWorker document1 = new ProDocumentWorker();
                    System.out.print(document1.OpenDocument() + "\n");
                    System.out.print(document1.EditDocument() + "\n");
                    System.out.print(document1.SaveDocument() + "\n");
                    break;
                }
                case "Expert": {
                    DocumentWorker document2 = new ExpertDocumentWorker();
                    System.out.print(document2.OpenDocument() + "\n");
                    System.out.print(document2.EditDocument() + "\n");
                    System.out.print(document2.SaveDocument() + "\n");
                    break;
                }
                case "Default": {
                    DocumentWorker document3 = new DocumentWorker();
                    System.out.print(document3.OpenDocument() + "\n");
                    System.out.print(document3.EditDocument() + "\n");
                    System.out.print(document3.SaveDocument() + "\n");
                    break;
                }
            }
            flag = true;

        }


    }


}
