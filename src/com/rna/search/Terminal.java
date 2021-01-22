package com.rna.search;

import java.util.Scanner;

/**
 * Terminal main class
 * @author  David Brousseau
 * @version 0.1
 */
public class Terminal {

    /** Ribonucleic acid engine */
    private final RNAEngine engine;

    /** Input scanner */
    private final Scanner scanner;

    /** Constructor */
    private Terminal() {
        scanner = new Scanner(System.in);
        String input = readRNAInput();
        validateRNAFormat(input);
        engine = new RNAEngine(input);
        printSummary();
        input = readRequestInput();
        validateRequestFormat(input);
        printResult(input);
    }

    /**
     * Cleanly quits the software.
     * @param status Exit status
     */
    private void exit(int status) {
        scanner.close();
        System.exit(status);
    }

    /**
     * Check if the RNA input characters are A, C, G or U.
     * @param  input RNA input
     * @return       True of False
     */
    private boolean isACGU(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'A' && input.charAt(i) != 'C' && input.charAt(i) != 'G' && input.charAt(i) != 'U') {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if the request input is an amino acid.
     * @param  input Request input
     * @return       True of False
     */
    private boolean isAminoAcid(String input) {
        if (input.equals(AminoAcid.ALA.toString()) || input.equals(AminoAcid.ARG.toString())
            || input.equals(AminoAcid.ASN.toString()) || input.equals(AminoAcid.ASP.toString())
            || input.equals(AminoAcid.CYS.toString()) || input.equals(AminoAcid.GLN.toString())
            || input.equals(AminoAcid.GLU.toString()) || input.equals(AminoAcid.GLY.toString())
            || input.equals(AminoAcid.HIS.toString()) || input.equals(AminoAcid.ILE.toString())
            || input.equals(AminoAcid.LEU.toString()) || input.equals(AminoAcid.LYS.toString())
            || input.equals(AminoAcid.MET.toString()) || input.equals(AminoAcid.PHE.toString())
            || input.equals(AminoAcid.PRO.toString()) || input.equals(AminoAcid.PYL.toString())
            || input.equals(AminoAcid.SEC.toString()) || input.equals(AminoAcid.SER.toString())
            || input.equals(AminoAcid.THR.toString()) || input.equals(AminoAcid.TRP.toString())
            || input.equals(AminoAcid.TYR.toString()) || input.equals(AminoAcid.VAL.toString())) {
            return true;
        }
        return false;
    }

    /**
     * Check if the RNA input length is greater than 5.
     * @param  input RNA input
     * @return       True of False
     */
    private boolean isGreaterThan5(String input) {
        if (input.length() > 5) { return true; }
        return false;
    }

    /**
     * Check if the RNA input length is a multiple of 3.
     * @param  input RNA input
     * @return       True of False
     */
    private boolean isMultiple3(String input) {
        if (input.length() % 3 == 0) { return true; }
        return false;
    }

    /**
     * Check if the request input is a nucleotide set.
     * @param  input Request input
     * @return       True of False
     */
    private boolean isNucleotideSet(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != NucleotideSet.R.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.Y.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.S.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.W.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.K.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.M.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.B.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.D.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.H.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.V.toString().charAt(0)
                && input.charAt(i) != NucleotideSet.N.toString().charAt(0)
                //@formatter:off
                && ! isACGU(input.substring(i, i + 1))) {
                //@formatter:on
                return false;
            }
        }
        return true;
    }

    /** Print the positions found by the engine. */
    private void printPositions() {
        int positions[] = engine.getPositions();
        String s = "";
        for (int i = 0; i < positions.length; i++) {
            if (positions[i] != 0) { s += positions[i]; }
            if (i != positions.length - 1 && positions[i + 1] != 0) { s += ", "; }
        }
        System.out.println(s);
    }

    /**
     * Print the result of the request entered by the user.
     * @param input Request input
     */
    private void printResult(String input) {
        System.out.println("--------------------------");
        System.out.println("Résultat (positions)");
        System.out.println("--------------------------");
        if (isAminoAcid(input)) {
            engine.searchByAbbreviation(input);
        } else {
            engine.searchByNucleotides(input);
        }
        if (engine.positionsFound()) {
            printPositions();
        } else {
            System.out.println("Aucun acid aminé trouvé");
            System.out.println("--------------------------");
        }
        exit(0);
    }

    /** Print the summary of the RNA entered by the user. */
    private void printSummary() {
        System.out.println("--------------------------");
        System.out.println("Sommaire");
        System.out.println("--------------------------");
        System.out.printf("Carbone       : %s\n", engine.sumCarbon());
        System.out.printf("Hydrogène     : %s\n", engine.sumHydrogen());
        System.out.printf("Azote         : %s\n", engine.sumNitrogen());
        System.out.printf("Oxygène       : %s\n", engine.sumOxygen());
        System.out.printf("Masse molaire : %s\n", engine.sumMolarMass());
    }

    /**
     * Read the RNA input.
     * @return The input
     */
    private String readRNAInput() {
        System.out.println("--------------------------");
        System.out.println("Entrer votre ARN :");
        final String input = scanner.nextLine();
        return input;
    }

    /**
     * Read the request input.
     * @return The input
     */
    private String readRequestInput() {
        System.out.println("--------------------------");
        System.out.println("Entrer votre requête :");
        final String input = scanner.nextLine();
        return input;
    }

    /**
     * Validate the request input format.
     * @param input Request input
     */
    private void validateRequestFormat(String input) {
        if (! ((isAminoAcid(input) || isNucleotideSet(input)) && isMultiple3(input))) {
            System.err.println("Votre requête est invalide");
            System.out.println("--------------------------");
            exit(1);
        }
    }

    /**
     * Validate the RNA input format.
     * @param input RNA input
     */
    private void validateRNAFormat(String input) {
        if (! (isACGU(input) && isGreaterThan5(input) && isMultiple3(input))) {
            System.err.println("Votre ARN est invalide");
            System.out.println("--------------------------");
            exit(1);
        }
    }

    /**
     * Launch the software.
     * @param args Arguments
     */
    public static void main(String args[]) { new Terminal(); }
}
