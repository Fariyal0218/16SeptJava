package com.example.SeptJavaSpring.jpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee em){
        employeeRepository.save(em);
        return "Employee saved...";
    }

    @GetMapping("get employee")
    public List<Employee> getEmployee(){

        return employeeRepository.findAll();
    }

    @PutMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){

        Employee obj = employeeRepository.getById(employee.getId());
        obj.setAddress(employee.getAddress());
        obj.setName(employee.getName());
        employeeRepository.save(obj);
        return "updated...";
    }
//    @DeleteMapping("deleteEmployee/{id}")
//    public String deleteEmployee(@PathVariable(value="id") Integer id){
//
//        Employee obj = employeeRepository.getById(id);
//        employeeRepository.delete(obj);
//        return "deleted employee "+obj.getId();
//    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value="id") Integer id){
        employeeRepository.deleteById(id);
        return "deleted employee ";
    }
}
