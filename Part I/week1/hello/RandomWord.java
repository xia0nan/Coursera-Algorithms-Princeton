/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String currentInput;
        String champion = "";
        double p = 1.0;

        while (!StdIn.isEmpty()) {
            currentInput = StdIn.readString();
            if (StdRandom.bernoulli(1 / p)) {
                champion = currentInput;
            }
            p++;
        }
        StdOut.println(champion);
    }
}