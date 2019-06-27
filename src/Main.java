import java.util.Random;
import java.util.Scanner;

/**
 * The main interface of the application.
 */
public final class Main {
    
    /**
     * Gets a random letter from the given alphabet.
     * @param alphabet the array to get the value from
     * @return a random character
     */
    private final static char getRandomLetter(final char[] alphabet) {
        final Random r = new Random();
        final int index = r.nextInt(alphabet.length);
        return alphabet[index];
    }
    
    /**
     * The main method launching the application.
     *
     * @param args command-line arguments (not used)
     */
    public final static void main(String[] args) {
        
        final Scanner in = new Scanner(System.in);
        String name;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean working = true;
        
        System.out.println("Welcome to RandomNamer!");
        System.out.print("The current alphabet is: ");
        
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
        
        System.out.print("\nInitial letter(s): ");
        final String first = in.nextLine();
        
        System.out.print("Length of the name: ");
        final int length = in.nextInt();
        
        if (length <= 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        System.out.print("Number of names: ");
        final int count = in.nextInt();
    
        if (count <= 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        while(working) {
            for (int i = 0; i < count; i++) {
                name = first;
                
                for (int j = 1; j < length; j++) {
                    name += getRandomLetter(alphabet);
                }
                
                System.out.println("Your name: " + name);
            }
            
            System.out.print("Press 0 to exit or 1 to generate another set: ");
            if (in.nextInt() == 0) {
                working = false;
            }
        }
        
        System.out.println("Goodbye!");
    }
}