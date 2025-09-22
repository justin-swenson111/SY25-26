// This program checks a user's eligibility for a discount based on a few conditions.
// It contains some common boolean logic errors that need to be fixed.


public class DiscountChecker {


    public static boolean isEligibleForDiscount(int age, boolean hasMembership, String promoCode) {
       
        // Condition 1: The user is over 65 years old.
        boolean isSenior = age > 65;
       
        // Condition 2: The user has a valid membership.
        boolean isMember = hasMembership;


        // Condition 3: The user has a special promo code.
        boolean hasPromo = promoCode.equals("SAVEBIG");


        // Bug 1: The logic for the "VIP" discount is flawed.
        // It's intended to be for senior members OR those with the promo code.
        boolean isVIP = isMember && (isSenior || hasPromo);


        // Bug 2: The logic for the "Standard" discount is flawed.
        // It's intended for any member who is NOT a senior and does NOT have the promo code.
        boolean isStandard = isMember && !isSenior && !hasPromo;
       
        // Bug 3: The final return statement has a logical error.
        // It should return true if the user qualifies for ANY of the discounts.
        if (isVIP || hasPromo) {
            return true;
        } else {
            return false;
        }
    }
   
    public static void main(String[] args) {
        // Test Cases
        System.out.println("Test Case 1: Senior Member with Promo Code");
        // Expected result: true (qualifies for VIP)
        System.out.println("Is eligible for discount? " + isEligibleForDiscount(70, true, "SAVEBIG")); // Should be true


        System.out.println("\nTest Case 2: Standard Member without Promo Code");
        // Expected result: false (qualifies for Standard)
        System.out.println("Is eligible for discount? " + isEligibleForDiscount(30, true, "")); // Should be false


        System.out.println("\nTest Case 3: Senior with No Membership or Promo Code");
        // Expected result: false
        System.out.println("Is eligible for discount? " + isEligibleForDiscount(80, false, "")); // Should be false


        System.out.println("\nTest Case 4: Non-Member with Promo Code");
        // Expected result: true (qualifies for VIP)
        System.out.println("Is eligible for discount? " + isEligibleForDiscount(25, false, "SAVEBIG")); // Should be true
    }
}
