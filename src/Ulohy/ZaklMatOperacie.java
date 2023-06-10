package Ulohy;
//Úloha 1: Základné matematické operácie
        //      Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
       // Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.

        //Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
       // Program nám zároveň vypíše takýto text:
        //Výsledkom sčítania hodnôt 2 a 3 je 5.
        //Výsledkom odčítania hodnôt 2 a 3 je -1.
        //atď.
       // Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?
       // Pomôcka:
// Ako naformatovat cislo v SK formate na 2 desatinne miesta, pouzijeme %.2f
       // System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneCislo);
        //Bonusová úloha č.2: Vstup hodnôt by mohol byť cez konzolu, čiže Scanner.


public class ZaklMatOperacie {

    public static void main(String[] args) {
    double c1=2,c2=3;


        System.out.println("Vysledok nasobenia je "+ (c1*c2));
        System.out.println("Vysledok delenia je "+ (c1/c2));
        System.out.println("Vysledok scitania je "+ (c1+c2));
        System.out.println("Vysledok odcitania je "+ (c1-c2));
        System.out.println("Vysledok modulu je "+ (c1%c2));
        System.out.printf("premana des. cisla %.2f",(c1/c2));
// druha varianta od lektora
        double scitanie = c1 + c2;
        double odcitanie = c1 - c2;
        double nasobenie = c1 * c2;
        double delenie = c1 / c2;
        double modulo = c1 % c2; // % reprezentuje zvysok po deleni, cize modulo



        System.out.println("\nVýsledkom sčítania hodnôt " + c1 + " a " + c2 + " je " + scitanie);
        System.out.println("Výsledkom odčítania hodnôt " + c1 + " a " + c2 + " je " + odcitanie);
        System.out.println("Výsledkom násobenia hodnôt " + c1 + " a " + c2 + " je " + nasobenie);
        System.out.println("Výsledkom delenia hodnôt " + c1 + " a " + c2 + " je " + delenie);
        System.out.println("Výsledkom modula hodnôt " + c1 + " a " + c2 + " je " + modulo);


        // Odcitanie so zaokruhlenim, resp. vypisanim do konzoly spolu so zaokruhlenim
        // Namiesto %.2f co reprezentuje cislo zaokruhlene na 2 desatinne cisla mozeme pouzit ine cislo, napr. %.1f
        // co zaokruhli cislo v konzole na 1 desatine miesto
        System.out.printf("\nVýsledkom sčítania hodnôt " + c1 + " a " + c2 + " je " + scitanie);
        System.out.printf("\nVýsledkom odčítania hodnôt %.2f a %.2f je %.2f ", c1, c2, odcitanie);
        System.out.printf("\nVýsledkom násobenia hodnôt " + c1 + " a " + c2 + " je " + nasobenie);
        System.out.printf("\nVýsledkom delenia hodnôt " + c1 + " a " + c2 + " je " + delenie);
        System.out.printf("\nVýsledkom modula hodnôt " + c1 + " a " + c2 + " je " + modulo);

        // Escape Characters:
        // \n reprezentuje dalsi riadok
        // \t reprezentuje tabulator
        // \' reprezentuje apostrof
        // TODO Zobrazit akykolvek text, v ktorom sa nachadzaju uvodzovky.
        // TODO Priklad - vypíš do konzoly tento text: Táto hora je "vraj" najvyššia!

        System.out.println("\nTáto hora je \'vraj\' najvyššia ");
    }
}
