package STB.F5.clase;

public abstract class Usa {
    protected boolean modLiber;
    protected boolean deschisFortat;

    public Usa() {
        this.modLiber = false;
        this.deschisFortat = false;
    }

    public abstract void toggleModLiber();
    public abstract void toggleDeschisFortat();
}
