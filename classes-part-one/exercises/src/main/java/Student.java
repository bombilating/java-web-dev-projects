public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public void setName(String name) {
                this.name = name;
        }
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }
        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        public void setGpa(double gpa) {
                this.gpa = gpa;
        }
        public void getName() {
                return name;
        }
        public void getStudentId() {
                return studentId;
        }
        public void getNumberOfCredits() {
                return numberOfCredits;
        }
        public void getGpa() {
                return gpa;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
}

public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
}

public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public void setName(String name) {
                this.name = name;
        }
        public void setSubject(String subject) {
                this.subject = subject;
        }
        public void setYearsTeaching(int yearsTeaching) {
                this.yearsTeaching = yearsTeaching;
        }
        public void getFirstName() {
                return firstName;
        }
        public void getLastName() {
                return lastName;
        }
        public void getSubject() {
                return subject;
        }

        public void getYearsTeaching() {
                return yearsTeaching;
        }


}
