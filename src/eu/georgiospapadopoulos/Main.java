package eu.georgiospapadopoulos;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    /**
     * A year is a leap year if it s divisible by 4 but not by 100
     * or if it is divisible by 400.
     *
     * @param year Year to be checked
     * @return true if year is leap year
     */

    private static boolean isLeapYear(int year) {
        if (year < 1 || year >= 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calls method isLeapYear to find if it is.
     *
     * @param month Input, selected month.
     * @param year  Input, selected year.
     * @return Returns number of days in selected month of selected year.
     */

    private static int getDaysInMonth(int month, int year) {
        boolean isLeapYear = isLeapYear(year);

        if (year < 1 || year > 9999) {
            return -1;
        }


        switch (month) {
            case 1:
                return 31;

            case 2:
                if (isLeapYear) {
                    return 29;

                } else {
                    return 28;

                }

            case 3:
                return 31;


            case 4:
                return 30;


            case 5:
                return 31;


            case 6:
                return 30;


            case 7:
                return 31;


            case 8:
                return 31;


            case 9:
                return 30;


            case 10:
                return 31;


            case 11:
                return 30;


            case 12:
                return 31;

            default:
                return -1;

        }

    }
}
