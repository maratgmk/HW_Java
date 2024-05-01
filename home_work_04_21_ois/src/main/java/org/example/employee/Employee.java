package org.example.employee;

import java.io.Serializable;
import java.time.LocalDate;

/*
3 Создайте класс Сотрудник с полями имя, фамилия, дата рождения, должность,
заработная плата. Сериализуйте объект и сохраните в файл. Поле заработной платы
сериализовать не нужно, т.к. это коммерческая тайна организации.
 */
public class Employee implements Serializable {
    private String name;
    private String lastname;
    private LocalDate dateOfBirth;
    private transient int salary;
    private static final long serialVersionUID = 7252438392L;

    public Employee(String name, String lastname, LocalDate dateOfBirth, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                '}';
    }
}
