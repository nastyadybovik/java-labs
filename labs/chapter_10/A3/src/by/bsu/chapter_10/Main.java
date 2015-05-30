package by.bsu.chapter_10;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dom on 22.05.2015.
 */
public class Main {

    public static void Directory(List<String> catalog, File f){
        if(f.isDirectory()){
            //System.out.println(f.getName());
            catalog.add(f.getName());
            File []fList;
            File F = new File(f.getAbsolutePath());
            fList = F.listFiles();
            for(int i=0; i<fList.length; i++)
            {
                Directory(catalog, fList[i]);
            }
        }
        if(f.isFile()){
            //System.out.println(f.getName());
            catalog.add(f.getName());
        }
    }

    public static void main(String [] args) {

        //создвём список
        List <String> catalog = new LinkedList<String>();

        File []fList;
        File F = new File("E:\\java_projects\\practise\\chapter_10\\user");
        fList = F.listFiles();
        for(int i=0; i<fList.length; i++)
        {
            //Нужны только папки в место isFile() пишим isDirectory()
            if(fList[i].isDirectory()){
                Directory(catalog, fList[i]);
            }
        }

        System.out.println("Cписок каталогов и подкаталогов:");
        for(String li : catalog){
            System.out.println(li);
        }

    }
}
