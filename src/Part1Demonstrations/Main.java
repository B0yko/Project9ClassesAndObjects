package Part1Demonstrations;

// 1.1. Class declaration
class MyClass {
}
// 1.2 Public method
class MyClassWithMethod {
    public void print(String s) {
        System.out.println(s);
    }
}
// 1.3 Private method
class MyClassWithPrivateMethod {
    private void print(String s) {
        System.out.println(s);
    }
}
// 1.4 Constructor
class Constructor {
    String text;
    public String printText() {
        return text;
    }
    public Constructor(String text) {
        this.text = text;
    }
}
// 1.5 Demonstration of public properties of a various data types
class PropertyDemo {
    // Public properties of various data types
    public int intValue;
    public double doubleValue;
    public String stringValue;
    public boolean booleanValue;

    // Constructor to initialize the properties
    public PropertyDemo(int intValue, double doubleValue, String stringValue, boolean booleanValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
        this.booleanValue = booleanValue;
    }
    // Method to demonstrate property access within the class
    public void demonstrateAccessInClass() {
        System.out.println("Accessing properties within the class:");
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("stringValue: " + stringValue);
        System.out.println("booleanValue: " + booleanValue);
    }
}
// 1.7 Getters and setter demonstrations
class PrivateProperties {
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    private String text;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    public double getSnumber() {
        return snumber;
    }

    public void setSnumber(double snumber) {
        this.snumber = snumber;
    }

    private double snumber;

    public boolean isChoise() {
        return choise;
    }

    public void setChoise(boolean choise) {
        this.choise = choise;
    }

    private boolean choise;

    public PrivateProperties(String text, int number, double snumber, boolean choise) {
        this.text = text;
        this.number = number;
        this.snumber = snumber;
        this.choise = choise;
    }
    public void printPrivateProperty() {
            System.out.println("Private properties using: ");
            System.out.println("intValue: " + number);
            System.out.println("doubleValue: " + snumber);
            System.out.println("stringValue: " + text);
            System.out.println("booleanValue: " + choise);
    }
}
// 1.6 Demonstration of private properties
class PrivatePropertyDemo {
    // Private properties of various data types
    private int intValue;
    private double doubleValue;
    private String stringValue;
    private boolean booleanValue;

    // Constructor to initialize the private properties
    private PrivatePropertyDemo(int intValue, double doubleValue, String stringValue, boolean booleanValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
        this.booleanValue = booleanValue;
    }
    // Method to demonstrate private property access within the class
    public void demonstratePrivateAccessInClass() {
        System.out.println("Accessing properties within the class:");
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("stringValue: " + stringValue);
        System.out.println("booleanValue: " + booleanValue);
    }
}
public class Main {
    public static void main(String[] args) {
        // 1.1 Object creation
        MyClass obj = new MyClass();

        // 1.2 Public method call
        MyClassWithMethod obj2 = new MyClassWithMethod();
        obj2.print("Hello");

        //1.3 Private method call
        MyClassWithPrivateMethod obj3 = new MyClassWithPrivateMethod();
        // obj3.print("Hello");

        // 1.4 Constructor call
        Constructor obj4 = new Constructor("Hello, World!");
        System.out.println(obj4.printText());

        // 1.5 Create an object of the class
        PropertyDemo obj5 = new PropertyDemo(42, 3.14, "Hello, World!", true);

        // 1.5 Access properties through the object
        System.out.println("Accessing properties through the object:");
        System.out.println("intValue: " + obj5.intValue);
        System.out.println("doubleValue: " + obj5.doubleValue);
        System.out.println("stringValue: " + obj5.stringValue);
        System.out.println("booleanValue: " + obj5.booleanValue);

        // 1.5 Call a method to demonstrate property access in the class
        obj5.demonstrateAccessInClass();

        // 1.6 Create an object of the class
        /* PrivatePropertyDemo obj6 = new PrivatePropertyDemo(35, 19.45, "Hello, World!", false);
        // 1.6 Access private properties through the object
        System.out.println("Accessing private properties through the object:");
        System.out.println("intValue: " + obj6.intValue);
        System.out.println("doubleValue: " + obj6.doubleValue);
        System.out.println("stringValue: " + obj6.stringValue);
        System.out.println("booleanValue: " + obj6.booleanValue);*/

        // 1.6 Call a method to demonstrate private property access in the class
        //obj6.demonstratePrivateAccessInClass();

        // 1.7 Getters and setters using
        // 1.8 Demonstration of using of constructors with arguments
        PrivateProperties obj7 = new PrivateProperties("Hello", 15, 4.96, true);

        System.out.println("Accessing private properties through the object:");
        System.out.println("intValue: " + obj7.getNumber());
        System.out.println("doubleValue: " + obj7.getSnumber());
        System.out.println("stringValue: " + obj7.getText());
        System.out.println("booleanValue: " + obj7.isChoise());

        obj7.printPrivateProperty();
    }
}