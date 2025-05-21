package STB.F8.clase;

public class AutobuzNoapte implements IAutobuz{
    IAutobuz autobuz;

    public AutobuzNoapte(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void oprireStatii(int nrPersoane) {
        if(nrPersoane != 0){
            autobuz.oprireStatii(nrPersoane);
        }
        else{
            System.out.println("Autobuzul de noapte este gol. Se retrage la autobaza!");
        }
    }
}
