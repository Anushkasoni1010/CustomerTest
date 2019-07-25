package com.example.customer.Controller;
import com.example.customer.CustomerService.CustomerService;
import com.example.customer.Model.CustomersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomersController {

    @Autowired
    private CustomerService service;

    @GetMapping("/customerRead")
    public ResponseEntity<List<CustomersModel>> findAllCustomers() {
        return ResponseEntity.ok(service.getAllCustomers());
    }

    @GetMapping("/customerSearch/{id}")
    public ResponseEntity<CustomersModel> findCustomerById(@PathVariable(value = "id") Long id) {
        return service.getAllCustomersById(id);
    }


    @PostMapping("/customerCreate")
    public CustomersModel addCustomers(@RequestBody CustomersModel customerdetail) {
        return service.postAllCustomers(customerdetail);
    }

    @DeleteMapping("/customerDelete/{id}")
    public void deleteCustomer(@PathVariable(value = "id") Long id) {
        service.deleteCustomer(id);
    }

    @PutMapping("/customerUpdate/{id}")
    public ResponseEntity<CustomersModel> updateCustomer(@PathVariable(value = "id") long id, @RequestBody CustomersModel customersModal){
        return service.updateCustomer(id,customersModal);
    }

}