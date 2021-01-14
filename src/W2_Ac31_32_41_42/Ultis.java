package W2_Ac31_32_41_42;

import java.util.Scanner;

public class Ultis {
    public static int getInRanger(int max, int min) {
        Scanner input = new Scanner(System.in);
        int selection = 0;
        do {
            selection = getInt();
            if (selection > max || selection < min) {
                System.out.print("Invalid selection, try again: ");
            }
        } while (selection > max || selection < min);
        return selection;
    }
    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        String numberString;
        double number = 0;
        int check = 0;
        int result = 0;
        do {
            numberString = input.nextLine();
            if (numberString.matches("-?\\d+(\\.\\d+)?")) {
                number = Double.parseDouble(numberString);
                check = 1;
            } else {
                System.out.print("Invalid Number. Re-Enter: ");
            }
        } while (check == 0);
        return number;
    }

    public static int getInt() {
        int result = 0;
        int check = 0;
        do {
            double number = getDouble();
            if (((int) number % number) == 0) {
                result = (int) number;
                check = 1;
            } else {
                System.out.print("It is not Integer! Re-Enter: ");
            }
        } while (check == 0);
        return result;
    }

    public static boolean hasOrNot() {
        Scanner input = new Scanner(System.in);
        boolean has = false;
        boolean check = false;
        do {
            String function = input.nextLine();
            if (function.equals("Y") || function.equals("N") || function.equals("y") || function.equals("n")) {
                if (function.equals("Y")|| function.equals("y")) {
                    has = true;
                } else {
                    has = false;
                }
                check = true;
            } else {
                System.out.print("The answer must be Y or N. Re-Enter: ");
                check = false;
            }
        } while (!check);
        return has;
    }

    public static String convertMoney(long money){
        String result;
        if (money> 1000) { //format tien --> de doc hon xiu
            result = (double)money / 1000000 + "M";
        } else {
            result = money + "K\n";
        }
        return result;
    }

}
