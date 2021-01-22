package com.rna.search;

import com.rna.search.Nucleotide.Molecule;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Nucleotide set (from IUPAC)
 * @author  David Brousseau
 * @version 0.1
 */
public enum NucleotideSet {

    /** Adenine */
    A(new Nucleotide(Molecule.A)),

    /** Cytosine */
    C(new Nucleotide(Molecule.C)),

    /** Guanine */
    G(new Nucleotide(Molecule.G)),

    /** Uracil */
    U(new Nucleotide(Molecule.U)),

    /** Purine */
    R(new Nucleotide(Molecule.A), new Nucleotide(Molecule.G)),

    /** Pyrimidine */
    Y(new Nucleotide(Molecule.C), new Nucleotide(Molecule.U)),

    /** Strong */
    S(new Nucleotide(Molecule.C), new Nucleotide(Molecule.G)),

    /** Weak */
    W(new Nucleotide(Molecule.A), new Nucleotide(Molecule.U)),

    /** Keto */
    K(new Nucleotide(Molecule.G), new Nucleotide(Molecule.U)),

    /** Amino */
    M(new Nucleotide(Molecule.A), new Nucleotide(Molecule.C)),

    /** Not A */
    B(new Nucleotide(Molecule.C), new Nucleotide(Molecule.G), new Nucleotide(Molecule.U)),

    /** Not C */
    D(new Nucleotide(Molecule.A), new Nucleotide(Molecule.G), new Nucleotide(Molecule.U)),

    /** Not G */
    H(new Nucleotide(Molecule.A), new Nucleotide(Molecule.C), new Nucleotide(Molecule.U)),

    /** Not U */
    V(new Nucleotide(Molecule.A), new Nucleotide(Molecule.C), new Nucleotide(Molecule.G)),

    /** Any */
    N(new Nucleotide(Molecule.A), new Nucleotide(Molecule.C), new Nucleotide(Molecule.G), new Nucleotide(Molecule.U));

    /** Set of nucleotides */
    private ArrayList<Nucleotide> nucleotides;

    /**
     * Get the nucleotide set.
     * @return The nucleotides
     */
    public ArrayList<Nucleotide> getNucleotides() { return this.nucleotides; }

    /**
     * Constructor
     * @param nucleotides Set of nucleotides
     */
    private NucleotideSet(Nucleotide... nucleotides) {
        this.nucleotides = new ArrayList<>();
        Collections.addAll(this.nucleotides, nucleotides);
    }

    /**
     * Cast a code to an appropriate nucleotide set.
     * @param  code Code to cast
     * @return      The nucleotide set
     */
    public static NucleotideSet castToNucleotideSet(String code) {
        for (NucleotideSet set : NucleotideSet.values()) {
            if (code.equals(set.toString())) { return set; }
        }
        throw new UnknownError("Unknown nucleotide set");
    }
}
