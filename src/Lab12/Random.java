package Lab12;

/**
 * Created by PAS8 on 4/21/2017.
 */
public class Random extends Player {
    //Create class to randomly select rock, paper, or scissors

    public static String computerChoice() {
        // Create a Random object.
        Random rand = new Random();
        // Generate a random number in the range of
        // 1 through 3.
        int num = rand.nextInt(3) + 1;
        // Return the computer's choice.
        return getChoice (num) ;
    }
}
