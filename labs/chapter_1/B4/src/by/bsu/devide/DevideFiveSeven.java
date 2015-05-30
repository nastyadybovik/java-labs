package by.bsu.devide;

/**
 * Created by dom on 15.02.2015.
 */
public class DevideFiveSeven {
    public int[] mass;

    public DevideFiveSeven(int[] array) {
        int n = array.length;
        mass = new int[n];
        for (int i=0; i<n ; i++){
            mass[i] = array[i];
        }
    }

    public int[] devide() {
        int s=0;
        for (int i=0; i<mass.length ; i++) {
            if (mass[i] != 0)
                if(mass[i]%5 == 0 && mass[i]%7 == 0){
                    s++;
                }
        }
        int[] answer = new int[s];
        int i=0;
        for (Integer el : mass) {
            if (el != 0)
                if(el%5 == 0 && el%7 == 0) {
                    answer[i] = el;
                    i++;
                }
        }
        return answer;
    }
}
