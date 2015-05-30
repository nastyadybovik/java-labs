package by.bsu.find;

import by.bsu.abiturient.Abiturient;

/**
 * Created by dom on 18.04.2015.
 */
public class SumMark {
    static public int sum(Abiturient ab){
        int sum=0;
        for(int j=0; j<ab.getMarks().length; j++){
            sum += ab.getMarks()[j];
        }
        return sum;
    }
}
