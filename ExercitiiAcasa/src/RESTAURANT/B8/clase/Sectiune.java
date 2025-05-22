package RESTAURANT.B8.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura{
    private String nume;
    private List<Structura> lista;

    public Sectiune(String nume) {
        this.nume = nume;
        lista = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) throws Exception{
        lista.remove(structura);
    }

    @Override
    public Structura getNodCopil(int index) throws Exception{
        return lista.get(index);
    }

    @Override
    public void descriereStructura(String indent) {
        System.out.println(indent + nume+": ");
        for (Structura structura : lista){
            structura.descriereStructura(indent + "\t");
        }
    }
}
