package ChainOfResponsability.main;

import ChainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        ARecomandaTransport troleibuz = new HandlerTrolebuz();
        ARecomandaTransport autobuz = new HandlerAutobuz();
        ARecomandaTransport tramvai = new HandlerTramvai();
        ARecomandaTransport metrou = new HandlerMetrou();

        troleibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        troleibuz.recomanda(2);
        troleibuz.recomanda(5);
        troleibuz.recomanda(7);
        troleibuz.recomanda(12);
    }
}
