package exA10.clase;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String, IPacient> pacienti = new HashMap<>();
    public IPacient getPacient(String nume, String nrTelefon, String adresa){
        if(!pacienti.containsKey(nume)){
            pacienti.put(nume, new Pacient(nume, nrTelefon, adresa));
        }
        return pacienti.get(nume);
    }

    public IPacient getPacient(String nume) throws Exception {
        if(pacienti.containsKey(nume)) {
            return pacienti.get(nume);
        }
        throw new Exception("Pacientul nu exista");
    }
}
