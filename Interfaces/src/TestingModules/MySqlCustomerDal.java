package TestingModules;

public class MySqlCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void Add() {
        System.out.println("MySql Added.");
    }

    @Override
    public void List() {

    }

    @Override
    public void CheckStatus() {
        System.out.println("MySql CheckStatus Code Requested.");
    }
}
