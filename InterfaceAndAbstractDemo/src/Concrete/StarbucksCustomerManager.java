package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerService {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if(customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }else{
            throw new Exception("Not a valid person");
        }

    }


}
