package javaASS;

import java.util.Scanner;

public class supermarketbill {

	public static void main(String[] args) {

				        Scanner input = new Scanner(System.in);

				        //Ask how many items
				        System.out.println("Enter number of different items: ");
				        int n = input.nextInt();

				        // Arrays to store item details
				        String[] itemNames = new String[n];
				        double[] prices = new double[n];
				        int[] quantities = new int[n];
				        double[] subtotals = new double[n];

				        double totalBill = 0;

				        // Input details
				        for (int i = 0; i < n; i++) {
				            input.nextLine();
				            System.out.println("\nEnter name of item " + (i + 1) + ": ");
				            itemNames[i] = input.nextLine();

				            System.out.println("Enter price per unit of " + itemNames[i] + ": ");
				            prices[i] = input.nextDouble();

				            System.out.println("Enter quantity of " + itemNames[i] + ": ");
				            quantities[i] = input.nextInt();

				            // Step 4: Calculate sub_total and add to total
				            subtotals[i] = prices[i] * quantities[i];
				            totalBill += subtotals[i];
				        }

				        // Check input amount
				        double amount = 0;
				        if (totalBill > 50000) {
				            amount = totalBill * 0.05; // 5% amount
				        }
				        double finalAmount = totalBill - amount;

				        // print receipt
				        System.out.println("\n................SUPERMARKET RECEIPT...................");
				        System.out.print("%-15s %-10s %-10s %-10s\n");
				        for (int i = 0; i < n; i++) {
				            System.out.println();
				        }
				        System.out.println("----------------------------------");
				        System.out.println(totalBill);
				        System.out.println(amount);
				        System.out.println(finalAmount);
				        System.out.println("THANK YOU FOR COMING! VISIT US AGAIN");

				        input.close();
				    }



	}


