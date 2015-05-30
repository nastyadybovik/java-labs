package by.bsu.chapter_4.sort;

import by.bsu.chapter_4.iCompareProperty.ICompareProperty;
import by.bsu.chapter_4.iCompareProperty.ICustomCompare;
import by.bsu.chapter_4.vegetablesAbstractClass.Vegetables;

/**
 * Created by dom on 24.04.2015.
 */
public class Sort {
    public static void bubbleSort(Vegetables[] salad , ICustomCompare customCompare, ICompareProperty compareProperty){
        for (int i = salad.length - 1 ; i > 0 ; i--){
            for (int j = 0 ; j < i ; j++){
                if(customCompare.compare( compareProperty.compareProperty(salad[j]) , compareProperty.compareProperty(salad[j+1]) ) > 0){
                    Vegetables tmp = salad[j];
                    salad[j] = salad[j+1];
                    salad[j+1] = tmp;
                }
            }
        }
    }
}
