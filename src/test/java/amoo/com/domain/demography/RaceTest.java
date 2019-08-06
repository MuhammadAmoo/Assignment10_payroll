package amoo.com.domain.demography;

import amoo.com.factory.demography.RaceFactory;
import amoo.com.repository.demography.RaceRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceTest {

    private RaceRepository RaceRep;
    private Race race;
    @Before
    public void setUp() throws Exception
    {
        RaceRep = RaceRepository.getRepository();
        race = RaceFactory.buildRace("216022002",
                                            "Coloured");
    }

    @Test
    public void getEmpNumber()
    {
        assertNotNull(race.getEmpNumber());
        System.out.println(race.getEmpNumber());
    }

    @Test
    public void getRace()
    {
        assertNotNull(race.getRace());
        System.out.println(race.getRace());
    }
}