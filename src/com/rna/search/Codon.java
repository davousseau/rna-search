package com.rna.search;

import java.util.ArrayList;

import com.rna.search.Nucleotide.Molecule;

/**
 * Codon of amino acid
 * @author  David Brousseau
 * @version 0.1
 */
public class Codon extends ArrayList<Nucleotide> {

    /** Serializable class id */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     * @param nucleotides Nucleotide molecules
     */
    public Codon(String nucleotides) {
        super();
        if (nucleotides.length() != 3) { throw new UnknownError("Unknown size"); }
        for (int i = 0; i < nucleotides.length(); i++) { this.add(castToNucleotide(nucleotides.charAt(i))); }
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
