package com.rna.search;

import java.util.ArrayList;
import java.util.Collections;

import com.rna.search.Nucleotide.Molecule;

/**
 * Nucleotide set codes from IUPAC
 * @author  David Brousseau
 * @version 0.1
 */
public enum NucleotideSet {

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
     * Get the set of nucleotides.
     * @return The nucleotides.
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
}