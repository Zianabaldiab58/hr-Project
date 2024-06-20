import java.util.Scanner;
import java.util.Arrays; // Import Arrays class for sorting
import java.util.Collections; // Import Collections for reverseOrder()

public class ProposalAges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of proposals: ");
        int numProposals = scanner.nextInt();
        Integer[] ages = new Integer[numProposals]; // Change to Integer to use Arrays.sort with a comparator
        System.out.println("Enter the ages of people who made proposals:");
        for (int i = 0; i < numProposals; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            // Set age to 0 if the person is under 18
            if (ages[i] < 18) {
                ages[i] = 0;
            }
        }
        scanner.close();

        // Sort the ages in descending order
        Arrays.sort(ages, Collections.reverseOrder());

        printAges(ages);
    }

    public static void printAges(Integer[] ages) {
        System.out.println("\nAges of people who made proposals:");
        for (int age : ages) {
            System.out.println(age + " years old");
        }
    }
}