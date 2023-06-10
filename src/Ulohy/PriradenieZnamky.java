package Ulohy;

import java.util.Scanner;

//Úloha 1: Program na priradenie známky
//
//Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
//Ak je percento nad 90, tak vypíše známku A
//Ak je percento nad 75, tak vypíše známku B
//Ak je percento nad 65, tak vypíše známku C
//Použite metódu pre rozhodovanie.
public class PriradenieZnamky {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("percenta zo skusky ");
        int x = console.nextInt();

        if (x > 90) {
            System.out.print("A");
        } else if (x > 75) {
            System.out.print("B");
        } else if (x > 65) {
            System.out.print("C");
        } else
            System.out.println("neuspel");




    }
}



