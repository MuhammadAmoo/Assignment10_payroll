package amoo.com.factory.demography;

import amoo.com.domain.demography.Race;

public class RaceFactory {

    public static Race buildRace(String empNum, String race)
    {
        return new Race.Builder()
                .empNum(empNum)
                .race(race)
                .Build();

    }
}
