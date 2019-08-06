package amoo.com.repository.demography;

import amoo.com.domain.demography.Race;
import amoo.com.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceRepositoryTest {

    RaceRepository rep;
    Race race;

    @Before
    public void setUp() throws Exception
    {
        rep = RaceRepository.getRepository();
        race = RaceFactory.buildRace("216022002"
                , "Coloured");
    }

    @Test
    public void getRepository()
    {
        assertNotNull(rep);
        System.out.println(rep);
    }

    @Test
    public void getAll() {
        rep.create(race);
        assertNotNull(rep.getAll());
        System.out.println(rep.getAll());
    }

    @Test
    public void create() {
        rep.create(race);
        assertNotNull(rep.read(race.getEmpNumber()));
        System.out.println("Created\n" + rep.read("216022002"));
    }

    @Test
    public void read() {

        assertNotNull(rep.read(race.getEmpNumber()));
        System.out.println("Read\n" + rep.read("216022002"));
    }
    @Test
    public void update() {

        Race raceUpdate =RaceFactory.buildRace("216022002",
                                                     "Updated");
        rep.update(raceUpdate);
        System.out.println(rep.read("216022002"));
    }

    @Test
    public void delete()
    {
        rep.delete(race.getEmpNumber());
        assertNull(rep.read("216022002"));
        System.out.println("Deleted\n" + rep.read("216022002"));
    }
}