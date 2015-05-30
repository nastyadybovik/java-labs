package by.bsu.chapter4.getRegionCenters;

import by.bsu.chapter4.state.State;
import by.bsu.chapter4.town.Town;

/**
 * Created by dom on 24.04.2015.
 */
public class GetRegionCenters {
    static public Town[] getRegionCenters(State state){
        int n=0;
        for(int i=0; i<state.getRegionArray().length; i++){
            for(int j=0; j<state.getRegionArray()[i].getDistrictArray().length; j++){
                if(state.getRegionArray()[i].getDistrictArray()[j].getTown().isRegionCenter())
                    n++;
            }
        }
        Town[] regionCenters = new Town[n];
        int h=0;
        for(int i=0; i<state.getRegionArray().length; i++){
            for(int j=0; j<state.getRegionArray()[i].getDistrictArray().length; j++){
                if(state.getRegionArray()[i].getDistrictArray()[j].getTown().isRegionCenter())
                    regionCenters[h++] = state.getRegionArray()[i].getDistrictArray()[j].getTown();
            }
        }
        return regionCenters;
    };
}
