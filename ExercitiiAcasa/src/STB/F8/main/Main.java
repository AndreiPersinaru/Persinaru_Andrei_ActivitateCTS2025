package STB.F8.main;

import STB.F8.clase.Autobuz;
import STB.F8.clase.AutobuzNoapte;
import STB.F8.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz();
        autobuz.oprireStatii(5);
        IAutobuz autobuzDeNoapte = new AutobuzNoapte(autobuz);
        autobuzDeNoapte.oprireStatii(5);
        autobuzDeNoapte.oprireStatii(0);
    }
}
