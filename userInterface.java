import java.util.Scanner;

public class userInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("  ******** Category Information ********  ");
        System.out.println();

        // category1
        System.out.print("Please enter the name of the category 1: ");
        String name1 = scanner.nextLine();
        String isim1 = formatCategoryName(name1);

        System.out.print("Please enter how many items of type "
                + isim1 + " were given: ");
        int quantity1 = scanner.nextInt();
        boolean miktardy1 = isQuantityValid(quantity1);
        while (miktardy1 != true) {
            System.out.print("Please enter how many items of type "
                    + isim1 + " were given: ");
            quantity1 = scanner.nextInt();
            miktardy1 = isQuantityValid(quantity1);
        }
        int toplamPercantage = 0;
        System.out.print("Please enter the percentage weight of "
                + isim1 + ": ");
        int percentage1 = scanner.nextInt();
        boolean percentageresult1 = isWeightValid(percentage1, toplamPercantage);
        while (percentageresult1 == false) {
            System.out.print("Please enter the percentage weight of "
                    + isim1 + ": ");
            percentage1 = scanner.nextInt();
            percentageresult1 = isWeightValid(percentage1, toplamPercantage);
        }
        toplamPercantage += percentage1;
        scanner.nextLine();
        System.out.println();

        // category2
        System.out.print("Please enter the name of the category 2: ");
        String name2 = scanner.nextLine();
        String isim2 = formatCategoryName(name2);

        System.out.print("Please enter how many items of type "
                + isim2 + " were given: ");
        int quantity2 = scanner.nextInt();
        boolean miktardy2 = isQuantityValid(quantity2);
        while (miktardy2 != true) {
            System.out.print("Please enter how many items of type "
                    + isim2 + " were given: ");
            quantity2 = scanner.nextInt();
            miktardy2 = isQuantityValid(quantity2);
        }
        System.out.print("Please enter the percentage weight of "
                + isim2 + ": ");
        int percentage2 = scanner.nextInt();
        boolean percentageresult2 = isWeightValid(percentage2, toplamPercantage);
        while (percentageresult2 == false) {
            System.out.print("Please enter the percentage weight of "
                    + isim2 + ": ");
            percentage2 = scanner.nextInt();
            percentageresult2 = isWeightValid(percentage2, toplamPercantage);
        }
        toplamPercantage += percentage2;
        scanner.nextLine();
        System.out.println();

        // category3
        System.out.print("Please enter the name of the category 3: ");
        String name3 = scanner.nextLine();
        String isim3 = formatCategoryName(name3);

        System.out.print("Please enter how many items of type "
                + isim3 + " were given: ");
        int quantity3 = scanner.nextInt();
        boolean miktardy3 = isQuantityValid(quantity3);
        while (miktardy3 != true) {
            System.out.print("Please enter how many items of type "
                    + isim3 + " were given: ");
            quantity3 = scanner.nextInt();
            miktardy3 = isQuantityValid(quantity3);
        }
        System.out.print("Please enter the percentage weight of "
                + isim3 + ": ");
        int percentage3 = scanner.nextInt();
        boolean percentageresult3 = isWeightValid(percentage3, toplamPercantage);
        while (percentageresult3 == false) {
            System.out.print("Please enter the percentage weight of "
                    + isim3 + ": ");
            percentage3 = scanner.nextInt();
            percentageresult3 = isWeightValid(percentage3, toplamPercantage);
        }
        toplamPercantage += percentage3;
        scanner.nextLine();
        System.out.println();

        // category4
        System.out.print("Please enter the name of the category 4: ");
        String name4 = scanner.nextLine();
        String isim4 = formatCategoryName(name4);

        System.out.print("Please enter how many items of type "
                + isim4 + " were given: ");
        int quantity4 = scanner.nextInt();
        boolean miktardy4 = isQuantityValid(quantity4);
        while (miktardy4 != true) {
            System.out.print("Please enter how many items of type "
                    + isim4 + " were given: ");
            quantity4 = scanner.nextInt();
            miktardy4 = isQuantityValid(quantity4);
        }
        System.out.print("Please enter the percentage weight of "
                + isim4 + ": ");
        int percentage4 = scanner.nextInt();
        boolean percentageresult4 = isWeightValid(percentage4, toplamPercantage);
        while (percentageresult4 = false) {
            System.out.print("Please enter the percentage weight of "
                    + isim4 + ": ");
            percentage4 = scanner.nextInt();
            percentageresult4 = isWeightValid(percentage4, toplamPercantage);
        }
        toplamPercantage += percentage4;
        scanner.nextLine();
        System.out.println();

        // category5
        System.out.print("Please enter the name of the category 5: ");
        String name5 = scanner.nextLine();
        String isim5 = formatCategoryName(name5);

        System.out.print("Please enter how many items of type "
                + isim5 + " were given: ");
        int quantity5 = scanner.nextInt();
        boolean miktardy5 = isQuantityValid(quantity5);
        while (miktardy5 != true) {
            System.out.print("Please enter how many items of type "
                    + isim5 + " were given: ");
            quantity5 = scanner.nextInt();
            miktardy5 = isQuantityValid(quantity5);
        }
        System.out.print("Please enter the percentage weight of "
                + isim5 + ": ");
        int percentage5 = scanner.nextInt();
        boolean percentageresult5 = isWeightValid(percentage5, toplamPercantage);
        while (percentageresult5 == false) {
            System.out.print("Please enter the percentage weight of "
                    + isim5 + ": ");
            percentage5 = scanner.nextInt();
            percentageresult5 = isWeightValid(percentage5, toplamPercantage);
        }
        toplamPercantage += percentage5;
        scanner.nextLine();
        System.out.println();

        if (toplamPercantage != 100) {
            System.out.println("ERROR: The values sum to "
                    + toplamPercantage + " but should sum to 100");
            return;
        }

        System.out.println("  ******** Student Grades Entry ********");
        System.out.println();

        System.out.println("Please enter values that "
                + "the student earned for each item:");

        double total1 = 0;
        for (int i = 1; i <= quantity1; i++) {
            System.out.print(isim1 + " " + i + ": ");
            double not1 = scanner.nextDouble();
            total1 += not1;
        }

        double total2 = 0;
        for (int i = 1; i <= quantity2; i++) {
            System.out.print(isim2 + " " + i + ": ");
            double not2 = scanner.nextDouble();
            total2 += not2;
        }

        double total3 = 0;
        for (int i = 1; i <= quantity3; i++) {
            System.out.print(isim3 + " " + i + ": ");
            double not3 = scanner.nextDouble();
            total3 += not3;
        }

        double total4 = 0;
        for (int i = 1; i <= quantity4; i++) {
            System.out.print(isim4 + " " + i + ": ");
            double not4 = scanner.nextDouble();
            total4 += not4;
        }

        double total5 = 0;
        for (int i = 1; i <= quantity5; i++) {
            System.out.print(isim5 + " " + i + ": ");
            double not5 = scanner.nextDouble();
            total5 += not5;
        }
        System.out.println();

        System.out.println("  ******** Student Result *******");
        System.out.println();

        double result1 = (total1 / quantity1) * (percentage1 / 100.0);
        double result2 = (total2 / quantity2) * (percentage2 / 100.0);
        double result3 = (total3 / quantity3) * (percentage3 / 100.0);
        double result4 = (total4 / quantity4) * (percentage4 / 100.0);
        double result5 = (total5 / quantity5) * (percentage5 / 100.0);

        double finalResult = result1 + result2 + result3 + result4 + result5;

        String gradeletter = gradeLetter(finalResult);
        double gpapoint = gpaPoints(finalResult);
        String status = status(finalResult);

        System.out.println(isim1 + ": " + (result1) / (percentage1 / 100.0));
        System.out.println(isim2 + ": " + (result2) / (percentage2 / 100.0));
        System.out.println(isim3 + ": " + (result3) / (percentage3 / 100.0));
        System.out.println(isim4 + ": " + (result4) / (percentage4 / 100.0));
        System.out.println(isim5 + ": " + (result5) / (percentage5 / 100.0));

        System.out.println("The student has " + status + " CSE 101"
                + " with a score of " + finalResult + ", GPA points of "
                + gpapoint + ", and a grade letter of " + gradeletter);
    }

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