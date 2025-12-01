public class Student {
    private String studentId;
    private String name;
    private String major;
    private int enrollmentYear;
    private double gpa;

    private static int totalStudents = 0;

    public Student() {
        totalStudents++;
        this.studentId = String.format("STD%03d", totalStudents);
    }

    public Student(String name, String major, int enrollmentYear) {
        this();

        setName(name);
        setMajor(major);
        setEnrollmentYear(enrollmentYear);
        this.gpa = 0.0; // default
    }

    public void displayInfo() {
        System.out.println("---- STUDENT INFO ----");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Enrollment Year: " + enrollmentYear);
        System.out.println("GPA: " + gpa);
        System.out.println("Status: " + getStudentStatus());
    }

    public void updateGPA(double newGPA) {
        if (newGPA < 0.0 || newGPA > 4.0) {
            System.out.println("Error: GPA harus 0.0 - 4.0");
        } else {
            this.gpa = newGPA;
        }
    }

    public String getStudentStatus() {
        if (gpa >= 3.5) return "Cumlaude";
        else if (gpa >= 3.0) return "Sangat Memuaskan";
        else if (gpa >= 2.5) return "Memuaskan";
        else return "Perlu Peningkatan";
    }

    public int getStudyDuration() {
        return 2025 - enrollmentYear;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public String getStudentId() { return studentId; }

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong");
        } else {
            this.name = name;
        }
    }

    public String getMajor() { return major; }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getEnrollmentYear() { return enrollmentYear; }

    public void setEnrollmentYear(int enrollmentYear) {
        if (enrollmentYear < 2015 || enrollmentYear > 2025) {
            System.out.println("Error: Tahun masuk harus 2015 - 2025");
        } else {
            this.enrollmentYear = enrollmentYear;
        }
    }

    public double getGpa() { return gpa; }
}
