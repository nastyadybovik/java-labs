package by.bsu.second;

import org.omg.CORBA_2_3.portable.InputStream;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by dom on 14.02.2015.
 */
public class NumString {
    public static void outPutString(String [] arr) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str;
        int n;
        try {
            System.out.println("Введите число строк, n=");
            str = br.readLine();
            n = Integer.parseInt(str);
            System.out.println("n = " + n);
            if(n<0) {
                throw new IOException();
            }
            String rez1="", rez2="";
            for ( int i=0; i<n ; i++ ) {
                String buf;
                System.out.println("Введите "+(i+1)+"-ую строку");
                buf = br.readLine();
                rez1 = rez1 + buf;
                rez2 = rez2 + buf + "\n";
            }
            System.out.println("Вывод строк без перехода на новую строку");
            System.out.println(rez1);
            System.out.println("Вывод строк с перехода на новую строку");
            System.out.println(rez2);
        } catch (IOException e) {
            System.out.println("Неправильный формат");
            n=0;
        }

    }
}
