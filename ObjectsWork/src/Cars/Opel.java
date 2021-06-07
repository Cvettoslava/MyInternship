package Cars;

import java.util.Date;

public class Opel extends Car{

    int carWeight;
    int numberOfPassengers;

    //Constructor
    public Opel (int carW, int numP){
        super(1500,"blue","2012.10.09");
        this.carWeight = carW;
        this.numberOfPassengers = numP;

    }

    /*** @return the String that is specified sound*/
    public static String Sounding(){
        String sound = "The Opel make his won sound!";
        return sound;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}