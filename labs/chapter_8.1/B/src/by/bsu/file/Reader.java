package by.bsu.file;

import by.bsu.abiturient.Abiturient;
import by.bsu.exception.IdException;
import by.bsu.exception.MarkException;
import by.bsu.exception.NameException;
import by.bsu.exception.PhoneException;

import java.io.*;

/**
 * Created by dom on 19.04.2015.
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

    public static Abiturient[] setAb(Abiturient[] array, String fileName) throws FileNotFoundException, IdException, NameException, PhoneException, MarkException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        int i=0;

        exists(fileName);
        File file = new File(fileName);

        try {
            //Объект для чтения файла в буфер
            FileInputStream inF = new FileInputStream(file);
            BufferedReader in = new BufferedReader(new InputStreamReader( inF , "Cp1251"));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    String[] test =  s.trim().split("[|]");
                    for(int j=0; j<test.length; j++) {
                        test[j] = test[j].trim();
                        //System.out.print(test[j].trim()+"\n");
                    }
                    try {
                        array[i].setId(Integer.parseInt(test[0]));
                        array[i].setLastname(test[1]);
                        array[i].setFirstname(test[2]);
                        array[i].setPatronymic(test[3]);
                        array[i].setPhone(test[4]);
                        array[i].setAddress(test[6]);
                        String[] marksStr = test[5].trim().split("\\p{Blank}");
                        int[] marks = new int[marksStr.length];
                        for (int t = 0; t < marksStr.length; t++)
                            marks[t] = Integer.parseInt(marksStr[t]);
                        array[i].setMarks(marks);
                    } catch (ArrayIndexOutOfBoundsException e){//другая ошибка (parse)
                        System.out.println("Не все поля заполнены.");
                    }
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
