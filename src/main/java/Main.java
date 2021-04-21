import java.util.Scanner;

/**
 * PrintTreeWithAsteriskCharacter
 *
 * The Main class implements methods for
 * get line count from user and prints a
 * tree with asterisk character according
 * to the given line count.
 *
 * @author Muratcan Yeldan
 * @since 21/04/2021
 */

public class Main {

    /**
     * This is the main method which makes use of printTree method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        Main treeCreator = new Main();
        treeCreator.printTree();
    }

    /**
     * This method used for get tree line count from user and make sure
     * entered value is valid.
     */
    private void printTree() {

        String lineCountString = "";
        int lineCount = 0;
        //create a scanner for read data from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line count for tree or type quit for close the program : ");

        while (!((lineCountString = scanner.nextLine()).equals("quit"))) {

            try {
                lineCount = Integer.parseInt(lineCountString);
                if (lineCount < 1) {
                    System.out.println("Line count must be a positive integer !");
                    lineCount = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry type, only positive integers are accepted !");
                lineCount = 0;
            }

            if(lineCount >= 1){
                printTreeWithAsterisk(lineCount);
            }
        }
        //close scanner
        scanner.close();
    }

    /**
     * This method used for create a tree with given treeLineCount
     * and prints it to the screen.
     *
     * @param treeLineCount Number of tree lines.
     */
    private void printTreeWithAsterisk(int treeLineCount) {
        for (int i = 0; i < treeLineCount; i++) {
            for (int j = 0; j < treeLineCount - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Enter line count for tree or type quit for close the program : ");
    }
}
