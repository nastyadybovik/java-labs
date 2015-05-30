package by.bsy.realnum;

/**
 * Created by dom on 14.02.2015.
 */
public class RealNum {
    public int [] mass;

    public RealNum(int[] mass) {
        this.mass = mass;
    }

    public void sum() {
        int sum=0;
        for (int i=0; i<mass.length; i++)
            sum+=mass[i];
        System.out.print("Sum = " + sum);
    }
    public void product() {
        int prod = 1;
        for (int i=0; i<mass.length; i++)
            prod*=mass[i];
        System.out.print("Product = " + prod);
    }
}
