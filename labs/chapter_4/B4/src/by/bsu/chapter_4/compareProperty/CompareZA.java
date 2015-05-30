package by.bsu.chapter_4.compareProperty;

import by.bsu.chapter_4.iCompareProperty.ICustomCompare;

/**
 * Created by dom on 24.04.2015.
 */
public class CompareZA implements ICustomCompare {
    @Override
    public double compare(double num1, double num2){return num1-num2;}
}
