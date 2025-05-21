package STB.F7.clase;

public class BiletSfAndrei extends BiletDecorat {
    public BiletSfAndrei(Bilet bilet) {
        super(bilet);
    }

    @Override
    void mesajSpecial() {
        System.out.println("Sf. Andrei fericit! :o");
    }
}
