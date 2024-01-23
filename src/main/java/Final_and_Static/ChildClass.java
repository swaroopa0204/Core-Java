package Final_and_Static;

public class ChildClass extends ParentClass{
    private int childVariable;
    public ChildClass(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public ChildClass(int childVariable) {
        super(0);
        this.childVariable = childVariable;
    }
    public static void main(String[] args) {

        ParentClass parentInstance = new ParentClass(10);


        System.out.println("Parent Variable: " + parentInstance.parentVariable);

        ChildClass childInstance1 = new ChildClass(20, 30);

        System.out.println("Parent Variable in ChildClass: " + childInstance1.parentVariable);
        System.out.println("Child Variable in ChildClass: " + childInstance1.childVariable);

        ChildClass childInstance2 = new ChildClass(40);

        System.out.println("Parent Variable in ChildClass: " + childInstance2.parentVariable);
        System.out.println("Child Variable in ChildClass: " + childInstance2.childVariable);
    }
}
