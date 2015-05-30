package by.bsu.chapter_10;

import by.bsu.chapter_10.Graph.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by dom on 23.05.2015.
 */
public class Main {
    public static void main(String [] args) throws IOException {

        System.out.println("Сколько вершин имеет граф?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer1;
        answer1 = br.readLine();
        int n=0;
        n = Integer.parseInt(answer1);

        Graph gr = new Graph(n);

        System.out.println("Сколько рёбер хотите добавить?");
        String answer2;
        answer2 = br.readLine();
        int m = Integer.parseInt(answer2);

        Map<int[], Boolean> e = new HashMap<int[], Boolean>(); //ребра: ключ - ребро, значение - есть(true) или нет(false)

        while(m>0){
            System.out.println("["+m+"] Ребро между какими двумя вершинами хотите добавить ребро? (Ввести через пробел)");
            answer2 = br.readLine();
            String[] vertex =  answer2.trim().split("[ ]");
            for(int j=0; j<vertex.length; j++) {
                vertex[j] = vertex[j].trim();
                System.out.println(vertex[j]);
            }
            int vertex1 = Integer.parseInt(vertex[0]);
            int vertex2 = Integer.parseInt(vertex[1]);
            int[] r = {vertex1, vertex2};
//            System.out.println("r="+r[0]+","+r[1]);
            System.out.println(r);
            if(e.putIfAbsent(r, true))
                System.out.println("Ребро добавленно.");
            else
                System.out.println("Ребро уже существует.");

            m--;
        }
        ListIterator<String> iterator = list.iterator;
        while()
        gr.setE(e);

        System.out.println("Наш граф:\n{");
        for(int i=0; i<gr.getDimension(); i++){
            int[] key = {i, i+1};
            System.out.println(i+", "+gr.getE().get(key)+",");
        }
        System.out.print("}");

    }
}
