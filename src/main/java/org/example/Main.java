package org.example;

public class Main {

    //Static Variables
    static int staticHex = 0x1A2B;
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection.";

    //Instance Variables
    int instanceBinary = 0b10_1101;
    int instanceOctal = 072;
    double instanceDouble = 12.34_95e2;

    public static void main(String[] args) {

        //Local Variables
        System.out.println("Local Variables:");
        printLocalVariables();
        System.out.println();

        //Instance Variables
        Main main = new Main();
        System.out.println("Instance Variables:");
        main.printInstanceVariables();
        System.out.println();

        //Static Variables
        System.out.println("Static Variables: ");
        printStaticVariables();

    }

    public void printInstanceVariables(){
        System.out.println(" instanceBinary = " + this.instanceBinary);
        System.out.println(" instanceOctal = " + this.instanceOctal);
        System.out.println(" instanceDouble = " + this.instanceDouble);
    }

    public static void printStaticVariables(){
        System.out.println(" staticHex = "  + staticHex);
        System.out.println(" staticByte = " + staticByte);
        System.out.println(" staticString = " + staticString);
    }

    public static void printLocalVariables(){
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10_000_000L;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.println(" localDecimal = " + localDecimal);
        System.out.println(" localHex = " + localHex);
        System.out.println(" localBinary = " + localBinary);
        System.out.println(" localOctal = " + localOctal);
        System.out.println(" localLong = " + localLong);
        System.out.println(" localString = " + localString);
    }

}