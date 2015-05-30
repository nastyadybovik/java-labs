import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.GregorianCalendar;

import by.bsu.lesson_2.Developer;
import by.bsu.lesson_2.DifferentNum;

/**
 * Created by dom on 21.02.2015.
 */
public class Main {
    /**
     * Forms an array of entered numbers and sends it to DifferentNum.java.
     * Prints the number that has the smallest amount of different numerics.
     * @author  Dubovik Nastya
     * @since JDK-1.8
     * @param args send to Developer.
     * @throws IOException .
     */
    public static void main (String[] args) throws IOException {
        try {
            System.out.println("Сколько чисел хотите ввести?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            int n;
            str = br.readLine();
            n = Integer.parseInt(str);

            int[] array = new int[n];
            int num;

            for (int i = 0; i < n; i++) {
                System.out.print("Введите " + (i + 1) + "-ое число ");
                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                String str2;
                str = br2.readLine();
                num = Integer.parseInt(str);
                array[i] = num;
            }


            DifferentNum ob = new DifferentNum(array);
            System.out.println( "Число, содердащее минимально число различных цифр, равно " + ob.different());


            Developer.infodevelop(args);

        } catch (NumberFormatException e){
            System.out.println("Неправильный формат");
        }
    }
}
