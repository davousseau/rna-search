package com.rna.search;

import java.util.Scanner;

/**
 * Terminal main class
 * @author  David Brousseau
 * @version 0.1
 */
public class Terminal {

    /** Ribonucleic acid engine */
    private final RNAEngine engine;
    /** Input scanner */
    private final Scanner   scanner;

    /** Constructor */
    private Terminal() {
        scanner = new Scanner(System.in);
        final String userInput = readUserInput();
        validateUserInput(userInput);
        engine = new RNAEngine(userInput);
        // TODO:
        scanner.close();
    }

    /**
     * Check if the user input characters are A, C, G or U.
     * @param  input User input
     * @return       True of False
     */
    private boolean isACGU(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'A' && input.charAt(i) != 'C' && input.charAt(i) != 'G' && input.charAt(i) != 'U') {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if the user input length is greater than 5.
     * @param  input User input
     * @return       True of False
     */
    private boolean isGreaterThan5(String input) {
        if (input.length() > 5) { return true; }
        return false;
    }

    /**
     * Check if the user input length is a multiple of 3.
     * @param  input User input
     * @return       True of False
     */
    private boolean isMultiple3(String input) {
        if (input.length() % 3 == 0) { return true; }
        return false;
    }

    private String readUserInput() {
        System.out.println("Entrer votre ARN :");
        final String userInput = scanner.nextLine();
        return userInput;
    }

    /**
     * Validate the user input format.
     * @param input User input
     */
    private void validateUserInput(String input) {
        if (!(isACGU(input) && isGreaterThan5(input) && isMultiple3(input))) {
            System.err.println("Votre ARN est invalide");
            System.exit(1);
        }
    }

    /**
     * Launch the software.
     * @param args Arguments
     */
    public static void main(String args[]) { new Terminal(); }
}