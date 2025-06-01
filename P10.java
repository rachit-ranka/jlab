public class P10 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";

        System.out.println("i) Difference between equals() and == operator:");
        System.out.println("s1 == s2: " + (s1 == s2));             // false, different objects
        System.out.println("s1.equals(s2): " + s1.equals(s2));     // true, same content
        System.out.println("s3 == s4: " + (s3 == s4));             // true, string pool

        System.out.println();

        // Palindrome check
        String original = "madam";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("ii) Palindrome Check:");
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        System.out.println();

        // Convert to character array
        System.out.println("iii) String to character array:");
        char[] charArray = original.toCharArray();
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
} 