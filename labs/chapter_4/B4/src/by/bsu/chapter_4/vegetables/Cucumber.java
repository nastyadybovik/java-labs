package by.bsu.chapter_4.vegetables;

import by.bsu.chapter_4.vegetablesAbstractClass.Vegetables;

/**
 * Created by dom on 24.04.2015.
 */
public class Cucumber extends Vegetables {
    public Cucumber(){
        setProtiens(0.7);
        setCarbs(2.9);
        setCaloricValue(15);
        setVitaminC(4.7);
        setWeight(0);
    }
    public Cucumber(double w){
        setProtiens(0.7);
        setCarbs(2.9);
        setCaloricValue(15);
        setVitaminC(4.7);
        setWeight(w);
    }



    @Override
    public int hashCode() {
        return (int)(7*getProtiens()+19*getCarbs()+13*getVitaminC());
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
        return "Я огурец.";
    }
}
