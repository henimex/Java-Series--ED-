package hendev.generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generic Repository DP");

        Customer customer = new Customer();
        customer.id = 1;
        customer.name = "Ferhat";

        CustomerDal customerDal = new CustomerDal();
        customerDal.Add(customer);

        Validator validator = new Validator();
        validator.Validate(customer);
    }
}
