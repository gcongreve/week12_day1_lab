import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sarah", "NI444A", 12345.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Sarah", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals("NI444A", developer.getnINumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(12345.00, developer.getSalary(), 0.01);
    }


    @Test
    public void developerCanRaiseSalary(){
        developer.raiseSalary(1.2);
        assertEquals(14814.00, developer.getSalary(), 0.01);
    }

    @Test
    public void developerCanGenerateBonus(){
        assertEquals(123.45, developer.payBonus(), 0.01);
    }
}
