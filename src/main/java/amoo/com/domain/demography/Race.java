package amoo.com.domain.demography;

public class Race {

    private String empNum;
    private String race;

    public Race(Builder Build)
    {
        this.empNum = Build.empNum;
        this.race = Build.race;
    }

    public String getEmpNumber()
    {
        return empNum;
    }

    public String getRace()
    {
        return race;
    }

    @Override
    public String toString()
    {
        return
       "Employee Number:" + empNum  + "\n Race :" + race ;
    }

    public static class Builder
    {

        private String empNum;
        private String race;

        public Builder empNum(String empNum){
            this.empNum = empNum;
            return this;
        }
        public Builder race(String race){
            this.race = race;
            return this;
        }

        public Race Build(){
            return new Race(this);
        }
    }
}
