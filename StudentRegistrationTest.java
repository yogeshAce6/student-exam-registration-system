import org.junit.Test;
import static org.junit.Assert.*;

public class StudentRegistrationTest {

    @Test
    public void testValidRegistration() {
        StudentRegistration system = new StudentRegistration();
        String result = system.registerForExam("John Doe", "3118231040", "Software Engineering");
        assertEquals("Registration Successful for Software Engineering", result);
    }

    @Test
    public void testInvalidRollNumber() {
        StudentRegistration system = new StudentRegistration();
        String result = system.registerForExam("John Doe", "123", "Software Engineering");
        assertEquals("Registration Failed: Invalid Details", result);
    }
}