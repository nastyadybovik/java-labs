package by.bsu.operations;

import by.bsu.complexFraction.AdditionOfComplexFraction;
import by.bsu.complexFraction.ComplexFraction;

/**
 * Created by dom on 20.04.2015.
 */
public class AdditionOfEvenIndex {
    public static ComplexFraction[] addition(ComplexFraction[] array) {
        for(int i=0; i<array.length-1; i++){
            if(i%2 == 0){
                array[i] = AdditionOfComplexFraction.addition(array[i], array[i + 1]);
            }
        }
        return array;
    }
}
