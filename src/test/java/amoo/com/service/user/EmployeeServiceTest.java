package amoo.com.service.user;

import amoo.com.domain.user.Employee;
import amoo.com.factory.user.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    EmployeeService emp_service;
    Employee employee;

    @Before
    public void setUp() throws Exception {
          emp_service = EmployeeService.getService();
                 employee = EmployeeFactory.buildEmployee("216022002"
                                                        , "Muhammad"
                                                        , "Amoo"
                                                        , "Male"
                                                        ,"Coloured");
    }

    @Test
    public void getService() {
        assertNotNull(emp_service);
        System.out.println(emp_service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        emp_service.create(employee);
        assertNotNull(emp_service.read("216022002"));
        System.out.println("Created\n" + emp_service.read("216022002"));
    }

    @Test
    public void read() {
        assertNotNull(emp_service.read("216022002"));
        System.out.println("Read\n"+ emp_service.read("216022002"));
    }

    @Test
    public void update() {
        emp_service.create(employee);
        System.out.println(emp_service.read("216022002"));

        Employee employeeUpdated = EmployeeFactory.buildEmployee
                (
                "216022002",
                "Muhammad",
                "Jacobs",
                "Updated",
                "Coloured"
                );
        emp_service.update(employeeUpdated);
        Employee em = emp_service.read("216022002");
        assertNotEquals(employee.getSurname(), em.getSurname());
        System.out.println("Updated\n"+emp_service.read("216022002"));
    }

    @Test
    public void delete() {
        emp_service.delete("216022002");
        assertNull(emp_service.read(employee.getEmpNumber()));
        System.out.println("Delete\n"+emp_service.read(employee.getEmpNumber()));
    }
}