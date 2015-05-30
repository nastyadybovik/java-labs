import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.bsy.realnum.RealNum;
/**
 * Created by dom on 14.02.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Сколько чисел будете вводить? ");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str;
        int n;
        str = br.readLine();
        n = Integer.parseInt(str);

        int[] array = new int[n];
        int num;

        for ( int i=0 ; i<n; i++ ) {
            System.out.print("Введите "+ (i+1) + "-ое число ");
            BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in));
            String str2;
            str = br2.readLine();
            num = Integer.parseInt(str);
            array[i]=num;
        }
/*
        for ( int i=0 ; i<n; i++ ) {
            System.out.print(array[i] + " ");
        }
*/
        RealNum mass = new RealNum(array);
        mass.sum();
        mass.product();
    }
}
