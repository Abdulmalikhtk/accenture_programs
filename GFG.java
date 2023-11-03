// Class 1
// Helper class
class OuterClass {z
    // Input string
    private static String msg = "GeeksForGeeks";

    // Static nested class
    public static class NestedStaticClass {
        // Only static members of Outer class
        // is directly accessible in nested static class
        public void printMessage() {
            // Try making 'message' a non-static
            // variable, there will be a compiler error
            System.out.println("Message from nested static class: " + msg);
        }
    }

    // Non-static nested class -
    // also called Inner class
    public class InnerClass {
        // Both static and non-static members
        // of Outer class are accessible in this Inner class
        public void display() {
            // Print statement whenever this method is called
            System.out.println("Message from non-static nested class: " + msg);
        }
    }
}

// Class 2
// Main class
class GFG {
    // Main driver method
    public static void main(String args[]) {
        // Creating instance of nested Static class inside main() method
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        
        // Calling non-static method of nested static class
        printer.printMessage();

        // Creating Outer class instance for creating non-static nested class
        OuterClass outer = new OuterClass();
        
        // Creating an instance of the Inner class using the outer class instance
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Calling non-static method of Inner class
        inner.display();
    }
}
