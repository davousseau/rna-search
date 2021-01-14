package com.rna.search;

import java.util.ArrayList;

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
        for (int i = 0; i < nucleotides.length(); i++) { this.add(Nucleotide.castToNucleotide(nucleotides.charAt(i))); }
    }

    public boolean equals(Codon codon) {
        if (this.size() == codon.size()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getMolecule() != codon.get(i).getMolecule()) { return false; }
            }
            return true;
        }
        return false;
    }
}
