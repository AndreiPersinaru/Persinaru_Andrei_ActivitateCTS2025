package RESTAURANT.B16.clase;

public class TrimiteSMS extends Handler{
    @Override
    public void notificaClientul(Client client) {
        if(client.getNrTelefon().isEmpty()){
            urmatorul.notificaClientul(client);
        }
        else{
            System.out.println("S-a trimis SMS.");
        }
    }
}
