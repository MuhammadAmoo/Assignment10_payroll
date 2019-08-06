package amoo.com.repository.demography;

import amoo.com.domain.demography.Gender;
import amoo.com.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderRepositoryTest {

    GenderRepository repository;
    Gender gender;

    @Before
    public void setUp() throws Exception
    {
        repository = GenderRepository.getRepository();
        gender = GenderFactory.buildGender("216022002"
                                             , "Male");
    }

    @Test
    public void getRepository()
    {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll()
    {
        repository.create(gender);
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

    @Test
    public void create()
    {
        repository.create(gender);
        assertNotNull(repository.read(gender.getEmpNumber()));
        System.out.println("Created\n" + repository.read("216022002"));
    }

    @Test
    public void read()
    {
        assertNotNull(repository.read(gender.getEmpNumber()));
        System.out.println("Read\n" + repository.read("216022002"));
    }

    @Test
    public void update()
    {
        Gender genderUpdate = GenderFactory.buildGender("216022002"
                                                          , "Updated");
        repository.update(genderUpdate);
        System.out.println(repository.read("216022002"));
    }

   @Test
    public void delete()
   {
       repository.delete(gender.getEmpNumber());
       assertNull(repository.read("216022002"));
       System.out.println("Deleted\n" + repository.read("216022002"));
    }
}