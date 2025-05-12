package Observer.clase;

public interface ISubject {
    void adaugaObserver(IObserver observer);
    void stergeObserver(IObserver observer);
    void trimiteMesaj(String mesaj);
}