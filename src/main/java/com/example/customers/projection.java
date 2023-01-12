package com.example.customers;

import com.example.customers.entity.Customer;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "fullCustomer", types = Customer.class)
public interface projection extends Projection {
    public Long getid() ;
    public String getname();
    public  String getmail();
}
