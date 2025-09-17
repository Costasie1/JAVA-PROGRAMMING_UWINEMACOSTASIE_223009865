package javaASS;

import java.util.Scanner;

public class attendance {

	public static void main(String[] args) {

		        Scanner att = new Scanner(System.in);

		        // Enter class size
		        System.out.print("Enter total number of students in the class: ");
		        int classSize = att.nextInt();

		        // Maximum of 30 days
		        int[] attendance = new int[30];
		        int days = 0;

		        // record daily attendance
		        String choice;
		        do {
		            System.out.print("\nEnter number of students present on Day " + (days + 1) + ": ");
		            attendance[days] = att.nextInt();
		            days++;

		            att.nextLine(); // clear input buffer
		            System.out.print("Do you want to enter attendance for another day? (yes/no): ");
		            choice = att.nextLine().toLowerCase();
		        } while (choice.equals("yes") && days < 30);

		        // Step 3: After data entry
		        int totalAttendance = 0;
		        int lowDays = 0;

		        System.out.println("\n------ ATTENDANCE SUMMARY ------");
		        System.out.println();
		        for (int i = 0; i < days; i++) {
		            System.out.println((i + 1));
		            totalAttendance += attendance[i];

		            // check if below 50%
		            if (attendance[i] < (classSize / 2.0)) {
		                lowDays++;
		            }
		        }

		        // Calculate average attendance
		        double average = (double) totalAttendance / days;
		        double lowPercentage = (lowDays * 100.0) / days;

		        System.out.println("---------------------------------");
		        System.out.print("Average Attendance: %.2f\n", average);
		        System.out.print("Days with Low Attendance (<50%%): %d (%.2f%%)\n", lowDays, lowPercentage);

		        att.close();
		   


	}

}
