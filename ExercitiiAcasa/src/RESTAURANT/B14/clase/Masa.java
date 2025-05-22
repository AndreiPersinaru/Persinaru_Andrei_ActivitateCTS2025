package RESTAURANT.B14.clase;

public class Masa extends Template{

    @Override
    protected void curataMasa() {
        System.out.println("Curata masa");
    }

    @Override
    protected void puneServetele() {
        System.out.println("Pune servetelele.");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Aseaza tacamuri");
    }

    @Override
    protected void cheamaClientii() {
        System.out.println("Cheama clientii");
    }
}
