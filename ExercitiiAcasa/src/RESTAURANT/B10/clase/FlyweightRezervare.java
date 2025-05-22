package RESTAURANT.B10.clase;

import java.util.HashMap;

public class FlyweightRezervare {
    HashMap<String, Client> listaClienti = new HashMap<>();

    public FlyweightRezervare() {}

    public IClient getClient(String nume, String nrTelefon, String adresaMail){
        if(!listaClienti.containsKey(nume)){
            listaClienti.put(nume, new Client(nume, nrTelefon, adresaMail));
        }
        return listaClienti.get(nume);
    }
}
