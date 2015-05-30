package by.bsu.chapter_6;

import by.bsu.chapter_6.abstrctClass.PrivateBuilding;
import by.bsu.chapter_6.abstrctClass.PublicBuilding;
import by.bsu.chapter_6.building.Cottage;
import by.bsu.chapter_6.building.Theatr;
import by.bsu.chapter_6.iBuilding.IBuilding;

import static by.bsu.chapter_6.functions.MaxFloor.maxFloor;

/**
 * Created by dom on 25.04.2015.
 */
public class Main {
    public static void main(String[] args){
        PublicBuilding theatr1 = new Theatr("Театр Имени Горького", 100, 2, "белый");
        PublicBuilding theatr2 = new Theatr("Театр Янки Купало", 9, 2, "серый");
        PrivateBuilding cottage = new Cottage("Частный коттедж", 29, 3, "коричневый", 1000);
        IBuilding[] array = {theatr1, theatr2, cottage};
        System.out.println(theatr1);
        System.out.println(theatr2);
        System.out.println(cottage);
        System.out.println("\nМаксимальное число этажей "+maxFloor(array).getAmountOfFloor()+ "\n" + maxFloor(array));
    }
}

