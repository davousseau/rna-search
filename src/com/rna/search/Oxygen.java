package com.rna.search;

/**
 * Oxygen molecule
 * @author  David Brousseau
 * @version 0.1
 */
public enum Oxygen {
    A(0),
    C(1),
    G(1),
    U(2);

    /** Amount of atom */
    private final int amount;

    /**
     * Constructeur
     * @param amount Amount of atom
     */
    Oxygen(int amount) { this.amount = amount; }

    /**
     * Get the amount of atom for the oxygen molecule.
     * @return The amount
     */
    public int getAmount() { return this.amount; }
}