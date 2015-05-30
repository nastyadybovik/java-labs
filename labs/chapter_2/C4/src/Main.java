/*
Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
*/


import by.bsu.task4.CountMatrix;
import by.bsu.task4.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.bsu.task4.MatrixException;

/**
 * Created by dom on 22.02.2015.
 */
public class Main {
    public static void main (String[] args) throws Exception {
        try {

            System.out.println("Матрицу какой размерности хотите ввести?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            int n;
            str = br.readLine();
            n = Integer.parseInt(str);

            Matrix obj = new Matrix(n);
            obj.show();
            System.out.println("Сумма равна " + CountMatrix.countMatrix(obj));


        } catch (NumberFormatException e){
            System.out.println("Неправильный формат");
        }
    }
}
