package Part4Pizza;

import java.util.Arrays;
import java.util.Scanner;
public class PizzaArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is an example how you should to input values:");

        Pizza p1 = new Pizza("Margarita", 45);
        System.out.println(p1);

        Pizza[] pizzas = new Pizza[5];

        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("Enter the name for pizza #" + (i + 1) + ": ");
            String name = in.next();
            System.out.println("Enter the price for pizza #" + (i + 1) + ": ");
            double price = in.nextDouble();
            in.nextLine();
            pizzas[i] = new Pizza(name, price);
        }

        System.out.println(Arrays.toString(pizzas));

        int n = pizzas.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (pizzas[i].getPrice() > pizzas[i + 1].getPrice()) {
                    Pizza temp = pizzas[i];
                    pizzas[i] = pizzas[i + 1];
                    pizzas[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("Sorted list: ");

        System.out.println(Arrays.toString(pizzas));
    }
}

