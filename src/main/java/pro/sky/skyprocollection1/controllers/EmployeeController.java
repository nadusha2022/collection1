package pro.sky.skyprocollection1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocollection1.Employee.Employee;
import pro.sky.skyprocollection1.Services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController (EmployeeService service) {
        this.service = service;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("fistName") String firstName,
                                @RequestParam("lastName") String lastName) {
        return service.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("fistName") String firstName,
                                   @RequestParam("lastName") String lastName) {
        return service.removeEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("fistName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        return service.findEmployee(firstName, lastName);
    }
}


