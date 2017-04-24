package Lab12;

import java.util.Scanner;

/**
 * Created by PAS8 on 4/21/2017.
 */
public abstract class Player {

    //Create an abstract class name Player that stores a name and Roshambo123 value
    private String name;
    private String roshamboVal;

    public abstract void setName();
    public abstract void setRoshamboVal();

    public void run(){
        setName ();
        setRoshamboVal ();
    }
}
