package RESTAURANT.B16.clase;

public class TrimiteMail extends Handler{

    @Override
    public void notificaClientul(Client client) {
        if(client.getAdresaMail().isEmpty()){
            urmatorul.notificaClientul(client);
        }
        else{
            System.out.println("S-a trimis mail.");
        }
    }
}
