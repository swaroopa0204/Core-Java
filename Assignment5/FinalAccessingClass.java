package Assignment5;

public class FinalAccessingClass {
    public static void main(String[] args) {
        FinalClass myInstance = new FinalClass();
        int result = myInstance.getFinalVariable();
        System.out.println("Value of final variable: " + result);
    }
}
