package STB.F5.clase;

public class UsaMijloc extends Usa{
    @Override
    public void toggleModLiber() {
        if(super.modLiber){
            System.out.println("Se opreste modul liber pentru usa din mijloc.");
            super.modLiber = false;
        }
        else{
            System.out.println("Se porneste modul liber pentru usa din mijloc.");
            super.modLiber = true;
        }
    }

    @Override
    public void toggleDeschisFortat() {
        if(super.deschisFortat){
            System.out.println("Se inchide fortat usa din mijloc.");
            super.deschisFortat = false;
        }
        else{
            System.out.println("Se deschide fortat usa din mijloc.");
            super.deschisFortat = true;
        }
    }
}
