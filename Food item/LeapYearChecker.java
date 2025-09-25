public class LeapYearChecker {

    /**
     * Checks if a given year is a leap year.
     *
     * @param year The year to check.
     * @return true if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {
        // Bug 1: Incorrect order of operations.
        // Bug 2: Missing a crucial condition.
        // Bug 3: Using the wrong logical operator.
        // Bug 4: Incorrect handling of the 100 and 400 rules.

        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        // Test cases to demonstrate the bugs.
        // The expected output is commented next to each line.

        System.out.println("Is 2000 a leap year? " + isLeapYear(2000)); // Expected: true
        System.out.println("Is 1900 a leap year? " + isLeapYear(1900)); // Expected: false
        System.out.println("Is 2024 a leap year? " + isLeapYear(2024)); // Expected: true
        System.out.println("Is 2023 a leap year? " + isLeapYear(2023)); // Expected: false
    }
}