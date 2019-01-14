import Staff.Managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Graeme", "NI72359237523A", 103000.00, "Finance", 1000000.00);
    }

    @Test
    public void directorHasName(){
        assertEquals("Graeme", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals("NI72359237523A", director.getnINumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(103000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasDepartment(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void directorCanRaiseSalary(){
        director.raiseSalary(1.2);
        assertEquals(123600.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorCanGenerateBonus(){
        assertEquals(1030.00, director.payBonus(), 0.01);
    }

    @Test
    public void directorCanGetBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }
}
