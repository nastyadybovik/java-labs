package by.bsu.complex;

/**
 * Created by dom on 20.04.2015.
 */
public class Multiplication {
    public static Complex multiplication(Complex val1, Complex val2){
        return new Complex(val1.getA()*val2.getA()-val1.getB()*val2.getB(), val1.getA()*val2.getB()+val1.getB()*val2.getA());
    }
}
