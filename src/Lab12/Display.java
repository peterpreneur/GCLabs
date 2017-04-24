package Lab12;

/**
 * Created by PAS8 on 4/21/2017.
 */
public class Display {

        @Override
        public String toString() {
            String s = "";
            if (this.ordinal () == 0) s = "Rock";
            else if (this.ordinal () == 1) s = "Paper";
            else if (this.ordinal () == 2) s = "Scissors";
            return s;
        }
    }
}
