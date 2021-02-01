/*
// Instructions
//
// Be sure Program Arguments is set to j
//
// Demonstration
// Start with non-compliant example first by swapping commenting of lines 11 & 12
// in FieldExample.java
//
// Then, swap comments and show compliant example
// Note that the compliant example shows a syntax error when zeroField is called
// directly.
*/

public class Main {
    public static void main(String[] args) {
        FieldExample fe = new FieldExample();
        System.out.println("Typical/compliant usage");
        System.out.println(fe.toString());

        // Starting the non-compliant code
        // This code sets the indicated field variable (either i or j) to o
        // The Field Variable set is passed as an argument (Run | Edit Configurations | Program Arguments)
        System.out.println("\nInsecure/non-compliant usage");
        for (String arg : args) {
            fe.zeroField(arg);
            System.out.println(fe.toString());
        }
    }
}
