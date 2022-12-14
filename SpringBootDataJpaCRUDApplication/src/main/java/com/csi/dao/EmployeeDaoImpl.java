package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {
    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee saveData(Employee employee){
        return employeeRepositoryImpl.save(employee);
    }
    public List<Employee> getAllData(){
      return  employeeRepositoryImpl.findAll();
    }
    public Employee updateData(Employee employee){
        return employeeRepositoryImpl.save(employee);
    }
    public void deleteData(int empId){
        employeeRepositoryImpl.deleteById(empId);
    }
    public Employee getDataById(int empId){
       return employeeRepositoryImpl.findByEmpId(empId);

    }
    public List<Employee> getDataByName(String empName){
        return employeeRepositoryImpl.findByEmpName(empName);
    }
}
