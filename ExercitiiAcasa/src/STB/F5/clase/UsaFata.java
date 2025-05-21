package STB.F5.clase;

public class UsaFata extends Usa{
    @Override
    public void toggleModLiber() {
        if(super.modLiber){
            System.out.println("Se opreste modul liber pentru usa din fata.");
            super.modLiber = false;
        }
        else{
            System.out.println("Se porneste modul liber pentru usa din fata.");
            super.modLiber = true;
        }
    }

    @Override
    public void toggleDeschisFortat() {
        if(super.deschisFortat){
            System.out.println("Se inchide fortat usa din fata.");
            super.deschisFortat = false;
        }
        else{
            System.out.println("Se deschide fortat usa din fata.");
            super.deschisFortat = true;
        }
    }
}
