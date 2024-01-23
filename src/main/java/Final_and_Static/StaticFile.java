package Final_and_Static;

public class StaticFile {
    private static int staticVariable = 0;
    public static int getStaticVariable() {
        return staticVariable;
    }
    public static void incrementStaticVariable() {
        staticVariable++;
    }
    public static void main(String[] args) {
        System.out.println(StaticFile.getStaticVariable());
        StaticFile.incrementStaticVariable();
        System.out.println(StaticFile.getStaticVariable());
    }
}
