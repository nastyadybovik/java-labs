import by.bsu.abiturient.Abiturient;
import by.bsu.abiturientArray.AbiturientArray;
import by.bsu.find.AvgMark;
import by.bsu.find.BadMarks;
import by.bsu.exception.*;
import by.bsu.find.MaxMark;

import java.io.IOException;

/**
 * Created by dom on 17.04.2015.
 */
public class Main {
    public static void main (String[] args) throws IdException, MarkException, PhoneException, NameException, SetAbiturientException, IOException {
        try{
            //создаём абитурентов
            AbiturientArray array = new AbiturientArray("E://java_projects//practise//chapter_3//A3/db.txt");

            System.out.println(array.toString());

            AbiturientArray bad = BadMarks.badMarks(array);
            System.out.println(bad.toString());

            int avgmark = 200;
            AbiturientArray avgAb = AvgMark.avgMark(array, avgmark);
            System.out.println(avgAb.toString());

            AbiturientArray maxAb = MaxMark.maxMark(array);
            System.out.println(maxAb.toString());

        } catch (SetAbiturientException e){
            System.out.println("Не удалось создать массив абитуриентов. Выход за пределы массива абитуриентов.");
        } catch (IdException e) {
            System.out.println("Нельзя создать абитуриента. Неподходящий id (<0).");
        } catch (MarkException e) {
            System.out.println("Нельзя создать абитуриента. Некорректная оценка (mark<0 или mark>100).");
        } catch (NameException e) {
            System.out.println("Нельзя создать абитуриента. Введено пустое имя/фамилия/отчество/адресс.");
        } catch (PhoneException e) {
            System.out.println("Нельзя создать абитуриента. Введён неверный телефонный номер (количество символов меньше 7).");
        }

    }
}
