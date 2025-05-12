package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements ISubject {
    private int numarLinie;
    private List<IObserver> calatori;

    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.calatori = new ArrayList<IObserver>();
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public List<IObserver> getCalatori() {
        return calatori;
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        this.calatori.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        this.calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (IObserver calator : calatori) {
            calator.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}