package StaticUsage;

public class ProductManager {
    public void Add(Product product){


        //Before Static
        ProductValidator validator = new ProductValidator();
        if (validator.Validate(product)){
            System.out.println("Product Added");
        } else {
            System.out.println("Product Cannot be Added.");
        }

        validator.AnotherOperation();

        //After Static
        if (ProductValidator.Validate(product)){
            System.out.println("Product Added");
        } else {
            System.out.println("Product Cannot be Added.");
        }
        //ProductValidator.AnotherOperation();

        if (ProductValidator.Validate(product)){
            System.out.println("Product Added");
        } else {
            System.out.println("Product Cannot be Added.");
        }
    }
}
