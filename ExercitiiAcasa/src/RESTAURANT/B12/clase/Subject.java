package RESTAURANT.B12.clase;

public interface Subject {
    void adaugaObservator(Observer observer);
    void stergeObservator(Observer observer);
    void notificaObservatori(String mesaj);
}
