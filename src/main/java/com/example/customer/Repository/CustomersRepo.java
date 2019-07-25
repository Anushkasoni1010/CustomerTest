package com.example.customer.Repository;

import com.example.customer.Model.CustomersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepo extends JpaRepository<CustomersModel,Long>
{

}
