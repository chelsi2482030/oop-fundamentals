public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private String lecturer;

    private static int totalCourses = 0;

    public Course(String courseCode, String courseName, int credits, String lecturer) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setCredits(credits);
        setLecturer(lecturer);
        totalCourses++;
    }

    public void displayCourseInfo() {
        System.out.println("---- COURSE INFO ----");
        System.out.println("Code: " + courseCode);
        System.out.println("Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Lecturer: " + lecturer);
    }

    public boolean isHeavyCourse() {
        return credits >= 3;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    // Getters & Setters with validation
    public String getCourseCode() { return courseCode; }

    public void setCourseCode(String courseCode) {
        if (courseCode == null || courseCode.isEmpty()) {
            System.out.println("Error: Course code tidak boleh kosong");
        } else {
            this.courseCode = courseCode.toUpperCase();
        }
    }

    public String getCourseName() { return courseName; }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            System.out.println("Error: Course name tidak boleh kosong");
        } else {
            this.courseName = courseName;
        }
    }

    public int getCredits() { return credits; }

    public void setCredits(int credits) {
        if (credits < 1 || credits > 4) {
            System.out.println("Error: Credits harus antara 1-4");
        } else {
            this.credits = credits;
        }
    }

    public String getLecturer() { return lecturer; }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}
