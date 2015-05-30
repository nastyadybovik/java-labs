package by.bsu.task4;

/**
 * Created by dom on 07.03.2015.
 */
public class CountMatrix {
    static public int countMatrix(Matrix obj){
        int sum=0;
        for(int i=0; i< obj.getSize() ; i++ ) {
            sum += CountElement.countElement(obj.getMatrix()[i]);
        }
        return sum;
    }
}
