package Cars;

import java.util.Date;

public class VW extends Car{
    //Constructor
    public VW (){
        super(1800,"red","2017.02.05");
    }

    /*** @return the String that is specified sound*/
    public static String Sounding (){
        String sound = "The VW make a specified sound!";
        return sound;
    }

}
