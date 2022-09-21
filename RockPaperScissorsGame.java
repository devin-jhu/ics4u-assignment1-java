/*
* This program runs Rock Paper Scissors.
*
* @author  Devin Jhu
* @version 1.0
* @since   2020-09-20
*/

import java.util.Scanner;

/**
* The Rock Paper Scissors game.
*/
final class RockPaperScissorsGame {

    /**
    * Constant assigned to 1.
    */
    public static final int ROCK = 1;

    /**
    * Constant assigned to 2.
    */
    public static final int PAPER = 2;

    /**
    * Constant assigned to 3.
    */
    public static final int SCISSORS = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissorsGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        final Scanner gameObj = new Scanner(System.in);
        System.out.println("choose rock (1), paper (2) or scissors (3): ");

        /*
        * Try-catch to ensure bad
        * input won't crash the program
        */
        try {
            final float usersHand = gameObj.nextInt();

            // random module
            final int min = ROCK;
            final int max = SCISSORS;
            final int robotHand = (int) ((Math.random() * max) + min);

            // process
            if (usersHand == robotHand) {
                System.out.println("\nits a tie");
            } else if ((usersHand == ROCK & robotHand == SCISSORS)
                    || (usersHand == PAPER & robotHand == ROCK)
                    || (usersHand == SCISSORS & robotHand == PAPER)) {
                System.out.println("\nYOU WIN!!");
            } else if ((usersHand == ROCK & robotHand == PAPER)
                    || (usersHand == PAPER & robotHand == SCISSORS)
                    || (usersHand == SCISSORS & robotHand == ROCK)) {
                System.out.println("\nyou lose :(");
            } else {
                System.out.println("\ninvalid input");
            }

            // output
            if (robotHand == ROCK) {
                System.out.println("ai chose Rock.");
            } else if (robotHand == PAPER) {
                System.out.println("ai chose Paper.");
            } else {
                System.out.println("ai chose Scissors.");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\ninvalid input.");
        } finally {
            System.out.println("\ndone.");
        }
    }
}
