// Zadanie na program:
// Vypíšte do konzoly nasledujúci text:
//
//  Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do
//  nového zamestnania ako Java programátor.
//  V Bratislave dňa 18.06.2022

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class PrikladNaPremenne {
    public static void main(String[] args) {
        String name = " Jozef Mrkvicka ";
        double DatNar = 03.04;
        int rok1=2000;
        double znamka= 1.5;
        String od =" sep ";
        int rok =2022;
        System.out.println("student "+name+" narodeny "+DatNar +"."+rok1 +" ma z maturitnej skusky znamku "+znamka+" od "+od +" nastupi od noveho roka ako java prog."+rok  );

        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Študent " + name+" "+ " sa narodil " + DatNar +"."+rok1+ ", z maturitnej skúšky má známku " + znamka + " a od " + od + " nastúpi do nového zamestnania ako Java programátor.");

        System.out.println("V Bratislave dňa " + formatDatumu.format(datum));
        LocalDate localDate = LocalDate.of( 2014 , Month.FEBRUARY , 11 ); // Naplnime premennu localDate konkretnym datumom
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        System.out.println("Vypisujem localDate: " + localDate.format(formatter));

        LocalDate LocalDate = localDate.of(2014, Month.FEBRUARY,11);

        // TODO vypiste znamku v slov,cize desatinna ciarka
        System.out.printf("student dostal znamku %.2f",znamka);
    }
}