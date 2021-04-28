package TestingModules;

public class CustomerManager {

    private final ICustomerDal _customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this._customerDal = customerDal;
    }

    public void Add(){
        _customerDal.Add();
    }

    public void List(){
        _customerDal.List();
    }
}
