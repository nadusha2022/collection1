package pro.sky.skyprocollection1.Employee;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    @Override
        public boolean equals (Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName,employee.lastName);
    }
    @Override
    public int hashCode(){
        return Objects.hash (firstName,lastName);
    }

    @Override
    public String toString() {
        return String.format("ФИ: %s, %s", firstName, lastName);
    }
}




