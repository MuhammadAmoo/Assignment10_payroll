package amoo.com.service.demography;

import amoo.com.domain.demography.Gender;
import amoo.com.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderServiceTest {

    GenderService service;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        service = GenderService.getService();
        gender = GenderFactory.buildGender("216022002"
                , "Male");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(gender);
        assertNotNull(service.read("216022002"));
        System.out.println("Created\n" + service.read("216022002"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("216022002"));
        System.out.println("Read\n"+ service.read("216022002"));
    }

    @Test
    public void update() {
        service.create(gender);
        System.out.println(service.read("216022002"));

        Gender genderUpdated = GenderFactory.buildGender("216022002", "Updated");
        service.update(genderUpdated);
        Gender g = service.read("216022002");
        assertNotEquals(gender.getGender(), g.getGender());
        System.out.println("Updated\n"+service.read("216022002"));
    }

    @Test
    public void delete() {
        service.delete("216022002");
        assertNull(service.read(gender.getEmpNumber()));
        System.out.println("Delete\n"+service.read(gender.getEmpNumber()));
    }
}