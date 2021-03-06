package amoo.com.domain.user;

import amoo.com.factory.user.EmployeeFactory;
import amoo.com.repository.user.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    private EmployeeRepository employeeRep;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employeeRep = EmployeeRepository.getRepository();
        employee = EmployeeFactory.buildEmployee
                (
                "216022002",
                "Muhammad",
                "Amoo",
                "Male",
                "Coloured"
                );
    }

    @Test
    public void getEmpNumber()
    {
        assertNotNull(employee.getEmpNumber());
        System.out.println(employee.getEmpNumber());
    }

    @Test
    public void getFirstName()
    {
        assertNotNull(employee.getFirstName());
        System.out.println(employee.getFirstName());
    }

    @Test
    public void getSurname()
    {
        assertNotNull(employee.getSurname());
        System.out.println(employee.getSurname());
    }

    @Test
    public void getGender()
    {
        assertNotNull(employee.getGender().getEmpNumber());
        System.out.println(employee.getGender().getGender());
    }

    @Test
    public void getRace()
    {
        assertNotNull(employee.getRace().getEmpNumber());
        System.out.println(employee.getRace().getRace());
    }
}