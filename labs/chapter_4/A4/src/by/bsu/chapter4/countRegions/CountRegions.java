package by.bsu.chapter4.countRegions;

import by.bsu.chapter4.state.State;

/**
 * Created by dom on 24.04.2015.
 */
public class CountRegions {
    static public int countRegions(State state){
        return state.getRegionArray().length;
    }
}
