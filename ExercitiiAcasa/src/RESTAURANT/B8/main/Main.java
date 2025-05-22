package RESTAURANT.B8.main;

import RESTAURANT.B8.clase.Item;
import RESTAURANT.B8.clase.Sectiune;
import RESTAURANT.B8.clase.Structura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Structura sectiune1 = new Sectiune("Startere");
            Structura sectiune2 = new Sectiune("Bauturi");
            Structura sectiune3 = new Sectiune("Desert");
            Structura sectiune4 = new Sectiune("Sucuri");
            Structura sectiune5 = new Sectiune("Cafea");

            Structura item1 = new Item("Sandvis", 15.99f);
            Structura item2 = new Item("Fanta", 9.99f);
            Structura item3 = new Item("Coca-Cola", 9.99f);
            Structura item4 = new Item("Expresso", 7.99f);
            Structura item5 = new Item("Americano", 6.99f);
            Structura item6 = new Item("Papanasi", 20.99f);

            sectiune1.adaugaNod(item1);
            sectiune2.adaugaNod(sectiune4);
            sectiune4.adaugaNod(item2);
            sectiune4.adaugaNod(item3);
            sectiune2.adaugaNod(sectiune5);
            sectiune5.adaugaNod(item4);
            sectiune5.adaugaNod(item5);
            sectiune3.adaugaNod(item6);

            List<Structura> sectiuni = new ArrayList<>();
            sectiuni.add(sectiune1);
            sectiuni.add(sectiune2);
            sectiuni.add(sectiune3);

            for(Structura sectiune : sectiuni){
                sectiune.descriereStructura("");
            }

            item2.adaugaNod(sectiune4);
            sectiune2.stergeNod(sectiune4);
            System.out.println("\n\n");
            for(Structura sectiune : sectiuni){
                sectiune.descriereStructura("");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
