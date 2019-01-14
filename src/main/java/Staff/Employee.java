package Staff;

public abstract class Employee {
    private String name;
    private String nINumber;
    private Double salary;

    public Employee(String name, String nINumber, Double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increment){
        salary *= increment;
    }

    public Double payBonus(){
        return salary * 0.01;
    }
}
