package Ulohy;

import java.util.Scanner;

public class ZakladMatOperCezMetody{
    //metody ulozim nad medodu main
    public static double scitaj(double c1, double c2){
        // Predtym ako vratim vysledok scitania, tak mozem urobit s tymi hodnotami nieco "naviac"
        // To znamena, ze pouzijem nejaku aplikacnu logiku
        return c1+c2;
    }
    public static double modul(double c1, double c2){
        return c1 % c2;
    }
    public static double delene(double c1, double c2){
        return c1/c2;
    } public static double krat(double c1, double c2){
        return c1*c2;
    } public static double odcitaj(double c1, double c2){
        return c1-c2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("cadaj prve cislo (Potvrdit: ENTRE)");
        //inicializacia  scaner pre vstup z konzoli
                double c1= sc.nextDouble(); //pre konkretny pouzivatelsky vstup (destatiny) pouzijeme metodu nextDouble
        System.out.print("cadaj prve cislo (Potvrdit: ENTRE)");
        double c2= sc.nextDouble();


        double sum = scitaj(c1,c2);
        System.out.printf("\nvysledkom scitania je %.2f a %.2f je: %.2f ",c1,c2,sum);
        double  modul =modul(c1,c2);
        System.out.printf("\nvysledok modulu je %.2f a %.2f je: %.2f",c1,c2,modul);
        double  delene =delene(c1,c2);
        System.out.printf("\nvysledok delenia je %.2f a %.2f je: %.2f",c1,c2,delene);
    }
        }
