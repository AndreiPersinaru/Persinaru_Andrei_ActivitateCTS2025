package STB.F5.main;

import STB.F5.clase.*;
public class Main {
    public static void main(String[] args) {
        UsaFata usaFata = new UsaFata();
        UsaMijloc usaMijloc = new UsaMijloc();
        UsaSpate usaSpate = new UsaSpate();

        usaFata.toggleModLiber();
        usaFata.toggleModLiber();
        usaSpate.toggleDeschisFortat();
        usaSpate.toggleDeschisFortat();

        Facade facade = new Facade(usaFata, usaMijloc, usaSpate);
        System.out.println("Facade: ");
        facade.toggleAllDeschidereFortata();
        facade.toggleAllModLiber();
        facade.toggleAllDeschidereFortata();
        facade.toggleAllModLiber();
    }
}
