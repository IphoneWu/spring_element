package demo10.Bo.Impl;

import demo10.Bo.CustomerBo;

/**
 * Created by win8 on 2017/3/5.
 */
public class CustomerImpl implements CustomerBo {
    public void addCustomer() {
        System.out.println("addCustomer () is running!");
    }

    public String addCustomerReturnValue() {
        System.out.println("addCustomerReturnValue() is running!");
        return "abc";
    }

    public void addCustomerThrowException() throws Exception {
        System.out.println("addCustomerThrowException() is running!");
        throw new Exception("Generic Error");
    }

    public void addCustomerAround(String name) {
        System.out.println("addCustomerAround() is running!"+name);
    }
}
