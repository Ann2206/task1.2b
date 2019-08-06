package com.company;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Введите сумму денег в рублях" );
        int sumMoney = sc.nextInt ();

        if ( sumMoney <= 0 ) {
            System.out.println ( "Такого быть не может" );
        }else {

            switch (sumMoney % 100) {
                case (11):
                case (12):
                case (13):
                case (14):
                    System.out.println ( sumMoney + "рублей" );
                    break;
                default:
                    switch (sumMoney % 10) {
                        case (1):
                            System.out.println ( sumMoney + "рубль" );
                            break;
                        case (2):
                        case (3):
                        case (4):
                            System.out.println ( sumMoney + "рубля" );
                            break;
                        case (5):
                        case (6):
                        case (7):
                        case (8):
                        case (9):
                        case (0):
                            System.out.println ( sumMoney + "рублей" );
                            break;
                    }
            }
        }
    }
}