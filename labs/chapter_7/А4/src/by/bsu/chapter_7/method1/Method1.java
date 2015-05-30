package by.bsu.chapter_7.method1;

import by.bsu.chapter_7.method1.stringMethod.StringMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dom on 02.05.2015.
 */
public class Method1 {
    static public void main_method1() throws IOException {
        String str = "Good morning! Smile! Have the best day you ever have!";
        System.out.println("Метод 1\nСтрока, которую бдуем изменять:\n"+str);

        System.out.println("После какого по счёту символа будем вставлять строку?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());

        System.out.println("Какую строку будем вставлять после "+n+"-ого символа?");
        br = new BufferedReader(new InputStreamReader(System.in));
        String substr = br.readLine();

        str = StringMethods.addAfterK(str, substr, n);
        System.out.println("Изменённая строка:\n"+str);
    }
}
