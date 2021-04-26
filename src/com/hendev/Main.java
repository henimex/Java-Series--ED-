package com.hendev;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();

        SimpleMath simpleMath = new SimpleMath();
        int result = simpleMath.Sum(15,36);
        int result2 = simpleMath.Divide(15,36);
        int result3 = simpleMath.Minus(15,36);
        int result4 = simpleMath.Multiple(15,36);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        Product product = new Product();
        product.id = 1;
        product.name = "ASUS Laptop";
        product.description = "Intel i5";
        product.price = 3450;
        product.stock = 6;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println("Test");
    }
}
