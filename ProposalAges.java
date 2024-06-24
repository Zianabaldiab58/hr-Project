import java.util.Scanner;
import java.util.Arrays; // Import Arrays class for sorting
import java.util.Collections; // Import Collections for reverseOrder()

public class ProposalAges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of proposals: ");
        int numProposals = scanner.nextInt();
        Integer[] ages = new Integer[numProposals]; // Use Integer to utilize Collections.reverseOrder() in sorting
        int countEligible = 0; // Counter for eligible participants
        System.out.println("Enter the ages of people who made proposals:");
        for (int i = 0; i < numProposals; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            int age = scanner.nextInt();

            // Check age eligibility and modify the age array accordingly
            if (age < 18) {
                ages[i] = 0;
            } else {
                ages[i] = age;
                countEligible++; // Increment count for eligible ages
            }
        }
        scanner.close();
        Arrays.sort(ages, Collections.reverseOrder());
        printAges(ages);
        System.out.println("\nNumber of people eligible to meet the team: " + countEligible);}
    public static void printAges(Integer[] ages) {
        System.out.println("\nAges of people who made proposals:");

        for (int age : ages) {
            System.out.println(age + " years old ");

        for (Integer age : ages) {
            if (age == 0) {
                System.out.println("can't meet the team"); // Print this for ineligible participants
            } else {
                System.out.println(age + " years old"); // Print age for eligible participants
            }

        }
    }
}
