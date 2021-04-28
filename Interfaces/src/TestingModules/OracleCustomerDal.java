package TestingModules;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("Oracle Added.");
    }

    @Override
    public void List() {

    }
}
