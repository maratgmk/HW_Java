package org.example.employee;

import java.io.*;

/*
3 Создайте класс Сотрудник с полями имя, фамилия, дата рождения, должность,
заработная плата. Сериализуйте объект и сохраните в файл. Поле заработной платы
сериализовать не нужно, т.к. это коммерческая тайна организации.
 */
public class Main {
    public static void main(String[] args) {
//        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee"))){
//            Employee employee = new Employee("Bob","Black", LocalDate.of(1789,7,14), 56000);
//            oos.writeObject(employee);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee"))){
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
