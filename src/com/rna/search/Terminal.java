package com.rna.search;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Terminal main class
 * @author  David Brousseau
 * @version 0.1
 */
public class Terminal {

    /** Ribonucleic acid */
    private final ArrayList<Codon> rna;

    /** Input scanner */
    private final Scanner scanner;

    /** Constructor */
    private Terminal() {
        this.rna = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        // TODO:
        this.scanner.close();
    }

    /**
     * Launch the software.
     * @param args Arguments
     */
    public static void main(String args[]) { new Terminal(); }
}