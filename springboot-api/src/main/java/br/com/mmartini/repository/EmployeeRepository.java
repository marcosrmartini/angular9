package br.com.mmartini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mmartini.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
