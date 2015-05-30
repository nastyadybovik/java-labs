package by.bsu.chapter4.town;

/**
 * Created by dom on 24.04.2015.
 */
public class Town {
    private String name;
    private double square;
    private int population;
    private boolean capital;
    private boolean regionCenter;

    public Town(){
        name = new String("unknown");
        square = 0;
        population = 0;
        capital = false;
        regionCenter = false;
    }

    public Town(String n, double s, int p, boolean c, boolean r){
        name = new String(n);
        square = s;
        population = p;
        capital = c;
        regionCenter = r;
    }

    public boolean isRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(boolean r) {
        regionCenter = r;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean c) {
        capital = c;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPopulation(int p) {
        population = p;
    }

    public void setSquare(double s) {
        square = s;
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
        Town o = (Town)obj;
        if(!name.equals(o.getName())) return false;
        if(square != o.getSquare()) return false;
        if(population != o.getPopulation()) return false;
        if(capital != o.isCapital()) return false;
        if(regionCenter != o.isRegionCenter()) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("===== Город =====\nГород: "+name+"\nНаселение: "+population+" чел\nПлощадь: "+square+" км^2");
        if(capital)
            s.append("\nСтолица: да");
        else
            s.append("\nСтолица: нет");
        if(regionCenter)
            s.append("\nОбластной центр: да");
        else
            s.append("\nОбластной центр: нет\n");
        return s.toString();
    }
}
