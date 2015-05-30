package by.bsu.chapter4.state;

import by.bsu.chapter4.region.Region;

/**
 * Created by dom on 24.04.2015.
 */
public class State {
    private String name;
    private Region[] regionArray;

    public State(){
        name = new String("unknown");
        regionArray = new Region[0];
    }

    public State(String n, Region[] regionArr) {
        name = new String();
        setName(n);
        regionArray = new Region[regionArr.length];
        setRegionArray(regionArr);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public Region[] getRegionArray() {
        return regionArray;
    }

    public void setRegionArray(Region[] regionArr) {
        for(int i=0; i<regionArr.length; i++){
            regionArray[i] = regionArr[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("===== Страна =====\nСтрана: "+name+"\nОбласти:\n");
        for(int i=0; i<regionArray.length; i++){
            s.append(regionArray[i].toString());
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        State o = (State)obj;
        if(!name.equals(o.getName())) return false;
        if(regionArray.length != o.getRegionArray().length) return false;
        for(int i=0; i< regionArray.length; i++){
            if(!regionArray[i].equals(o.getRegionArray()[i])) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for(int i=0; i<regionArray.length; i++){
            hash += regionArray.hashCode();
        }
        return hash;
    }
}
