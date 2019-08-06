package amoo.com.factory.demography;

import amoo.com.domain.demography.Race;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    Race race;
    @Before
    public void setUp() throws Exception
    {
       race  = RaceFactory.buildRace("216022002", "Coloured");
    }

    @Test
    public void buildRace()
    {
        assertNotNull(race);
        System.out.println(race);
    }
}