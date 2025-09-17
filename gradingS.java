package javaASS;

import java.util.Scanner;

public class gradingS {

	public static void main(String[] args) {

				        Scanner grd = new Scanner(System.in);

				        int totalStudents = 0;
				        int passes = 0;
				        int fails = 0;

				        //asking for marks until -1
				        while (true) {
				            System.out.print("Enter student marks (0-100) or -1 to stop: ");
				            int marks = grd.nextInt();

				            if (marks == -1) {
				                break; 
				            }

				            // validate marks
				            if (marks < 0 || marks > 100) {
				                System.out.println("Invalid marks! Please enter between 0 and 100.");
				                continue;
				            }

				            totalStudents++;

				            // Assign grade
				            if (marks >= 80) {
				                System.out.println("Grade: A");
				                passes++;
				            } else if (marks >= 70) {
				                System.out.println("Grade: B");
				                passes++;
				            } else if (marks >= 60) {
				                System.out.println("Grade: C");
				                passes++;
				            } else if (marks >= 50) {
				                System.out.println("Grade: D");
				                passes++;
				            } else {
				                System.out.println("Grade: F");
				                fails++;
				            }
				        }

				        // Summarized report
				        System.out.println("\n------ CLASS SUMMARY ------");
				        System.out.println("Total students: " + totalStudents);
				        System.out.println("Passed: " + passes);
				        System.out.println("Failed: " + fails);

				        if (totalStudents > 0) {
				            double passRate = (passes * 100.0) / totalStudents;
				            System.out.println("average:\t\t"+passRate);
				        } else {
				            System.out.println("No student data entered.");
				        }

				        grd.close();
				    }
				}

			
