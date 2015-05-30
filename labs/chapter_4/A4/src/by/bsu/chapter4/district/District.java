package by.bsu.chapter4.district;


import by.bsu.chapter4.town.Town;

/**
 * Created by dom on 24.04.2015.
 */
public class District {
    private String name;
    private int population;
    private double square;
    private Town town;

    public District() {
        name = new String("unknown");
        population = 0;
        square = 0;
        town = new Town("unknown", 0,0, false, false);
    }

    public District(String n, double s, int p, Town t) {
        name = new String(n);
        population = p;
        square = s;
        town = new Town(t.getName(), t.getSquare(), t.getPopulation(), t.isCapital(), t.isRegionCenter());
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

    public Town getTown() {
        return town;
    }

    public void setTown(Town t) {
        town.setName(t.getName());
        town.setPopulation(t.getPopulation());
        town.setSquare(t.getSquare());
        town.setRegionCenter(t.isRegionCenter());
        town.setCapital(t.isCapital());
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
        District o = (District)obj;
        if(!name.equals(o.getName())) return false;
        if(square != o.getSquare()) return false;
        if(population != o.getPopulation()) return false;
        if(!town.equals(o.getTown())) return false;
        return true;
    }

    @Override
    public String toString() {
        return "==== Район ===== \nРайон: "+name+"\nНаселение: "+population+" чел\nПлощадь: "+square+" км^2\n"+town.toString();
    }
}