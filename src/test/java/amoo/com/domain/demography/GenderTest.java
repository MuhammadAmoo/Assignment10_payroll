package amoo.com.domain.demography;

import amoo.com.factory.demography.GenderFactory;
import amoo.com.repository.demography.GenderRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {

    private GenderRepository genderRep;
    private Gender gender;
    @Before
    public void setUp() throws Exception

    {
    genderRep = GenderRepository.getRepository();
    gender = GenderFactory.buildGender
            ("216022002",
                    "Male"
            );
    }

    @Test
    public void getEmpNumber()
    {
        assertNotNull(gender.getEmpNumber());
        System.out.println(gender.getEmpNumber());
    }

    @Test
    public void getGender() {
        assertNotNull(gender.getGender());
        System.out.println(gender.getGender());
    }
}