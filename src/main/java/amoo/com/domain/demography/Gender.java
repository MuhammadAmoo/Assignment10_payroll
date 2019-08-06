package amoo.com.domain.demography;

public class Gender {

    private String empNum;
    private String gender;

    public Gender(Gender.Builder Build)
    {
        this.empNum = Build.empNum;
        this.gender = Build.gender;
    }

    public String getEmpNumber() {
        return empNum;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString()
    {
        return  "Employee Number   :" + empNum + "\n Gender   :" + gender ;
    }

    public static class Builder
    {
        private String empNum;
        private String gender;

        public Builder empNum(String empNum)
        {
            this.empNum = empNum;
            return this;
        }


        public Builder gender(String gender)
        {
            this.gender = gender;
            return this;
        }

        public Gender Build(){
            return new Gender(this);
        }
    }

}
