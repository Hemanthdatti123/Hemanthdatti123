package com.employee.EMPDETAILSAPI.repository;

/**
 * @author Hemanth Datti
 *
 */

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EMPDETAILSAPI.model.EmployeeDetModel;

public interface EmployeeDetRepository extends JpaRepository<EmployeeDetModel, Long> {

	List<EmployeeDetModel> findAllByFinancialYear(String financialYear);

}