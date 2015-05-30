package by.bsu.chapter_4;

import by.bsu.chapter_4.compare.MaxElement;
import by.bsu.chapter_4.compareProperty.CompareAZ;
import by.bsu.chapter_4.iCompareProperty.ICompareProperty;
import by.bsu.chapter_4.iCompareProperty.ICustomCompare;
import by.bsu.chapter_4.vegetables.Cabagge;
import by.bsu.chapter_4.vegetables.Carrot;
import by.bsu.chapter_4.vegetables.Cucumber;
import by.bsu.chapter_4.vegetablesAbstractClass.Vegetables;

import static by.bsu.chapter_4.find.FindCaloricValue.findCaloricValue;
import static by.bsu.chapter_4.sort.Sort.bubbleSort;
import static by.bsu.chapter_4.suitableCaloricValue.SuitableCaloricValue.suitableCaloricValue;

/**
 * Created by dom on 24.04.2015.
 */
public class Main {
    public static void main(String[] args){
        Cucumber cucumber = new Cucumber(120);
        //System.out.println(cucumber);

        Carrot carrot = new Carrot(10);
        //System.out.println(carrot);

        Cabagge cabagge = new Cabagge(200);
        //System.out.println(cabagge);

        //делаем салат
        Vegetables[] salad = {cabagge, carrot, cucumber};
        System.out.println("Салат:");
        for(int i=0; i< salad.length; i++){
            System.out.println(salad[i]);
        }

        //найдём калорийность
        System.out.println("==================================================================================\nКалорийность салата: "+findCaloricValue(salad));

        //сортировка
        System.out.println("==================================================================================");
        ICompareProperty comp1 = new MaxElement();
        ICustomCompare comp2 = new CompareAZ();
        bubbleSort(salad, comp2, comp1);
        System.out.println("Псоле сортировки (по максимальному элементу)");
        for(int i=0; i< salad.length; i++){
            System.out.println(salad[i]);
        }

        //диапазон калорийности
        System.out.println("==================================================================================\nСоотвествуют диапазону калорийности (<15.9)");
        Vegetables[] arrayV = suitableCaloricValue(salad, 15.9);
        for(int i=0; i< arrayV.length; i++){
            System.out.println(arrayV[i]);
        }
    }
}
