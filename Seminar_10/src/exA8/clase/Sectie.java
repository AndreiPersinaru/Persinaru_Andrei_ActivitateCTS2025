package exA8.clase;

public class Sectie implements IStructura{
    String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectia " + nume);
    }

    @Override
    public void adaugaNod(IStructura iStructura) throws Exception {
        throw new Exception("NU are implementata aceasta functie");
    }

    @Override
    public void stergeNod(IStructura iStructura) throws Exception {
        throw new Exception("NU are implementata aceasta functie");
    }

    @Override
    public IStructura getNodCopil(int index) throws Exception {
        throw new Exception("NU are implementata aceasta functie");
    }
}
