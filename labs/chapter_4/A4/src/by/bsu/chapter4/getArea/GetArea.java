package by.bsu.chapter4.getArea;

import by.bsu.chapter4.state.State;

/**
 * Created by dom on 24.04.2015.
 */
public class GetArea {
    static public double getArea(State state){
        double square = 0;
        for(int i=0; i<state.getRegionArray().length; i++){
            square += state.getRegionArray()[i].getSquare();
        }
        return square;
    }
}
