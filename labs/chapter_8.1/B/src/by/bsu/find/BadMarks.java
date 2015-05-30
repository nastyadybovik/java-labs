package by.bsu.find;

import by.bsu.abiturient.Abiturient;
import by.bsu.abiturientArray.AbiturientArray;
import by.bsu.exception.*;

/**
 * Created by dom on 18.04.2015.
 */
public class BadMarks {
    static public AbiturientArray badMarks(AbiturientArray arrayAb) throws SetAbiturientException, IdException, MarkException, NameException, PhoneException {
        int n=0;
//Использовать лист для неопределённого числа
        System.out.println("Cписок абитуриентов, имеющих неудовлетворительные оценки ( < 15 )");
        //просматривая оценки каждого абитурента ищем те, которые меньше 4. если нашли, то увеличиваем n(содержит количество абитурентов с неудовлетворительными оуенками)
        for(int i=0; i<arrayAb.getArray().length; i++){
            for(int j=0; j<arrayAb.getAbiturient(i).getMarks().length; j++){
                if(arrayAb.getAbiturient(i).getMarks()[j] < 15) {
                    n++;
                    break;
                }
            }
        }

        //создаём массив, который будет содержать студентов с неудовлетворительными оценками
        AbiturientArray badAb = new AbiturientArray(n);
        int h= 0;

        //просматривая оценки каждого абитурента ищем те, которые меньше 4. если нашли, то заполняем массив
        for(int i=0; i<arrayAb.getArray().length; i++){
            for(int j=0; j<arrayAb.getAbiturient(i).getMarks().length; j++){
                if(arrayAb.getAbiturient(i).getMarks()[j] < 15) {
                    badAb.setAbiturient(h,arrayAb.getAbiturient(i));
                    h++;
                    break;
                }
            }
        }
        return badAb;
    }
}
