package com.company;

public class NumberTranslator {
    public static void main(String[] args) {
        System.out.println(new NumberTranslator().translate("  vi"));
    }

    public int translate(String romanNumber) {
        int x;
        String romanNumberRed = romanNumber.toUpperCase().trim();
        switch (romanNumberRed) {
            case "I":
                x = 1;
                return x;
            case "II":
                x = 2;
                return x;

            case "III":
                x = 3;
                return x;

            case "IV":
                x = 4;
                return x;

            case "V":
                x = 5;
                return x;

            case "VI":
                x = 6;
                return x;

            case "VII":
                x = 7;
                return x;

            case "VIII":
                x = 8;
                return x;

            case "IX":
                x = 9;
                return x;

            case "X":
                x = 10;
                return x;

            case "XI":
                x = 11;
                return x;

            case "XII":
                x = 12;
                return x;



            default:
                throw new IllegalStateException("Unexpected value: " + romanNumberRed);
        }


    }




}
