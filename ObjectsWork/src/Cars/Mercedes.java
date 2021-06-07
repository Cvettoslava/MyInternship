package Cars;

import java.util.Date;

public class Mercedes extends Car{

    /*** @return the String that is specified sound for teh Mercedes*/
    public static String Sounding(){
        String sound = "The Mercedes make his own sound!";
        return sound;
    }
    public Mercedes (){
        super(2000,"white","2020.01.01");
    }
}
