package STB.F4.clase;

public class AdapterTransport extends TransportTerestru {
    private TransportSubteran transportSubteran;

    public AdapterTransport(TransportSubteran transportSubteran) {
        this.transportSubteran = transportSubteran;
    }

    @Override
    public void validareBilet() {
        super.validareBilet();
    }
}
