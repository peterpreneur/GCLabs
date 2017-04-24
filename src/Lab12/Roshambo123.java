package Lab12;

/**
 * Created by PAS8 on 4/21/2017.
 */
public class Roshambo123 {

    //Roshambo123 enum outputting numeric
    public enum RoshamboEnumNum {
        ROCK ( 1 ), PAPER ( 2 ), SCISSORS ( 3 );
        private int num;

        //This is a constructor
        RoshamboEnumNum(int num) {
            this.num = num;
        }
    }


    public static void main(String[] args) {
        System.out.println (RoshamboEnumNum.values ());
    }
}


//This is a main method
//Basic Roshambo123 enum
//public enum RoshamboEnum {
//    ROCK, PAPER, SCISSORS
//}
//
//    //Roshambo123 enum outputting char
//    public enum RoshamboEnumChar {
//        ROCK ( 'a' ), PAPER ( 'b' ), SCISSORS ( 'c' );
//        private char letter;
//
//        RoshamboEnumChar(char letter) {
//            this.letter = letter;
//        }
//    }
// Sample Roshambo123 outputting numerica
//        for (RoshamboEnumNum r : RoshamboEnumNum.values ()) {
//          System.out.println ( "Number = " + r.num );
//          System.out.println ( "toString = " + r.toString () );
//       }
//
//    public static void main(String[] args) {
//        Sample basic Roshambo123 outputting value
//        for (RoshamboEnum rVal : RoshamboEnum.values ()) {
//            System.out.println ( "toString = " + rVal.toString () );
//        }
//
//
//        //Sample Roshambo123 outputing letter
//        for (RoshamboEnumChar rChar : RoshamboEnumChar.values ()) {
//            System.out.println ( "Letter = " + rChar.letter );
//        }
//    }

