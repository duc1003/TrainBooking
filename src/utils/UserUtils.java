package utils;

import model.Customer;

public class UserUtils {
    private static Customer currentCustomer = null;

    public static Customer getCurrentCustomer() {
        return currentCustomer;
    }
    public static void setCurrentCustomer(Customer currentCustomer){
        UserUtils.currentCustomer = currentCustomer;
    }
}
