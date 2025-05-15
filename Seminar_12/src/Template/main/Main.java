package Template.main;

import Template.clase.AMetrou;
import Template.clase.Metrou;
import Template.clase.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrou = new Metrou(1);
        metrou.circulaTur();
        System.out.println("----");
        metrou.circulaRetur();

        System.out.println("\n");
        AMetrou metrouSpecial = new MetrouSpecial();
        metrouSpecial.circulaTur();
        System.out.println("----");
        metrouSpecial.circulaRetur();
    }
}
