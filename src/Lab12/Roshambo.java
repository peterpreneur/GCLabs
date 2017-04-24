package Lab12;

/**
 * Created by PAS8 on 4/21/2017.
 */
public class Roshambo {
    //Basic Roshambo enum
    public enum RoshamboEnum {
        ROCK, PAPER, SCISSORS
    }

    //Roshambo enum outputting numeric
    public enum RoshamboEnumNum {
        ROCK ( 1 ), PAPER ( 2 ), SCISSORS ( 3 );
        private int num;
        //This is a constructor
        RoshamboEnumNum(int num) {
            this.num = num;
        }
    }

    //Roshambo enum outputting char
    public enum RoshamboEnumChar {
        ROCK ( 'a' ), PAPER ( 'b' ), SCISSORS ( 'c' );
        private char letter;
        RoshamboEnumChar(char letter) {
            this.letter = letter;
        }
    }

    //This is a main method
    //public static void main(String[] args) {
        //Sample basic Roshambo outputting value
        for (RoshamboEnum rVal : RoshamboEnum.values ()) {
            System.out.println ( "toString = " + rVal.toString () );
        }

        //Sample Roshambo outputting numerica
        for (RoshamboEnumNum r : RoshamboEnumNum.values ()) {
            System.out.println ( "Number = " + r.num );
            System.out.println ( "toString = " + r.toString () );
        }

        //Sample Roshambo outputing letter
        for (RoshamboEnumChar rChar : RoshamboEnumChar.values ()) {
            System.out.println ( "Letter = " + rChar.letter );
        }
    //}
}