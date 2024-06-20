import java.util.Scanner;
import java.util.Arrays;// Import Arrays class for sorting

public class ProposalAges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of proposals: ");
        int numProposals = scanner.nextInt();
        int[] ages = new int[numProposals];
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
        printAges(ages);
    }
    public static void printAges(int[] ages) {
        System.out.println("\nAges of people who made proposals:");
        // Print ages in reverse order for descending sort
        for (int i = ages.length - 1; i >= 0; i--) {
            System.out.println(ages[i] + " years old");
        }
    }}
