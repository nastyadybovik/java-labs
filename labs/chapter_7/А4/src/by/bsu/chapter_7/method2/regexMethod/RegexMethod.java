package by.bsu.chapter_7.method2.regexMethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dom on 02.05.2015.
 */
public class RegexMethod {
    static public void addAfterK(String str, String substr, int n){
        String regex;
        regex = "(\\w|\\p{Blank}|\\d){7}";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(str);
        if(m2.find()){
            System.out.println(m2.group());
            System.out.println(m2.end());
        }

    }
}
