package com.hendev;

import com.hendev.PolyMorphismDemo.EmailLogger;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
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
        product.setId(1);
        product.setName("ASUS Laptop");
        product.setDescription("Intel i5");
        product.setPrice(1212);
        product.setStock(5);
        product.setColor("Black");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());

        System.out.println("Inheritance ---------------");

        Customer customer = new Customer();
        customer.firstName = "Ferhat";

        customerManager.Add();

        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.Calculate();
        var creditResult = teacherCreditManager.CalculateNew(1000);
        System.out.println("Credit Result : " + creditResult);

        CreditUI creditUI = new CreditUI();
        creditUI.BaseCalculate(new TeacherCreditManager());
        creditUI.BaseCalculate(new FarmerCreditManger());
        creditUI.BaseCalculate(new SoldierCreditManager());

        System.out.println("Git Test");

        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new TeacherCreditManager(), new FarmerCreditManger(), new StudentCreditManager()};

        for (BaseCreditManager creditManager: creditManagers) {
            var multiCalc = creditManager.CalculateNew(1000);
            System.out.println(multiCalc);
        }

        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.CalcNew();
        gameCalculator.GameOver();

        SectionManager sectionManager = new SectionManager();
        sectionManager._baseDbManager = new MySqlDBManager();
        sectionManager.getSections();
    }
}
