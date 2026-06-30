// Write a program to Create mini library system. 

import java.util.Scanner;

public class Ques_118 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] bookId = new int[5];
        String[] bookName = new String[5];
        boolean[] isIssued = new boolean[5];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();
            

            switch (choice) {

                case 1:
                    if (count < bookId.length) {
                        System.out.print("Enter Book ID: ");
                        bookId[count] = scnr.nextInt();
                        scnr.nextLine();

                        System.out.print("Enter Book Name: ");
                        bookName[count] = scnr.nextLine();

                        isIssued[count] = false;
                        count++;

                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\n--- Book List ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Book ID   : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Status    : " + (isIssued[i] ? "Issued" : "Available"));
                            System.out.println("-----------------------");
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scnr.nextInt();
                    boolean issued = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issueId) {
                            if (!isIssued[i]) {
                                isIssued[i] = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            issued = true;
                            break;
                        }
                    }

                    if (!issued)
                        System.out.println("Book not found.");
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    System.out.print("Enter Book ID to return: ");
                    int returnId = scnr.nextInt();
                    boolean returned = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == returnId) {
                            if (isIssued[i]) {
                                isIssued[i] = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            returned = true;
                            break;
                        }
                    }

                    if (!returned)
                        System.out.println("Book not found.");
                    break;

                case 5:
                    System.out.println("Exiting Mini Library System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}