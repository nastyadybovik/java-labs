package by.bsu.chapter_4.compare;

import by.bsu.chapter_4.iCompareProperty.ICompareProperty;
import by.bsu.chapter_4.vegetablesAbstractClass.Vegetables;

/**
 * Created by dom on 24.04.2015.
 */
public class MaxElement implements ICompareProperty {
    @Override
    public double compareProperty(Vegetables vegetable){
        double[] arr = {vegetable.getProtiens(), vegetable.getCarbs(), vegetable.getCaloricValue(), vegetable.getVitaminC()};
        double max = arr[0];
        for(int i=1; i< arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
