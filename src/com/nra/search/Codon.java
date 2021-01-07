package com.nra.search;

import com.nra.search.Nucleotide.Molecule;

import java.util.ArrayList;

/**
 * Codon of amino acid
 * @author  David Brousseau
 * @version 0.1
 */
public class Codon {

    /** Nucleotide molecules */
    private final ArrayList<Nucleotide> nucleotides;

    /**
     * Get the nucleotide molecules
     * @return The nucleotides
     */
    public ArrayList<Nucleotide> getNucleotides() { return this.nucleotides; }

    /**
     * Constructor
     * @param nucleotides Nucleotide molecules
     */
    public Codon(String nucleotides) {
        if (nucleotides.length() != 3) { throw new UnknownError("Unknown size"); }
        this.nucleotides = new ArrayList<>();
        for (int i = 0; i < nucleotides.length(); i++) {
            this.nucleotides.add(castToNucleotide(nucleotides.charAt(i)));
        }
    }

    /**
     * Cast a character to an appropriate nucleotide.
     * @param  character Character to cast
     * @return           The nucleotide
     */
    private Nucleotide castToNucleotide(char character) {
        switch (character) {
        case 'A':
            return new Nucleotide(Molecule.A);
        case 'C':
            return new Nucleotide(Molecule.C);
        case 'G':
            return new Nucleotide(Molecule.G);
        case 'U':
            return new Nucleotide(Molecule.U);
        default:
            throw new UnknownError("Unknown molecule");
        }
    }
}
