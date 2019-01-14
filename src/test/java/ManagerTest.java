import Staff.Managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Graeme", "NI72359237523A", 103000.00, "Finance");
    }

    @Test
    public void managerHasName(){
        assertEquals("Graeme", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals("NI72359237523A", manager.getnINumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(103000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDepartment(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void managerCanRaiseSalary(){
        manager.raiseSalary(1.2);
        assertEquals(123600.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerCanGenerateBonus(){
        assertEquals(1030.00, manager.payBonus(), 0.01);
    }

    @Test
    public void managerCannotMakeSalaryNegative(){
        manager.raiseSalary(-1.2);
        assertEquals(123600.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerCanChangeName(){
        manager.setName("Alex");
        assertEquals("Alex", manager.getName());
    }

    @Test
    public void managerCannotSetNameToNull(){
        manager.setName(null);
        assertEquals("Graeme", manager.getName());
    }
}
