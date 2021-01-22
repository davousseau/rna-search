package com.rna.search;

/**
 * Carbon molecule
 * @author  David Brousseau
 * @version 0.1
 */
public enum Carbon {
    A(5),
    C(4),
    G(5),
    U(4);

    /** Amount of atom */
    private final int amount;

    /**
     * Constructeur
     * @param amount Amount of atom
     */
    Carbon(int amount) { this.amount = amount; }

    /**
     * Get the amount of atom for the carbon molecule.
     * @return The amount
     */
    public int getAmount() { return this.amount; }
}
