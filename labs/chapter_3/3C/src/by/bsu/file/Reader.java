package by.bsu.file;

import by.bsu.complex.Complex;

import java.io.*;
import java.util.DoubleSummaryStatistics;

/**
 * Created by dom on 20.04.2015.
 */
public class Reader {

    public static int amount(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        int amount=0;

        exists(fileName);
        File file = new File(fileName);

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    amount++;
                }
                //System.out.println("Количество строк: "+i);
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return amount;
    }

    public static double[][] reader(String fileName) throws FileNotFoundException{
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        int i=0;
        double[][] array = new double[amount(fileName)][2];

        exists(fileName);
        File file = new File(fileName);

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    String[] test =  s.trim().split("[|]");
                    for(int j=0; j<test.length; j++) {
                        test[j] = test[j].trim();
                        //System.out.print(test[j].trim()+"\n");
                    }
                    array[i][0]= Double.parseDouble(test[0]) ;
                    array[i][1]= Double.parseDouble(test[1]);
                    i++;
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        return array;
    }

    public static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
}
