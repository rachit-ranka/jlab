// Custom Exception Class
class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

// Father Class
class Father {
    int age;

    Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        this.age = age;
        System.out.println("Father's age: " + this.age);
    }
}

// Son Class extending Father
class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge); // Call to Father class constructor

        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative.");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age: " + this.sonAge);
    }
}

// Main Class
public class AgeCheck {
    public static void main(String[] args) {
        try {
            Son s = new Son(40, 20);  // Valid input

            // Uncomment the lines below one at a time to test different scenarios:

            // Son s = new Son(40, 45);  // Son's age >= Father's age
            // Son s = new Son(-5, 10);  // Father's age < 0
            // Son s = new Son(50, -1);  // Son's age < 0

        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
