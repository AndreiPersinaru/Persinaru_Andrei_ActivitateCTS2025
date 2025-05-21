package STB.F7.clase;

public abstract class BiletDecorat implements Bilet{
    private Bilet bilet;

    public BiletDecorat(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
        mesajSpecial();
    }

    abstract void mesajSpecial();
}
