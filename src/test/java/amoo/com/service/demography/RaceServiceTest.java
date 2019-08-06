package amoo.com.service.demography;

import amoo.com.domain.demography.Race;
import amoo.com.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceServiceTest {

    RaceService service;
    Race race;

    @Before
    public void setUp() throws Exception {
        service = RaceService.getService();
        race = RaceFactory.buildRace("216022002"
                , "Coloured");
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
        service.create(race);
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
        service.create(race);
        System.out.println(service.read("216022002"));

        Race genderUpdated = RaceFactory.buildRace("216022002", "Updated");
        service.update(genderUpdated);
        Race g = service.read("216022002");
        assertNotEquals(race.getRace(), g.getRace());
        System.out.println("Updated\n"+service.read("216022002"));
    }

    @Test
    public void delete() {
        service.delete("216022002");
        assertNull(service.read(race.getEmpNumber()));
        System.out.println("Delete\n"+service.read(race.getEmpNumber()));
    }
}