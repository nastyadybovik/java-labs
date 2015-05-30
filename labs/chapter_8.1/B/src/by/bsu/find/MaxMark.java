package by.bsu.find;

import by.bsu.abiturientArray.AbiturientArray;
import by.bsu.exception.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dom on 18.04.2015.
 */
public class MaxMark {
    static public AbiturientArray maxMark(AbiturientArray arrayAb) throws IOException, SetAbiturientException, IdException, MarkException, NameException, PhoneException {
        int n=0;
        int  max = 0;
        //найдём максимальную сумму
        for(int i=0; i<arrayAb.getArray().length; i++){
            //System.out.println("Сумма: "+SumMark.sum(arrayAb.getAbiturient(i)));
            if(SumMark.sum(arrayAb.getAbiturient(i)) >= max){
                max = SumMark.sum(arrayAb.getAbiturient(i));
            }
        }

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str;
        int k;
        System.out.print("Введите число абитуриентов: ");
        str = br.readLine();
        k = Integer.parseInt(str);

        System.out.println("Выбрать заданное число "+k+" абитуриентов, имеющих самую высокую сумму баллов "+max);

        //подсчитываем количесво студентов, которые имеют максимальный балл
        for(int i=0; i<arrayAb.getArray().length; i++){
            if(SumMark.sum(arrayAb.getAbiturient(i)) == max){
                n++;
            }
        }

        //System.out.println("Количество 'лучших' студентов: "+n);
        AbiturientArray maxAb;

        //заполняем массив абитуриентами, имеющими максимальный балл
        if(k<=n){
            //массив, который будет содержать "лучших" абитуриентов
            maxAb = new AbiturientArray(k);
            int h=0;
            for(int i=0; i<arrayAb.getArray().length; i++){
                if(SumMark.sum(arrayAb.getAbiturient(i)) == max){
                    maxAb.setAbiturient(h,arrayAb.getAbiturient(i));
                    h++;
                }
                if(h == k) break;
            }
        } else {
            //массив, который будет содержать "лучших" абитуриентов
            maxAb = new AbiturientArray(n);
            int h=0;
            for(int i=0; i<arrayAb.getArray().length; i++){
                if(SumMark.sum(arrayAb.getAbiturient(i)) == max){
                    maxAb.setAbiturient(h,arrayAb.getAbiturient(i));
                    h++;
                }
            }
        }


        return maxAb;
    }
}
