package by.bsu.chapter_6.abstrctClass;

import by.bsu.chapter_6.iBuilding.IBuilding;

/**
 * Created by dom on 25.04.2015.
 */
public abstract class PublicBuilding implements IBuilding {
    private final boolean publicBuilding = true;
    private int number;
    private int amountOfFloor;
    private String color;

    public boolean isPublicBuilding() {
        return publicBuilding;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public void setAmountOfFloor(int amountOfFloor) {
        this.amountOfFloor = amountOfFloor;
    }

    @Override
    public int getAmountOfFloor() {
        return amountOfFloor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColorOfBuilding() {
        return color;
    }

    public abstract String WhoAmI();

}
