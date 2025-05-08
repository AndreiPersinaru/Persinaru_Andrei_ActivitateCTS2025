package exA10.main;


import exA10.clase.IPacient;
import exA10.clase.Receptie;
import exA10.clase.Spitalizare;

//FLYWEIGHT
public class Main {
    public static void main(String[] args) {
        Receptie receptie = new Receptie();

        receptie.getPacient("Ion", "0722839329", "Sos. Pantelimon nr.126a");
        receptie.getPacient("Gion", "0722839329", "Sos. Pantelimon nr.126a");
        receptie.getPacient("Jhon", "0722839329", "Sos. Pantelimon nr.126a");

        Spitalizare s1 = new Spitalizare(1, 5, 2);
        Spitalizare s2 = new Spitalizare(2, 3, 4);
        Spitalizare s3 = new Spitalizare(2, 5, 3);
        Spitalizare s4 = new Spitalizare(1, 2, 1);

        try{
            receptie.getPacient("Ion").afisareInformatie(s2);
            receptie.getPacient("Gion").afisareInformatie(s4);
            receptie.getPacient("Gion").afisareInformatie(s3);
            receptie.getPacient("Jhon").afisareInformatie(s1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
