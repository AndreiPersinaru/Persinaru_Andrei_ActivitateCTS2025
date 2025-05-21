package STB.F8.clase;

public class Autobuz implements IAutobuz{

    @Override
    public void oprireStatii(int nrPersoane) {
        System.out.println("Autobuzul are " + nrPersoane + " persoane in el. Opreste in statie.");
    }
}
