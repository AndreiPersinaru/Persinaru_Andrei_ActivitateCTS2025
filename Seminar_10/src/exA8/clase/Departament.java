package exA8.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    String nume;
    List<IStructura> lista;

    public Departament(String nume) {
        this.nume = nume;
        lista = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public void setLista(List<IStructura> lista) {
        this.lista = lista;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Departamentul " + nume + " are urmatoarele subdepartamente/sectii:");
        for (IStructura iStructura : lista) {
            iStructura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura iStructura) throws Exception {
        lista.add(iStructura);
    }

    @Override
    public void stergeNod(IStructura iStructura) throws Exception {
        lista.remove(iStructura);
    }

    @Override
    public IStructura getNodCopil(int index) {
        return lista.get(index);
    }
}
