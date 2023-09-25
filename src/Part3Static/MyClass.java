package Part3Static;
public class MyClass {
    public static int staticVar = 5;

    public static void staticMethod() {
        System.out.println("This is a static method.");
        // nonStaticMethod();
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
        staticMethod();
    }
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        MyClass.staticVar = 7;

        System.out.println("obj1.staticVar: " + obj1.staticVar);
        System.out.println("obj2.staticVar: " + obj2.staticVar);

        System.out.println("Are objects equal? " + (obj1.staticVar == obj2.staticVar));

        // Call the static method using the class name
        MyClass.staticMethod();

        // Access the static method inside the class
        staticMethod();

        // Access the non-static method using an object
        MyClass obj3 = new MyClass();
        obj3.nonStaticMethod();
        }
    }

