package STB.F7.main;

import STB.F7.clase.Bilet;
import STB.F7.clase.BiletPrintat;
import STB.F7.clase.BiletSfAndrei;
import STB.F7.clase.BiletZiuaRomaniei;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new BiletPrintat();
        bilet.printareBilet();

        Bilet biletSpecial = new BiletZiuaRomaniei(bilet);
        biletSpecial.printareBilet();

        Bilet biletSiMaiSpecial = new BiletSfAndrei(biletSpecial);
        biletSiMaiSpecial.printareBilet();
    }
}
