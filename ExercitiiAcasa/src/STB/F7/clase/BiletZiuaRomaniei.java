package STB.F7.clase;

public class BiletZiuaRomaniei extends BiletDecorat{

    public BiletZiuaRomaniei(Bilet bilet) {
        super(bilet);
    }

    @Override
    void mesajSpecial() {
        System.out.println("La multi ani! ;)");
    }
}
