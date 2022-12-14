package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;


    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveData(employee));
    }




    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
       return ResponseEntity.ok(employeeService.getAllData());
    }
    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable int empId, @RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.updateData(employee));
    }
    @DeleteMapping("/deletedata/{empId}")
    public ResponseEntity<String> deleteData(@PathVariable int empId){
        employeeService.deleteData(empId);
        return ResponseEntity.ok("Delete Data Successfully");
    }
    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Employee> getDataById(@PathVariable int empId){
        return ResponseEntity.ok(employeeService.getDataById(empId));
    }
    @GetMapping("/getdatabyname/{empName}")
    public ResponseEntity<List<Employee>>getDataByName(@PathVariable String empName ){
        return  ResponseEntity.ok(employeeService.getDataByName(empName));
    }
    @GetMapping("/services")
public String sayHeelo(){
        return "Pune|Mumbai";
    }
}
