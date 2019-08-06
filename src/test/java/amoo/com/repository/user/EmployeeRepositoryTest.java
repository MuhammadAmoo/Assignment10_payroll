package amoo.com.repository.user;

import amoo.com.domain.user.Employee;
import amoo.com.factory.user.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRepositoryTest {

    EmployeeRepository emp_repository;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        emp_repository = EmployeeRepository.getRepository();
        employee = EmployeeFactory.buildEmployee("216022002"
                                                ,"Muhammad"
                                                ,"Amoo"
                                                ,"Male"
                                                ,"Coloured");
    }

    @Test
    public void getRepository() {
        assertNotNull(emp_repository);
        System.out.println(emp_repository);
    }

    @Test
    public void getAll() {
        emp_repository.create(employee);
        assertNotNull(emp_repository.getAll());
        System.out.println("Get All\n" + emp_repository.getAll());
    }

    @Test
    public void create() {
        emp_repository.create(employee);
        assertNotNull(emp_repository.read(employee.getEmpNumber()));
        System.out.println("Created\n" + emp_repository.read(employee.getEmpNumber()));
    }

    @Test
    public void read() {
        assertNotNull(emp_repository.read(employee.getEmpNumber()));
        System.out.println("Read\n" + emp_repository.read(employee.getEmpNumber()));
    }

    @Test
    public void update() {
        Employee employeeUpdated = EmployeeFactory.buildEmployee("216022002"
                ,"Muhammad"
                ,"Abu"
                ,"Male"
                ,"Coloured");
        emp_repository.update(employeeUpdated);

        Employee em = emp_repository.read("216022002");
        assertNotEquals(employee.getSurname(), em.getSurname());
        System.out.println("Updated\n" + emp_repository.read("216022002"));
    }

    @Test
    public void delete()
    {
        emp_repository.delete("216022002");
        assertNull(emp_repository.read("216022002"));
        System.out.println("Deleted\n" + emp_repository.read("216022002"));

    }
}