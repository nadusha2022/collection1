package pro.sky.skyprocollection1.Services;

import org.springframework.stereotype.Service;
import pro.sky.skyprocollection1.Employee.Employee;
import pro.sky.skyprocollection1.exception.EmployeeAlreadyAddedException;
import pro.sky.skyprocollection1.exception.EmployeeNotFoundException;

import java.util.Objects;

    @Service
    public class ArrayEmployeeService implements EmployeeService {
        private static final int capacity = 10;
        private Employee[] stuff = new Employee[capacity];
        private int currentSize = 0;

        @Override
        public Employee addEmployee(String firstName, String lastName) {
            if (currentSize >= capacity) {
                throw new EmployeeAlreadyAddedException();
            }
            Employee temp = new Employee(firstName, lastName);
            for (Employee emp : stuff) {
                if (Objects.equals(emp, temp)) {
                    throw new EmployeeAlreadyAddedException();
                }
            }
            stuff[currentSize++] = temp;
            currentSize++;
            return temp;
        }

        @Override
        public Employee removeEmployee(String firstName, String lastName) {
            Employee temp = new Employee(firstName, lastName);
            int i;
            for (i = 0; i < currentSize; ++i) {
                if (stuff[i].equals(temp)) break;
            }
            if (i == currentSize) {
                throw new EmployeeNotFoundException();
            }
            for (int a = i; a < currentSize - 1; a++)
                stuff[a] = stuff[a + 1];
            currentSize--;
            return temp;
        }

        @Override
        public Employee findEmployee(String firstName, String lastName) {
            Employee temp = new Employee(firstName, lastName);
            for (var emp : stuff) {
                if (Objects.equals(emp, temp)) return emp;
            }
            throw new EmployeeNotFoundException();
        }
    }


