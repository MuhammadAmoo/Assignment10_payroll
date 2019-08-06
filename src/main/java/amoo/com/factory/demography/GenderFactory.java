package amoo.com.factory.demography;

import amoo.com.domain.demography.Gender;

public class GenderFactory {

    public static Gender buildGender(String empNum, String gender)
    {
           return new Gender.Builder()
                   .empNum(empNum)
                   .gender(gender)
                   .Build();
    }
}
