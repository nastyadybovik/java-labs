package by.bsu.chapter_7.method1.stringMethod;

/**
 * Created by dom on 02.05.2015.
 */
public class StringMethods {
    static public String addAfterK(String str, String substr, int n){
        StringBuffer bf = new StringBuffer();
        bf.append(str);
        bf.insert(n, substr);
        return bf.toString();
    }
}
