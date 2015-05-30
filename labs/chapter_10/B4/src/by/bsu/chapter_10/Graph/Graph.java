package by.bsu.chapter_10.Graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dom on 23.05.2015.
 */
public class Graph {
    private int[] V;
    private Map<int[], Boolean> E;

    public Graph(int N){
        E = new HashMap<int[], Boolean>();
        V = new int[N];
        setV(N);
    }

    public void setV(int N){
        for(int i=0; i<N; i++){
            V[i]=i+1;
//            System.out.println(V[i]);
        }
    }

    public int[] getV(){
        return V;
    }

    public int getDimension(){
        return V.length;
    }

    public void setE(Map<int[], Boolean> map){
        E.putAll(map);
    }

    public Map<int[], Boolean> getE() {
        return E;
    }
}
