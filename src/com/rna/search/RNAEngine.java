package com.rna.search;

import java.util.ArrayList;

import com.rna.search.Nucleotide.Molecule;

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
        final int rnaSize = rna.size();
        positions = new int[rnaSize];
        ArrayList<Codon> codons = AminoAcid.castToAminoAcid(input).getCodons();
        int index = 0;
        for (int i = 0; i < rnaSize; i++) {
            for (int j = 0; j < codons.size(); j++) {
                if (rna.get(i).equals(codons.get(j))) {
                    positions[index] = (i * 3) + 1;
                    index++;
                }
            }
        }
    }

    /**
     * Search by nucleotides for the requested acid in the RNA.
     * @param input Request input
     */
    public void searchByNucleotides(String input) {
        final int rnaSize = rna.size();
        final int inputLength = input.length();
        positions = new int[rnaSize];
        int index = 0;
        for (int i = 0; i < rnaSize; i++) {
            int correspondingCount = 0;
            for (int j = 0; j < inputLength; j++) {
                if (inputLength <= (rnaSize * 3)) {
                    String code = input.substring(j, j + 1);
                    ArrayList<Nucleotide> corresponding = NucleotideSet.castToNucleotideSet(code).getNucleotides();
                    for (int k = 0; k < corresponding.size(); k++) {
                        Molecule nucleotideMolecule = rna.get(i).get(j).getMolecule();
                        if (nucleotideMolecule == corresponding.get(k).getMolecule()) { correspondingCount++; }
                    }
                }
            }
            if (correspondingCount == inputLength) {
                positions[index] = (i * 3) + 1;
                index++;
            }
        }
    }

    /**
     * Sum all the carbon atoms.
     * @return The sum
     */
    public int sumCarbon() {
        int sum = 0;
        for (int i = 0; i < rna.size(); i++) {
            Codon codon = rna.get(i);
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(j).getCarbon(); }
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
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(j).getHydrogen(); }
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
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(j).getMolarMass(); }
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
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(j).getNitrogen(); }
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
            for (int j = 0; j < codon.size(); j++) { sum += codon.get(j).getOxygen(); }
        }
        return sum;
    }
}