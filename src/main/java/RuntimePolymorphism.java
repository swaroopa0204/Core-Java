// Parent class
class Shape {
    // Overridden method
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class inheriting from Shape
class Circle extends Shape {
    // Overriding the draw method in the child class
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    // Overriding the draw method in the child class
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Creating an object of the parent class
        Shape shape = new Shape();

        // Calling the draw method of the parent class
        shape.draw(); // Output: Drawing a shape

        // Creating an object of the child class
        Shape circle = new Circle();

        // Calling the draw method of the child class
        circle.draw(); // Output: Drawing a circle

        // Creating an object of the child class
        Shape rectangle = new Rectangle();

        // Calling the draw method of the child class
        rectangle.draw(); // Output: Drawing a circle
    }
}
