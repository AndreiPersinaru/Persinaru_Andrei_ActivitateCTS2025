package ChainOfResponsability.clase;

public class HandlerTrolebuz extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta < 0){
            System.out.println("Parametru invalid");
            return;
        }
        if(distanta <=3){
            System.out.println("Se recomanda troleibuzul");
        }
        else if(urmator != null){
            urmator.recomanda(distanta);
        }
    }
}
