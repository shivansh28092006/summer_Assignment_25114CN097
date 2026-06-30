//Write a program to Develop complete mini project using arrays, strings and functions.

import java.util.Scanner;

class HabitTracker {

    static Scanner scnr = new Scanner(System.in);

    static String[] habits = new String[10];
    static boolean[] status = new boolean[10];
    static int count = 0;

    static void addHabit() {
        if (count >= habits.length) {
            System.out.println("Habit list is full!");
            return;
        }
        System.out.print("Enter habit name: ");
        habits[count] = scnr.nextLine();
        status[count] = false;
        count++;
        System.out.println("Habit added successfully!");
    }

   
    static void markCompleted() {
        if (count == 0) {
            System.out.println("No habits available.");
            return;
        }

        viewHabits();
        System.out.print("Enter habit number to mark completed: ");
        int choice = scnr.nextInt();
        scnr.nextLine();

        if (choice >= 1 && choice <= count) {
            status[choice - 1] = true;
            System.out.println("Habit marked as completed!");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    static void viewHabits() {
        if (count == 0) {
            System.out.println("No habits to display.");
            return;
        }

        System.out.println("\nHabit List:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + habits[i] + " - " +
                    (status[i] ? "Completed" : "Pending"));
        }
    }
    static void showProgress() {
        if (count == 0) {
            System.out.println("No habits available.");
            return;
        }

        int completed = 0;
        for (int i = 0; i < count; i++) {
            if (status[i])
                completed++;
        }

        double percent = (completed * 100.0) / count;
        System.out.println("Completion Progress: " + percent + "%");
    }


public class Ques_120 {

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\t \t \t <<< HABIT TRACKER MENU >>>");
            System.out.println("1. Add Habit");
            System.out.println("2. Mark Habit as Completed");
            System.out.println("3. View All Habits");
            System.out.println("4. View Progress");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scnr.nextInt();
            scnr.nextLine();

            switch (choice) {
                case 1:
                    addHabit();
                    break;
                case 2:
                    markCompleted();
                    break;
                case 3:
                    viewHabits();
                    break;
                case 4:
                    showProgress();
                    break;
                case 5:
                    System.out.println("Thank you for using Habit Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } 
        while (choice != 5);
    }
}
}


