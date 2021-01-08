package com.rna.search;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Amino acid codes from IUPAC
 * @author  David Brousseau
 * @version 0.1
 */
public enum AminoAcid {

    /** Alanine */
    ALA(new Codon("GCU"), new Codon("GCC"), new Codon("GCA"), new Codon("GCC")),

    /** Arginine */
    ARG(new Codon("CGU"), new Codon("CGC"), new Codon("CGA"), new Codon("CGG"), new Codon("AGA"), new Codon("AGG")),

    /** Asparagine */
    ASN(new Codon("AAU"), new Codon("AAC")),

    /** Aspartic acid */
    ASP(new Codon("GAU"), new Codon("GAC")),

    /** Cysteine */
    CYS(new Codon("UGU"), new Codon("UGC")),

    /** Glutamic acid */
    GLU(new Codon("GAA"), new Codon("GAG")),

    /** Glutamine */
    GLN(new Codon("CAA"), new Codon("CAG")),

    /** Glycine */
    GLY(new Codon("GGU"), new Codon("GGC"), new Codon("GGA"), new Codon("GGG")),

    /** Histidine */
    HIS(new Codon("CAU"), new Codon("CAC")),

    /** Isoleucine */
    ILE(new Codon("AUU"), new Codon("AUC"), new Codon("AUA")),

    /** Leucine */
    LEU(new Codon("UUA"), new Codon("UUG"), new Codon("CUU"), new Codon("CUC"), new Codon("CUA"), new Codon("CUG")),

    /** Lysine */
    LYS(new Codon("AAA"), new Codon("AAG")),

    /** Methionine */
    MET(new Codon("AUG")),

    /** Phenylalanine */
    PHE(new Codon("UUU"), new Codon("UUC")),

    /** Proline */
    PRO(new Codon("CCU"), new Codon("CCC"), new Codon("CCA"), new Codon("CCG")),

    /** Pyrrolysine */
    PYL(new Codon("UAG")),

    /** Selenocysteine */
    SEC(new Codon("UGA")),

    /** Serine */
    SER(new Codon("UCU"), new Codon("UCC"), new Codon("UCA"), new Codon("UCG"), new Codon("AGU"), new Codon("AGC")),

    /** Threonine */
    THR(new Codon("ACU"), new Codon("ACC"), new Codon("ACA"), new Codon("ACG")),

    /** Tryptophan */
    TRP(new Codon("UGG")),

    /** Tyrosine */
    TYR(new Codon("UAU"), new Codon("UAC")),

    /** Valine */
    VAL(new Codon("GUU"), new Codon("GUC"), new Codon("GUA"), new Codon("GUG"));

    /** Codons of nucleotide molecules */
    private final ArrayList<Codon> codons;

    /**
     * Constructeur
     * @param codons Codons of nucleotide molecules
     */
    private AminoAcid(Codon... codons) {
        this.codons = new ArrayList<>();
        Collections.addAll(this.codons, codons);
    }

    /**
     * Return the amino acid abbreviation.
     * @return The abbreviation
     */
    @Override
    public String toString() {
        String s = super.toString();
        return s.substring(0, 1) + s.substring(1).toLowerCase();
    }
}