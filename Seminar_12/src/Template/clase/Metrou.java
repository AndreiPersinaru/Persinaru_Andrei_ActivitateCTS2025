package Template.clase;

public class Metrou extends AMetrou{
    private int nrMetrou;

    public Metrou(int nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    @Override
    public void opresteStatia1() {
        System.out.println("Metroul " + nrMetrou + " a oprit la statia 1");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul " + nrMetrou + " a oprit la statia 2");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Metroul " + nrMetrou + " a oprit la statia 3");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul " + nrMetrou + " a oprit la statia 4");
    }

    @Override
    public void opresteStatia5() {
        System.out.println("Metroul " + nrMetrou + " a oprit la statia 5");
    }
}
