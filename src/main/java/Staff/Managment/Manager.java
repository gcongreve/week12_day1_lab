package Staff.Managment;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String nINumber, Double salary, String deptName){
        super(name, nINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
