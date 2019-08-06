package amoo.com.factory.user;

import amoo.com.factory.demography.GenderFactory;
import amoo.com.factory.demography.RaceFactory;
import amoo.com.domain.demography.Gender;
import amoo.com.domain.demography.Race;
import amoo.com.domain.user.Employee;

public class EmployeeFactory {

    public static Employee buildEmployee(String empNum, String firstName, String lastName, String gender, String race){

        Gender genderBuild = GenderFactory.buildGender(empNum, gender);
        Race raceBuild = RaceFactory.buildRace(empNum, race);
        return new Employee.Builder()
                .empNum(empNum)
                .firstName(firstName)
                .lastName(lastName)
                .gender(genderBuild)
                .race(raceBuild).Build();
    }
}
