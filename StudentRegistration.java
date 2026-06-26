public class StudentRegistration {
    
    public boolean validateRollNo(String rollNo) {
        // Validates if roll number is exactly 10 characters
        return rollNo != null && rollNo.length() == 10;
    }

    public String registerForExam(String name, String rollNo, String subject) {
        if (validateRollNo(rollNo) && subject != null && !subject.isEmpty()) {
            return "Registration Successful for " + subject;
        } else {
            return "Registration Failed: Invalid Details";
        }
    }
}