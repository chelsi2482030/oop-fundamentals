public class Grade {
    private Student student;
    private Course course;
    private double score;
    private String letterGrade;

    public Grade(Student student, Course course, double score) {
        this.student = student;
        this.course = course;
        setScore(score);
        calculateLetterGrade();
    }

    public void calculateLetterGrade() {
        if (score >= 85) letterGrade = "A";
        else if (score >= 80) letterGrade = "A-";
        else if (score >= 75) letterGrade = "B+";
        else if (score >= 70) letterGrade = "B";
        else if (score >= 65) letterGrade = "B-";
        else if (score >= 60) letterGrade = "C+";
        else if (score >= 55) letterGrade = "C";
        else if (score >= 50) letterGrade = "D";
        else letterGrade = "E";
    }

    public double getGradePoint() {
        switch (letterGrade) {
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public boolean isPassing() {
        return score >= 55;
    }

    public void displayGrade() {
        System.out.println("---- GRADE INFO ----");
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Score: " + score);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("Passing: " + (isPassing() ? "YES" : "NO"));
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public double getScore() { return score; }

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("Error: Score harus 0-100");
        } else {
            this.score = score;
        }
    }

    public String getLetterGrade() { return letterGrade; }
}
