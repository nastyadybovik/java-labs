package by.bsu.chapter4.getCapital;

import by.bsu.chapter4.state.State;
import by.bsu.chapter4.town.Town;

/**
 * Created by dom on 24.04.2015.
 */
public class GetCapital {
    static public Town getCapital(State state){
        Town capital = new Town();
        for(int i=0; i<state.getRegionArray().length; i++){
            for(int j=0; j<state.getRegionArray()[i].getDistrictArray().length; j++){
                if(state.getRegionArray()[i].getDistrictArray()[j].getTown().isCapital())
                    capital = state.getRegionArray()[i].getDistrictArray()[j].getTown();
            }
        }
        return capital;
    }
}
