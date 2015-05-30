import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.bsu.devide.DevideFiveSeven;

/**
 * Created by dom on 15.02.2015.
 */
public class Main {
    public static void main (String [] args) throws IOException {
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

            DevideFiveSeven ob = new DevideFiveSeven(array);

            if( ob.devide().length !=0 ) {
                System.out.println("Числа, которые деляться на 5 и 7:");
                for (Integer el : ob.devide()) {
                    System.out.println(el);
                }
            }
            else
                System.out.println("В данном наборе, нет чисел, кратных 5 и 7.");

        } catch (NumberFormatException e){
            System.out.println("Неправильный формат");
        }
    }
}
