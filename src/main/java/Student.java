public class Student {
    private String name = "Swaroopa";

    public String getName() {
        return name;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("Name of a Student "+s1.getName());
    }
}
