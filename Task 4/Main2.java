public class Main2 {
    public static void main (String[] args) {
        Employee employee = new Employee("Halima");
        Contractor contractor = new Contractor("Alex");
        employee.calculateBonus();
        contractor.work();
    }
}

class TeamMember {
    protected String name;

    TeamMember(String name){
        this.name = name;
    }
}

interface BonusEligible{
    void calculateBonus ();
} 

class Employee extends TeamMember implements BonusEligible{
    Employee(String name) {
        super(name);
    }
    @Override
    public void calculateBonus(){
        System.out.println("Calculating employee bonus...");
    }
}

class Contractor extends TeamMember {
    Contractor(String name){
        super(name);
    }
    public void work(){
        System.out.println("Contractor working..");
    }
}
