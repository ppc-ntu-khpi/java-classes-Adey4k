## Завдання на "три" - код класу Customer
``` java
package domain;
/**
 *
 * @author Ladik
 */
public class Customer {
    public int ID = 1;
    public boolean isNew = false;
    public double total = 1000.0;
    
    public void displayCustomerinfo() {
    System.out.println("Customer ID: " + ID);
    System.out.println("Is customer new: " + isNew);
    System.out.println("Total: " + total);
  } // кінець методу displayCustomerinfo
    
}

```
![](https://github.com/ppc-ntu-khpi/java-classes-Adey4k/blob/main/Solution/done.png "Скрішот результатів")


## Завдання на "п'ять" - з використанням getter and setter
>CustomerTest.java
``` java
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
```
![](https://github.com/ppc-ntu-khpi/java-classes-Adey4k/blob/main/Solution/advanced.png "Скрішот результатів")
