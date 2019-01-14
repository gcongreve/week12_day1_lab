import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sarah", "NI444A", 12345.00);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Sarah", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNINumber(){
        assertEquals("NI444A", databaseAdmin.getnINumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(12345.00, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void databaseAdminCanRaiseSalary(){
        databaseAdmin.raiseSalary(1.2);
        assertEquals(14814.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void databaseAdminCanGenerateBonus(){
        assertEquals(123.45, databaseAdmin.payBonus(), 0.01);
    }
}
