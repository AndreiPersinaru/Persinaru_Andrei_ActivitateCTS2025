package exA8.main;

import exA8.clase.Departament;
import exA8.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        Departament dep1 = new Departament("Departament general");
        Departament dep2 = new Departament("Cardiologie");
        Departament dep3 = new Departament("Pediatrie");

        Sectie s1 = new Sectie("sectie 1");
        Sectie s2 = new Sectie("sectie 2");

        try{
            dep1.adaugaNod(dep2);
            dep1.adaugaNod(dep3);
            dep1.adaugaNod(s1);
            dep2.adaugaNod(s2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        dep1.descriereStructura();
    }
}
