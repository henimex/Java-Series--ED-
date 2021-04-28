package TestingModules;

public class Main {
    public static void main(String[] args){
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.Add();

        IRepository repo = new MySqlCustomerDal();
        repo.CheckStatus();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());

        customerManager.Add();
        customerManager.List();
        //customerManager.CheckStatus();
    }
}
