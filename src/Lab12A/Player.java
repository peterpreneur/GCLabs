package Lab12A;

/**
 * Created by PAS8 on 4/25/2017.
 */
public abstract class Player {
    //Create an abstract class name Player that stores a name and Roshambo value
    private String name;
    private ROSHAMBO roshamboVal;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ROSHAMBO getRoshamboVal() {
        return roshamboVal;
    }
    public void setRoshamboVal(ROSHAMBO roshamboVal) {
        this.roshamboVal = roshamboVal;
    }

    public abstract ROSHAMBO generateRoshambo();
}
