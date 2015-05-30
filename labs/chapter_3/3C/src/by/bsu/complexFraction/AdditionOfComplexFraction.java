package by.bsu.complexFraction;

import by.bsu.complex.Addition;
import by.bsu.complex.Complex;
import by.bsu.complex.Multiplication;

/**
 * Created by dom on 20.04.2015.
 */
public class AdditionOfComplexFraction {
    static public ComplexFraction addition(ComplexFraction c1, ComplexFraction c2){
        Complex m = Addition.addition(Multiplication.multiplication(c1.getM(), c2.getN()), Multiplication.multiplication(c2.getM(), c1.getN()));
        Complex n = Multiplication.multiplication(c1.getN(), c2.getN());
        return new ComplexFraction(m,n);
    }
}
