package by.bsu.complexFraction;

import by.bsu.complex.Complex;

import java.io.FileNotFoundException;

/**
 * Created by dom on 20.04.2015.
 */
public class ComplexFraction {
    private Complex m;
    private Complex n;

    public ComplexFraction(){
        m = new Complex();
        n = new Complex(1,0);
    }

    public ComplexFraction(Complex val1, Complex val2){
        m = new Complex();
        setM(val1);
        n = new Complex();
        setN(val2);
    }

    public Complex getM() {
        return m;
    }

    public Complex getN() {
        return n;
    }

    public void setM(Complex val) {
        m = val;
    }

    public void setN(Complex val) {
        n = val;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("("+getM().toString()+")/("+getN().toString()+")");
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        ComplexFraction o = (ComplexFraction)obj;
        if(!getM().equals(o.getM()))
            return false;
        if(!getN().equals(o.getN()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return getM().hashCode()+getN().hashCode();
    }
}
