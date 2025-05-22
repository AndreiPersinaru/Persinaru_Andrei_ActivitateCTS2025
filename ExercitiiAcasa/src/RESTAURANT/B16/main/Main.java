package RESTAURANT.B16.main;

import RESTAURANT.B16.clase.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("024813242", "adresa");
        Client client2 = new Client("", "adresa");
        Client client3 = new Client("", "");

        Handler trimiteSMS = new TrimiteSMS();
        Handler trimiteMail = new TrimiteMail();
        Handler notificaManager = new NotificaManager();

        trimiteSMS.setUrmatorul(trimiteMail);
        trimiteMail.setUrmatorul(notificaManager);

        trimiteSMS.notificaClientul(client1);
        trimiteSMS.notificaClientul(client2);
        trimiteSMS.notificaClientul(client3);
    }
}
