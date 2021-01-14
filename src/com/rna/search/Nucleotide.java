package com.rna.search;

/**
 * Nucleotide of the RNA
 * @author  David Brousseau
 * @version 0.1
 */
public class Nucleotide {

    /** Available molecules */
    public enum Molecule {
        A,
        C,
        G,
        U;
    }

    /** Molecule of the nucleotide */
    private final Molecule molecule;

    /**
     * Get the amount of carbon molecule
     * @return The amount
     */
    public int getCarbon() {
        switch (molecule) {
        case A:
            return Carbon.A.getAmount();
        case C:
            return Carbon.C.getAmount();
        case G:
            return Carbon.G.getAmount();
        case U:
            return Carbon.U.getAmount();
        default:
            throw new UnknownError("Unknown molecule");
        }
    }

    /**
     * Get the amount of hydrogen molecule
     * @return The amount
     */
    public int getHydrogen() {
        switch (molecule) {
        case A:
            return Hydrogen.A.getAmount();
        case C:
            return Hydrogen.C.getAmount();
        case G:
            return Hydrogen.G.getAmount();
        case U:
            return Hydrogen.U.getAmount();
        default:
            throw new UnknownError("Unknown molecule");
        }
    }

    /**
     * Get the molar mass of the molecule.
     * @return The weight
     */
    public int getMolarMass() {
        switch (molecule) {
        case A:
            return MolarMass.A.getWeight();
        case C:
            return MolarMass.C.getWeight();
        case G:
            return MolarMass.G.getWeight();
        case U:
            return MolarMass.U.getWeight();
        default:
            throw new UnknownError("Unknown molecule");
        }
    }

    public Molecule getMolecule() { return this.molecule; }

    /**
     * Get the amount of nitrogen molecule
     * @return The amount
     */
    public int getNitrogen() {
        switch (molecule) {
        case A:
            return Nitrogen.A.getAmount();
        case C:
            return Nitrogen.C.getAmount();
        case G:
            return Nitrogen.G.getAmount();
        case U:
            return Nitrogen.U.getAmount();
        default:
            throw new UnknownError("Unknown molecule");
        }
    }

    /**
     * Get the amount of oxygen molecule
     * @return The amount
     */
    public int getOxygen() {
        switch (molecule) {
        case A:
            return Oxygen.A.getAmount();
        case C:
            return Oxygen.C.getAmount();
        case G:
            return Oxygen.G.getAmount();
        case U:
            return Oxygen.U.getAmount();
        default:
            throw new UnknownError("Unknown molecule");
        }
    }

    /**
     * Constructor
     * @param molecule Molecule of the nucleotide
     */
    public Nucleotide(Molecule molecule) { this.molecule = molecule; }

    /**
     * Cast a character to an appropriate nucleotide.
     * @param  character Character to cast
     * @return           The nucleotide
     */
    public static Nucleotide castToNucleotide(char character) {
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

    /**
     * Return the molecule name of the nucleotide.
     * @return The molecule name
     */
    @Override
    public String toString() { return molecule.toString(); }
}