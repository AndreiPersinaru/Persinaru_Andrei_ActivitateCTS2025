package STB.F5.clase;

public class Facade {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public Facade(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void toggleAllModLiber(){
        usaFata.toggleModLiber();
        usaMijloc.toggleModLiber();
        usaSpate.toggleModLiber();
    }

    public void toggleAllDeschidereFortata(){
        usaFata.toggleDeschisFortat();
        usaMijloc.toggleDeschisFortat();
        usaSpate.toggleDeschisFortat();
    }
}
