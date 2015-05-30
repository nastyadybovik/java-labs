package by.bsu.chapter_4.find;

import by.bsu.chapter_4.vegetablesAbstractClass.Vegetables;

/**
 * Created by dom on 24.04.2015.
 */
public class FindCaloricValue {
    public static double findCaloricValue(Vegetables[] salad){
        double caloricValue = 0;
        for(int i=0; i<salad.length; i++){
            caloricValue += salad[i].getCaloricValue();
        }
        return caloricValue;
    }
}
