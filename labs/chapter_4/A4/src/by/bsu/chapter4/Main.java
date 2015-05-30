package by.bsu.chapter4;

import by.bsu.chapter4.district.District;

import static by.bsu.chapter4.countRegions.CountRegions.countRegions;
import static by.bsu.chapter4.getCapital.GetCapital.*;
import static by.bsu.chapter4.getArea.GetArea.*;
import static by.bsu.chapter4.getRegionCenters.GetRegionCenters.getRegionCenters;

import by.bsu.chapter4.region.Region;
import by.bsu.chapter4.state.State;
import by.bsu.chapter4.town.Town;

/**
 * Created by dom on 24.04.2015.
 */
public class Main {
    public static void main(String[] args){
        Town borisovTown = new Town("Борисов", 50 , 145659, true, true);
        District borisovDistrict = new District("Борисовский район", 2987.63 , 188142, borisovTown);

        Town molodechnoTown = new Town("Молодечно", 26.8 , 93802, false, false);
        District molodechnoDistrict = new District("Молодечненский район", 1392.18 , 138375, molodechnoTown);

        District[] array = {borisovDistrict, molodechnoDistrict};
        Region minskRegion = new Region("Минская область", 39900, 1479400, array);

        Region[] regions = {minskRegion};
        State state = new State("Беларусь", regions);

        //System.out.println(state);
        System.out.println("================= Information =================");
        System.out.println("Столица:\n"+ getCapital(state)+"\n---------------------------------");
        System.out.println("Площадь страны:"+getArea(state)+"\n---------------------------------");
        System.out.println("Количетсво областей:"+countRegions(state)+"\n---------------------------------");
        System.out.println("Областные центры:");
        for(int i=0; i<getRegionCenters(state).length; i++){
            System.out.println(getRegionCenters(state)[i]);
        }
    }
}
