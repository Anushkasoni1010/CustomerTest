package com.example.customer.CustomerService;

import com.example.customer.CustomerExceptions.ResourceNotFoundException;
import com.example.customer.Model.CustomersModel;
import com.example.customer.Repository.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

    @Autowired
    private CustomersRepo cmrepo;

    //To get All Customers
    public List<CustomersModel> getAllCustomers() {
        return cmrepo.findAll();
    }

    //To get customer data by id
    public ResponseEntity<CustomersModel> getAllCustomersById(Long userid) {
        CustomersModel dm = cmrepo.findById(userid).get();
        return ResponseEntity.ok().body(dm);
    }

    //Add customer data
    public CustomersModel postAllCustomers(CustomersModel customerdetail) {
        return cmrepo.save(customerdetail);
    }

    //Delete the customer
    public void deleteCustomer( Long id) {
        cmrepo.deleteById(id);
    }

    //Update the customer data
    public ResponseEntity<CustomersModel> updateCustomer(Long Id, CustomersModel customerDetails) throws ResourceNotFoundException {

        CustomersModel csm = cmrepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("User not found "));
        if (customerDetails.getEmail() != null) {

            csm.setEmail(customerDetails.getEmail());
        }
        if (customerDetails.getLast_name() != null ) {
            csm.setLast_name(customerDetails.getLast_name());
        }
        if (customerDetails.getFirst_name() != null) {
            csm.setFirst_name(customerDetails.getFirst_name());
        }
        if (customerDetails.getIp() != null) {
            csm.setIp(customerDetails.getIp());
        }
        if (customerDetails.getLongitude() != 0) {
            csm.setLongitude(customerDetails.getLongitude());
        }
        if (customerDetails.getLatitude() != 0) {
            csm.setLatitude(customerDetails.getLatitude());
        }
        if (customerDetails.getCreated_at() != null) {
            csm.setCreated_at(customerDetails.getCreated_at());
        }
        if (customerDetails.getUpdated_at() != null) {
            csm.setUpdated_at(customerDetails.getUpdated_at());
        }

        CustomersModel updatedCustomer = cmrepo.save(csm);

        return ResponseEntity.ok(updatedCustomer);


    }
}
