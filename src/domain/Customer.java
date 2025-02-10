package domain;
/**
 *
 * @author Ladik
 */
public class Customer {
    public int ID = 1;
    public boolean isNew = false;
    public double total = 1000.0;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void displayCustomerinfo() {
    System.out.println("Customer ID: " + ID);
    System.out.println("Is customer new: " + isNew);
    System.out.println("Total: " + total);
  } // кінець методу displayCustomerinfo
    
}
