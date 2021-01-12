package com.rna.search;

import java.util.ArrayList;

/**
 * Ribonucleic acid engine
 * @author  David Brousseau
 * @version 0.1
 */
public class RNAEngine {

    /** Search result positions */
    private int positions[];

    /** Ribonucleic acid */
    private final ArrayList<Codon> rna;

    /**
     * Get the search result positions.
     * @return The positions
     */
    public int[] getPositions() { return this.positions; }

    /**
     * Constructor
     * @param input User input
     */
    public RNAEngine(String input) {
        rna = new ArrayList<>();
        for (int i = 0; i < input.length(); i += 3) { rna.add(new Codon(input.substring(i, i + 3))); }
    }

    /**
     * Check if positions are found for the search request.
     * @param  input Request input
     * @return       True of False
     */
    public boolean positionsFound() {
        if (positions[0] == 0) { return false; }
        return true;
    }

    /**
     * Search by abbreviation for the requested acid in the RNA.
     * @param input Request input
     */
    public void searchByAbbreviation(String input) {
        positions = new int[input.length() / 3];
        // TODO:
    }

    /**
     * Search by nucleotides for the requested acid in the RNA.
     * @param input Request input
     */
    public void searchByNucleotides(String input) {
        positions = new int[input.length() / 3];
        // TODO:
    }

    /**
     * Sum all the carbon atoms.
     * @return The sum
     */
    public int sumCarbon() {
        int sum = 0;
        for (int i = 0; i < rna.size(); i++) {
            Codon codon = rna.get(i);
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(i).getCarbon(); }
        }
        return sum;
    }

    /**
     * Sum all the hydrogen atoms.
     * @return The sum
     */
    public int sumHydrogen() {
        int sum = 0;
        for (int i = 0; i < rna.size(); i++) {
            Codon codon = rna.get(i);
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(i).getHydrogen(); }
        }
        return sum;
    }

    /**
     * Sum all the molar mass.
     * @return The sum
     */
    public double sumMolarMass() {
        double sum = 0;
        for (int i = 0; i < rna.size(); i++) {
            Codon codon = rna.get(i);
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(i).getMolarMass(); }
        }
        return sum;
    }

    /**
     * Sum all the nitrogen atoms.
     * @return The sum
     */
    public int sumNitrogen() {
        int sum = 0;
        for (int i = 0; i < rna.size(); i++) {
            Codon codon = rna.get(i);
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(i).getNitrogen(); }
        }
        return sum;
    }

    /**
     * Sum all the oxygen atoms.
     * @return The sum
     */
    public int sumOxygen() {
        int sum = 0;
        for (int i = 0; i < rna.size(); i++) {
            Codon codon = rna.get(i);
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(i).getOxygen(); }
        }
        return sum;
    }
}
