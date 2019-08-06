package amoo.com.factory.user;

import amoo.com.domain.user.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    Employee emp;
    @Before
    public void setUp() throws Exception {
        emp = EmployeeFactory.buildEmployee("216022002"
                                                 ,"Muhammad"
                                                 ,"Amoo"
                                                 , "Male"
                                                 ,"Coloured");
    }

    @Test
    public void buildEmployee() {
        assertNotNull(emp);
        System.out.println(emp);
    }
}