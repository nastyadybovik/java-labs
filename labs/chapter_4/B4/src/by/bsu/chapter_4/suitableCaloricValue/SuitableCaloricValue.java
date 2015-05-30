package by.bsu.chapter_4.suitableCaloricValue;

import by.bsu.chapter_4.vegetablesAbstractClass.Vegetables;

/**
 * Created by dom on 24.04.2015.
 */
public class SuitableCaloricValue {
    public static Vegetables[] suitableCaloricValue(Vegetables[] salad, double caloricValue){
        int n=0;
        for(int i=0; i<salad.length; i++){
            if(salad[i].getCaloricValue() <= caloricValue) n++;
        }
        Vegetables[] suitableIngredients = new Vegetables[n];
        n=0;
        for(int i=0; i<salad.length; i++){
            if(salad[i].getCaloricValue() <= caloricValue)
                suitableIngredients[n++] = salad[i];
        }
        return suitableIngredients;
    }
}
