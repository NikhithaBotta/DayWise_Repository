package Util;

import java.util.Scanner;

public class ProductInv_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductOperations ops = new ProductOperations();

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    ops.addProduct(id, name, qty, price);
                    break;

                case 2:
                    ops.listProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int upId = sc.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();
                    ops.updateProductQuantity(upId, newQty);
                    break;

                case 4:
                    System.out.print("Enter Product ID to Delete: ");
                    int delId = sc.nextInt();
                    ops.deleteProduct(delId);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
