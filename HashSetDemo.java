/**
 * Piper Howell
 * ITEC 302
 * HashSet Demo
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class demonstrates the functionality of a HashSet.
 * It allows adding elements to the set, removing items from the set,
 * and showing the contents of the set after each operation.
 */
public class HashSetDemo {
    private Set<Integer> hashSet;
    private Scanner scanner;

    /**
     * Constructs a HashSetDemo object.
     * Initializes the HashSet and Scanner.
     */
    public HashSetDemo() {
        this.hashSet = new HashSet<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Adds an element to the HashSet.
     *
     * @param element The element to be added to the HashSet.
     */
    public void addElement(int element) {
        hashSet.add(element);
        System.out.println("Element " + element + " added to the HashSet.");
        displaySet(); // Display contents of the HashSet after addition
    }

    /**
     * Removes an element from the HashSet.
     *
     * @param element The element to be removed from the HashSet.
     */
    public void removeElement(int element) {
        if (hashSet.contains(element)) {
            hashSet.remove(element);
            System.out.println("Element " + element + " removed from the HashSet.");
            displaySet(); // Display contents of the HashSet after removal
        } else {
            System.out.println("Element " + element + " not found in the HashSet.");
        }
    }

    /**
     * Displays the contents of the HashSet.
     */
    public void displaySet() {
        System.out.println("Contents of the HashSet: " + hashSet);
    }

    /**
     * Runs the HashSetDemo program.
     * Provides an interactive menu for adding elements, removing elements,
     * displaying the contents of the set, or exiting the program.
     */
    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\n1. Add element\n2. Remove element\n3. Display HashSet\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int addElement = scanner.nextInt();
                    addElement(addElement);
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    int removeElement = scanner.nextInt();
                    removeElement(removeElement);
                    break;
                case 3:
                    displaySet();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }

    /**
     * The main method creates a HashSetDemo object and runs the program.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        HashSetDemo demo = new HashSetDemo();
        demo.run();
    }
}
