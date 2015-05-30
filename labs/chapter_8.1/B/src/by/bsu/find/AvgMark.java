package by.bsu.find;

import by.bsu.abiturientArray.AbiturientArray;
import by.bsu.exception.*;

/**
 * Created by dom on 18.04.2015.
 */
public class AvgMark {
    static public AbiturientArray avgMark(AbiturientArray arrayAb, int avg) throws SetAbiturientException, IdException, MarkException, NameException, PhoneException {
        System.out.println("Список абитуриентов, у которых сумма баллов выше заданной "+avg);

        int n=0;
        //высчтываем сумму для каждого абитуриента и сравниваем с проходной суммой
        for(int i=0; i<arrayAb.getArray().length; i++){
            if(SumMark.sum(arrayAb.getAbiturient(i)) >= avg){
                n++;
            }
        }

        //создаём массив, который будет содержать абитурентов с прохдной суммой
        AbiturientArray avgAb = new AbiturientArray(n);
        //System.out.println("n="+n);

        //заполняем массив
        int h=0;
        for(int i=0; i<arrayAb.getArray().length; i++){
            if( SumMark.sum(arrayAb.getAbiturient(i)) >= avg){
                avgAb.setAbiturient(h,arrayAb.getAbiturient(i));
                h++;
            }
        }
        return avgAb;
    }
}
