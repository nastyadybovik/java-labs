package by.bsu.task4;

/**
 * Created by dom on 07.03.2015.
 */
public class CountElement {
    static int countElement(int[] array) {
        int sum = 0;
        int first = -1, last = -1;
        for (int i = 0; i < array.length-1; i++) {
            if ((first == -1) && (array[i] > 0)) first = i;
            if ((first != -1) && (last == -1) && (array[i + 1] > 0)) {
                last = i + 1;
                break;
            }
        }
        if (last == -1 || first == -1) {
            System.out.println("В строке нет двух положительных элементов.");
        } else {
            System.out.println("first = " + array[first] + "; last = " + array[last]);
            for (int f = first; f < last - 1; f++) {
                System.out.println("el[" + (f + 1) + "] = " + array[f + 1]);
                sum += array[f + 1];
            }
        }
        return sum;
    }
}
