package by.bsu.complex;

import by.bsu.file.Reader;

import java.io.FileNotFoundException;

/**
 * Created by dom on 20.04.2015.
 */
public class Complex {
    private double a;
    private double b;

    public Complex(){
        a=0;
        b=0;
    }

    public Complex(double val1, double val2){
        a=val1;
        b=val2;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public void setA(double val) {
        a = val;
    }

    public void setB(double val) {
        b = val;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        if(getA()!=0 && getB()!=0) {
            if(getB() > 0)
                s.append(a + " + i*" + b);
            else
                s.append(a + " + i*(" + b+")");
        }
        if(getA()==0 && getB()!=0) {
            if(getB() > 0)
                s.append("i*" + b);
            else
                s.append("i*(" + b+")");
        }
        if(getA()!=0 && getB()==0) {
            s.append(a);
        }
        if(getA()==0 && getB()==0) {
            s.append("0");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        Complex o = (Complex)obj;
        if(getA() != o.getA())
            return false;
        if(getB() != o.getB())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return (int)getA()*31 + (int)getB()*19;
    }
}
