package by.bsu.chapter_6.building;

import by.bsu.chapter_6.abstrctClass.PublicBuilding;

/**
 * Created by dom on 25.04.2015.
 */
public class Theatr extends PublicBuilding {
    private String name;

    public Theatr(){
        name = new String();
        setName("unknown");
        super.setAmountOfFloor(0);
        super.setNumber(0);
        super.setColor("unknown");
    }

    public Theatr(String n, int number, int amount, String color){
        name = new String();
        setName(n);
        super.setAmountOfFloor(amount);
        super.setNumber(number);
        super.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String WhoAmI() {
        return "Я "+name;
    }

    @Override
    public String toString() {
        return "Общественное здание\nНазвание: "+name+" Номер:"+getNumber()+" Количество этажей: "+getAmountOfFloor()+" Цвет здания: "+getColorOfBuilding();
    }
}
