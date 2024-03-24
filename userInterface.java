import java.util.Scanner;

public class userInterface {

    public static String formatCategoryName(String name) {

        String strOne = name.substring(0, 1).toUpperCase();
        String strTwo = name.substring(1).toLowerCase();
        String strEnd = strOne + strTwo;
        return strEnd;
    }

    public static boolean isQuantityValid(int quantity) {

        if (quantity > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isWeightValid(int weight, int totalWeight) {

        if (weight >= 0 && weight + totalWeight <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static String gradeLetter(double grade) {

        String result;
        if (88 <= grade && grade <= 100) {
            result = "AA";
            return result;
        } else if (81 <= grade) {
            result = "BA";
            return result;
        } else if (74 <= grade) {
            result = "BB";
            return result;
        } else if (67 <= grade) {
            result = "CB";
            return result;
        } else if (60 <= grade) {
            result = "CC";
            return result;
        } else if (53 <= grade) {
            result = "DC";
            return result;
        } else if (46 <= grade) {
            result = "DD";
            return result;
        } else if (35 <= grade) {
            result = "FD";
            return result;
        } else {
            result = "FF";
            return result;
        }

    }

    public static double gpaPoints(double grade) {

        double result;
        if (88 <= grade && grade <= 100) {
            result = 4.0;
            return result;
        } else if (81 <= grade) {
            result = 3.5;
            return result;
        } else if (74 <= grade) {
            result = 3.0;
            return result;
        } else if (67 <= grade) {
            result = 2.5;
            return result;
        } else if (60 <= grade) {
            result = 2.0;
            return result;
        } else if (53 <= grade) {
            result = 1.5;
            return result;
        } else if (46 <= grade) {
            result = 1.0;
            return result;
        } else if (35 <= grade) {
            result = 0.5;
            return result;
        } else {
            result = 0.0;
            return result;
        }
    }

    public static String status(double grade) {
        String result;
        if (88 <= grade) {
            result = "passed";
            return result;
        } else if (81 <= grade) {
            result = "passed";
            return result;
        } else if (74 <= grade) {
            result = "passed";
            return result;
        } else if (67 <= grade) {
            result = "passed";
            return result;
        } else if (60 <= grade) {
            result = "passed";
            return result;
        } else if (53 <= grade) {
            result = "conditionally passed";
            return result;
        } else if (46 <= grade) {
            result = "conditionally passed";
            return result;
        } else if (35 <= grade) {
            result = "failed";
            return result;
        } else {
            result = "failed";
            return result;
        }
    }
}