package by.bsu.chapter_4.vegetablesAbstractClass;

/**
 * Created by dom on 24.04.2015.
 */
public abstract class Vegetables {
    private double protiens;
    private double carbs;
    private double caloricValue;
    private double vitaminC;
    private double weight;

    public double getProtiens() {
        return protiens*weight/100;
    }

    public void setProtiens(double protiens) {
        this.protiens = protiens;
    }

    public double getCarbs() {
        return carbs*weight/100;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getCaloricValue() {
        return caloricValue*weight/100;
    }

    public void setCaloricValue(double caloric_value) {
        this.caloricValue = caloric_value;
    }

    public double getVitaminC() {
        return vitaminC*weight/100;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String whoAmI();

}
