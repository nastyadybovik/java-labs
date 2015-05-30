package by.bsu.chapter4.region;

import by.bsu.chapter4.district.District;

/**
 * Created by dom on 24.04.2015.
 */
public class Region {
    private String name;
    private double square;
    private int population;
    private District[] districtArray;

    public Region(){
        name = new String("unknown");
        square = 0;
        population = 0;
        districtArray = null;
    }

    public Region(String n, double s, int p, District[] districtArr) {
        name = new String(n);
        square = s;
        population = p;
        districtArray = districtArr;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double s) {
        square = s;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int p) {
        population = p;
    }

    public District[] getDistrictArray() {
        return districtArray;
    }

    public void setDistrictArray(District[] districtArr) {
        districtArray = districtArr;
    }

    @Override
    public int hashCode() {
        return (int) (square * population / (square + population));
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        Region o = (Region)obj;
        if(!name.equals(o.getName())) return false;
        if(square != o.getSquare()) return false;
        if(population != o.getPopulation()) return false;
        if(districtArray.length != o.getDistrictArray().length) return false;
        for(int i=0; i< districtArray.length; i++){
            if(!districtArray[i].equals(o.getDistrictArray()[i])) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("===== Область =====\nОбласть: "+name+"\nНаселение: "+population+"\nПлощадь: "+square+"\nРайоны:\n");
        for(int i=0; i<districtArray.length; i++){
            s.append(districtArray[i].toString());
        }
        return s.toString();
    }
}
