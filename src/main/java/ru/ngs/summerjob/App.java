package ru.ngs.summerjob;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ngs.summerjob.configuration.MyConfig;
import ru.ngs.summerjob.entity.Employee;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
            // get all
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

            //get by id
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

            //update & add
//        Employee employee = new Employee("Sveta", "Sokolove", "IT", 1200);
//        employee.setId(8);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(8);
    }
}
