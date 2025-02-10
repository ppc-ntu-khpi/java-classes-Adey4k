package test;
import domain.Customer;
/**
 *
 * @author Ladik
 */
public class CustomerTest {
    public static void main(String args[]){
        Customer mycustomer = new Customer();
        mycustomer.displayCustomerinfo();
        
        System.out.println("\n advanced \n");
        mycustomer.setTotal(999.9);
        System.out.println("Brand-new total: " + mycustomer.getTotal());
    }
}
