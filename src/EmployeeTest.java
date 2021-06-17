import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Test Create Employee with set value in constructor should return 'Mark - Bk' ")
    public void testCreateEmployeeWithSetConstructor(){
        Employee emp = new Employee("Mark","Bk");
        assertEquals("Mark - Bk",emp.getFullName());
    }

    @Test
    @DisplayName("Test Create Employee with default constructor should return ' - ' ")
    public void testCreateEmployeeWithDefaultConstructor(){
        Employee emp = new Employee();
        assertEquals(" - ",emp.getFullName());
    }


}