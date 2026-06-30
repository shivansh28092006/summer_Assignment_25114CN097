//Write a program to Create mini employee management system.

import java.util.Scanner;

public class Ques_119 {
    public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);

        int[] empId = new int[5];
        String[] empName = new String[5];
        String[] empDept = new String[5];
        double[] empSalary = new double[5];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Mini Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();
            

            switch (choice) {

                case 1:
                    if (count < empId.length) {
                        System.out.print("Enter Employee ID: ");
                        empId[count] = scnr.nextInt();
                        scnr.nextLine();

                        System.out.print("Enter Employee Name: ");
                        empName[count] = scnr.nextLine();

                        System.out.print("Enter Department: ");
                        empDept[count] = scnr.nextLine();

                        System.out.print("Enter Salary: ");
                        empSalary[count] = scnr.nextDouble();

                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee limit reached.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records available.");
                    } else {
                        System.out.println("\n--- Employee Records ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID     : " + empId[i]);
                            System.out.println("Name   : " + empName[i]);
                            System.out.println("Dept   : " + empDept[i]);
                            System.out.println("Salary : " + empSalary[i]);
                            System.out.println("------------------------");
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No employee records available.");
                        break;
                    }

                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scnr.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("\nEmployee Found:");
                            System.out.println("ID     : " + empId[i]);
                            System.out.println("Name   : " + empName[i]);
                            System.out.println("Dept   : " + empDept[i]);
                            System.out.println("Salary : " + empSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found.");
                    break;

                case 4:
                    System.out.println("Exiting Mini Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
    
}
