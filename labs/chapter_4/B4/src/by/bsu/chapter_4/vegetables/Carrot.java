package by.bsu.chapter_4.vegetables;

import by.bsu.chapter_4.vegetablesAbstractClass.Vegetables;

/**
 * Created by dom on 24.04.2015.
 */
public class Carrot extends Vegetables {
    public Carrot(){
        setProtiens(1.3);
        setCarbs(7.6);
        setCaloricValue(36.0);
        setVitaminC(4);
        setWeight(0);
    }
    public Carrot(double w){
        setProtiens(1.3);
        setCarbs(7.6);
        setCaloricValue(36.0);
        setVitaminC(4);
        setWeight(w);
    }

    @Override
    public int hashCode() {
        return (int)(19*getProtiens()+3*getCarbs()+13*getVitaminC());
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        Cucumber o = (Cucumber)obj;
        if(getProtiens() != o.getProtiens()) return false;
        if(getCarbs() != o.getCarbs()) return false;
        if(getCaloricValue()!= o.getCaloricValue()) return false;
        if(getVitaminC() != o.getVitaminC()) return false;
        if(getWeight() != o.getWeight()) return false;
        return true;
    }

    @Override
    public String toString() {
        return whoAmI()+" Белки: "+getProtiens()+" Углеводы: "+getCarbs()+" Витамин С: "+getVitaminC()+" Калорийность: "+getCaloricValue()+" Вес: "+getWeight();
    }

    @Override
    public String whoAmI() {
        return "Я морковь.";
    }
}
