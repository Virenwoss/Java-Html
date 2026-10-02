class Car {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Fortuner", 4000000);
        Car c2 = new Car("Honda", "City", 1500000);
        Car c3 = new Car("Tata", "Nexon", 1200000);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}

class Student {
    private String name;
    private int age;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Viren");
        s.setAge(18);
        s.setMarks(85.5);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Marks: " + s.getMarks());
    }
}