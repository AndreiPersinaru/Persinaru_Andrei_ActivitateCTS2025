package ChainOfResponsability.clase;

public class HandlerAutobuz extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta <= 5){
            System.out.println("Se recomanda autobuzul");
        }
        else if(urmator != null){
            urmator.recomanda(distanta);
        }
    }
}
