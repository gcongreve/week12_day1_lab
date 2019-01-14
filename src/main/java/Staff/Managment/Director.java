package Staff.Managment;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String nINumber, Double salary, String deptName, Double budget){
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }
}
