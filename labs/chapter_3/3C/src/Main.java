import by.bsu.complex.*;
import by.bsu.complexArray.ComplexArray;
import by.bsu.complexFraction.ComplexFraction;
import by.bsu.file.Reader;
import by.bsu.operations.AdditionOfEvenIndex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dom on 20.04.2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        /*
        //проверка операций
        System.out.println("Addition: "+ Addition.addition(c1, c2));
        System.out.println("Subtraction: " + Subtraction.subtraction(c1, c2));
        System.out.println("Multiplication: " + Multiplication.multiplication(c1, c2));
        System.out.println("Division: " + Division.division(c1, c2));
        */

        /*
        //создание Complexfraction вручную
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(-2, -3);
        Complex c3 = new Complex(-2.8, 3.4);
        Complex c4 = new Complex(0, -3);
        Complex c5 = new Complex(0, 0);
        Complex c6 = new Complex(10, -5.7);
        Complex c7 = new Complex(-1.7, 3.6);
        Complex c8 = new Complex(-11, 0);
        Complex c9 = new Complex(4.2, 1.7);
        Complex c10 = new Complex(0, -11);

        ComplexFraction cf1 = new ComplexFraction(c1, c2);
        ComplexFraction cf2 = new ComplexFraction(c3, c4);
        ComplexFraction cf3 = new ComplexFraction(c5, c6);
        ComplexFraction cf4 = new ComplexFraction(c7, c8);
        ComplexFraction cf5 = new ComplexFraction(c9, c10);

        ComplexFraction[] array = {cf1, cf2, cf3, cf4, cf5};
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + "    ");
        }
        System.out.println("\n");
        ComplexFraction[] array2 = AdditionOfEvenIndex.addition(array);
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+"   ");
        }
        System.out.println("\n");
        */

        System.out.println("Массив комплексных дробей");
        ComplexFraction[] array = ComplexArray.setArray();
        ComplexArray.show(array);

        System.out.println("Изменённый массив комплексных дробей");
        ComplexFraction[] array2 = AdditionOfEvenIndex.addition(array);
        ComplexArray.show(array2);

    }
}
