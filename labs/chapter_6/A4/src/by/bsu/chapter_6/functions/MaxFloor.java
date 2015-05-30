package by.bsu.chapter_6.functions;

import by.bsu.chapter_6.iBuilding.IBuilding;

/**
 * Created by dom on 26.04.2015.
 */
public class MaxFloor {
    static public IBuilding maxFloor(IBuilding[] buildings){
        int max=buildings[0].getAmountOfFloor();
        int maxIndex=0;
        for(int i=1; i<buildings.length; i++){
            if(buildings[i].getAmountOfFloor()>max){
                max = buildings[i].getAmountOfFloor();
                maxIndex = i;
            }
        }
        return buildings[maxIndex];
    }
}
