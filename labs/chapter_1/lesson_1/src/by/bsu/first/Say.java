package by.bsu.first;

/**
 * Created by dom on 14.02.2015.
 */
public class Say {
    public static void sayHello(){
        System.out.println("Hello, USER!");
    }
    public void Args(String[] args){
        System.out.println("Аргументы командной строки:");
        for (String str : args)
            System.out.printf("%s" , str); //printf не перегоняет в строкуб, а printf оставляет

    }
    public static void reverseArgs(String[] args){
        System.out.println("Аргументы командной строки в обратном порядке:");
        for (int i=args.length-1; i>=0 ; i--)
            System.out.printf(args[i] + " ");

    }
}
