public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace this with your input
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to track the presence of each letter in the alphabet
        boolean[] alphabet = new boolean[26];

        // Convert the input to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Mark the letter as seen in the alphabet array
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all letters of the alphabet have been seen
        for (boolean letterSeen : alphabet) {
            if (!letterSeen) {
                return false;
            }
        }

        return true;
    }
}
