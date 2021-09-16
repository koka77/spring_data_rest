package org.udemyspringcource.somov.spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.udemyspringcource.somov.spring_data_rest.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
