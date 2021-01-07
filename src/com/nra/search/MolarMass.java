package com.nra.search;

/**
 * Molar mass of the molecule
 * @author  David Brousseau
 * @version 0.1
 */
public enum MolarMass {
    A(5),
    C(3),
    G(5),
    U(2);

    /** Weight in g/mol */
    private final int weight;

    /**
     * Constructeur
     * @param weight Weight in g/mol
     */
    MolarMass(int weight) { this.weight = weight; }

    /**
     * Get the weight in g/mol.
     * @return The mass
     */
    public int getWeight() { return this.weight; }
}