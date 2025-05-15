package ChainOfResponsability.clase;

public class HandlerTramvai extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta <= 10){
            System.out.println("Se recomanda tramvaiul");
        }
        else if(urmator != null){
            urmator.recomanda(distanta);
        }
    }
}
