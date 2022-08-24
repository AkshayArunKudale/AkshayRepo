package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl {
@Autowired
    EmployeeDaoImpl employeeDao;


    public Employee saveData(Employee employee){
         return employeeDao.saveData(employee);
    }
    public List<Employee> getAllData(){
        return  employeeDao.getAllData();
    }
    public Employee updateData(Employee employee){
        return employeeDao.updateData(employee);
    }
    public void deleteData(int empId){
        employeeDao.deleteData(empId);
    }
    public Employee getDataById(int empId){
        return employeeDao.getDataById(empId);
    }
    public List<Employee> getDataByName(String empName){
        return employeeDao.getDataByName(empName);
    }

}
