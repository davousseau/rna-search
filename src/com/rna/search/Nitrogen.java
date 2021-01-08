package com.rna.search;

/**
 * Nitrogen molecule
 * @author  David Brousseau
 * @version 0.1
 */
public enum Nitrogen {
    A(5),
    C(3),
    G(5),
    U(2);

    /** Amount of atom */
    private final int amount;

    /**
     * Constructeur
     * @param amount Amount of atom
     */
    Nitrogen(int amount) { this.amount = amount; }

    /**
     * Get the amount of atom for the nitrogen molecule.
     * @return The amount
     */
    public int getAmount() { return this.amount; }
}