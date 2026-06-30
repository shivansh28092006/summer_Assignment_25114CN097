// Write a program to Create student record system using arrays and strings. 

import java.util.Scanner;

public class Ques_117{
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int[] rollNo = new int[5];
        String[] name = new String[5];
        String[] course = new String[5];

        int count = 0;
        int choice;

        do {
            System.out.println("\t \t \t<<< Student Record System >>>");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();
            

            switch (choice) {

                case 1:
                    if (count < rollNo.length) {
                        System.out.print("Enter Roll Number: ");
                        rollNo[count] = scnr.nextInt();
                        scnr.nextLine();

                        System.out.print("Enter Student Name: ");
                        name[count] = scnr.nextLine();

                        System.out.print("Enter Course Name: ");
                        course[count] = scnr.nextLine();

                        count++;
                        System.out.println("Student record added successfully.");
                    } else {
                        System.out.println("Student record limit reached.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records to display.");
                    } else {
                        System.out.println("\n--- Student Records ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll No : " + rollNo[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Course  : " + course[i]);
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No records available.");
                        break;
                    }

                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = scnr.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == searchRoll) {
                            System.out.println("\nRecord Found:");
                            System.out.println("Roll No : " + rollNo[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Course  : " + course[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Student Record System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
    
}