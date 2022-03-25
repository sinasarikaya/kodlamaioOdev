package Adepter;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.OLWKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdepter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        OLWKPSPublicSoap client=new OLWKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(Locale.ROOT), customer.getLastName().toUpperCase(Locale.ROOT), customer.getDateOfBirth().getYear());
    }
}
