package com.rna.search;

/**
 * Hydrogen molecule
 * @author  David Brousseau
 * @version 0.1
 */
public enum Hydrogen {
    A(5),
    C(5),
    G(5),
    U(4);

    /** Amount of atom */
    private final int amount;

    /**
     * Constructeur
     * @param amount Amount of atom
     */
    Hydrogen(int amount) { this.amount = amount; }

    /**
     * Get the amount of atom for the hydrogen molecule.
     * @return The amount
     */
    public int getAmount() { return this.amount; }
}
