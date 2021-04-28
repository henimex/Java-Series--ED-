package StaticUsage;

public class ProductValidator {

    static {
        System.out.println("Static Constructor Initialize");
    }

    public ProductValidator(){
        System.out.println("Standard Constructor Initialize");
    }

    public static boolean Validate(Product product){
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void AnotherOperation(){

    }
}
