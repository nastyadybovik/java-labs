package by.bsu.chapter_6.building;

import by.bsu.chapter_6.abstrctClass.PrivateBuilding;

/**
 * Created by dom on 26.04.2015.
 */
public class Cottage extends PrivateBuilding {
    private String name;
    private int arenda;

    public Cottage(){
        name = new String();
        setName("unknown");
        super.setAmountOfFloor(0);
        super.setNumber(0);
        super.setColor("unknown");
        arenda = 0;
    }

    public Cottage(String n, int number, int amount, String color, int ar){
        name = new String();
        setName(n);
        super.setAmountOfFloor(amount);
        super.setNumber(number);
        super.setColor(color);
        arenda = ar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getArenda(){
        return arenda;
    }

    @Override
    public String WhoAmI() {
        return "Я "+name;
    }

    @Override
    public String toString() {
        return "Необщественное здание\nНазвание: "+name+" Номер:"+getNumber()+" Количество этажей: "+getAmountOfFloor()+" Цвет здания: "+getColorOfBuilding()+" Аренда: "+getArenda()+"$";
    }


}
