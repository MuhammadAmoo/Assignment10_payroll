package amoo.com.factory.demography;

import amoo.com.domain.demography.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    Gender gender;
    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.buildGender
                (
                "216022002",
                "Male");
                 }

    @Test
    public void buildGender()
    {
        assertNotNull(gender);
        System.out.println(gender);
    }
}