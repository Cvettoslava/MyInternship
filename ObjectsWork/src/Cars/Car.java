package Cars;

import java.util.Date;

public class Car {
    protected int maxSpeed;
    protected String color;
    protected String dateOfProduction;

    /*** @return the String that is specified sound for the Car*/
    public static String Sounding (){
        String sound = "The car makes sound!";
        return sound;
    }

    //Constructor
    public Car(int maxS, String color, String dOfP){
        this.color = color;
        this.dateOfProduction = dOfP;
        this.maxSpeed = maxS;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
