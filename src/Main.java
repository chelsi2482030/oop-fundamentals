import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("============================================\n");

        System.out.println("=== REGISTRASI MAHASISWA ===");

        Student s1 = new Student("Adila", "Teknik Informatika", 2021);
        Student s2 = new Student("Chelsi", "Sistem Informasi", 2022);
        Student s3 = new Student("Engela", "Teknik Informatika", 2020);

        System.out.println("Mahasiswa berhasil ditambahkan: " + s1.getStudentId() + " - " + s1.getName());
        System.out.println("Mahasiswa berhasil ditambahkan: " + s2.getStudentId() + " - " + s2.getName());
        System.out.println("Mahasiswa berhasil ditambahkan: " + s3.getStudentId() + " - " + s3.getName());

        s1.updateGPA(3.65);
        s2.updateGPA(3.85);
        s3.updateGPA(2.85);

        System.out.println("\n=== REGISTRASI MATA KULIAH ===");

        Course c1 = new Course("CS101", "Pemrograman Dasar", 3, "Sir Jay");
        Course c2 = new Course("CS102", "Struktur Data", 4, "Sir Pandia");
        Course c3 = new Course("MTK201", "Kalkulus II", 3, "Sir Limbong");
        Course c4 = new Course("ENG101", "English for IT", 2, "Sir Andrew");

        System.out.println("Mata kuliah berhasil ditambahkan: CS101 - Pemrograman Dasar");
        System.out.println("Mata kuliah berhasil ditambahkan: CS102 - Struktur Data");
        System.out.println("Mata kuliah berhasil ditambahkan: MTK201 - Kalkulus II");
        System.out.println("Mata kuliah berhasil ditambahkan: ENG101 - English for IT");

        System.out.println("\n=== INPUT NILAI ===");

        Grade g1 = new Grade(s1, c1, 85);
        Grade g2 = new Grade(s1, c2, 78);
        Grade g3 = new Grade(s2, c1, 92);
        Grade g4 = new Grade(s2, c4, 88);
        Grade g5 = new Grade(s3, c3, 65);
        Grade g6 = new Grade(s3, c1, 70);

        System.out.println("Nilai berhasil diinput: Adila - Pemrograman Dasar: 85 (A)");
        System.out.println("Nilai berhasil diinput: Adila - Struktur Data: 78 (B+)");
        System.out.println("Nilai berhasil diinput: Chelsi - Pemrograman Dasar: 92 (A)");
        System.out.println("Nilai berhasil diinput: Chelsi - English for IT: 88 (A)");
        System.out.println("Nilai berhasil diinput: Engela - Kalkulus II: 65 (B-)");
        System.out.println("Nilai berhasil diinput: Engela - Pemrograman Dasar: 70 (B)");

        System.out.println("\n============================================");
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("============================================");

        Student[] students = {s1, s2, s3};

        for (Student s : students) {
            System.out.println("[" + s.getStudentId() + "] " + s.getName());
            System.out.println("Jurusan       : " + s.getMajor());
            System.out.println("Tahun Masuk   : " + s.getEnrollmentYear());
            System.out.println("GPA           : " + s.getGpa());
            System.out.println("Status        : " + s.getStudentStatus());
            System.out.println("Lama Kuliah   : " + s.getStudyDuration() + " tahun");
            System.out.println("--------------------------------------------");
        }

        System.out.println("============================================");
        System.out.println("Total Mahasiswa: " + Student.getTotalStudents());

        System.out.println("\n============================================");
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("============================================");

        Course[] courses = {c1, c2, c3, c4};

        for (Course c : courses) {
            System.out.print("[" + c.getCourseCode() + "] " + c.getCourseName() + " (" + c.getCredits() + " SKS) - " + c.getLecturer());
            if (c.isHeavyCourse()) System.out.print(" **HEAVY COURSE**");
            System.out.println();
        }

        System.out.println("============================================");
        System.out.println("Total Mata Kuliah: " + Course.getTotalCourses());


        // ========================
        // 6. DAFTAR NILAI
        // ========================
        System.out.println("\n============================================");
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("============================================");

        Grade[] grades = {g1, g2, g3, g4, g5, g6};

        for (Grade g : grades) {
            System.out.println("Mahasiswa : " + g.getStudent().getName() + " (" + g.getStudent().getStudentId() + ")");
            System.out.println("Mata Kuliah : " + g.getCourse().getCourseName() + " (" + g.getCourse().getCourseCode() + ")");
            System.out.println("Nilai : " + g.getScore() + " | Grade: " + g.getLetterGrade() +
                    " | Point: " + g.getGradePoint() +
                    " | Status: " + (g.isPassing() ? "LULUS" : "TIDAK LULUS"));
            System.out.println("--------------------------------------------");
        }
        System.out.println("============================================");


        // ========================
        // 7. STATISTIK SISTEM
        // ========================
        System.out.println("\n============================================");
        System.out.println("STATISTIK SISTEM");
        System.out.println("============================================");

        Student best = s1;
        for (Student s : students) {
            if (s.getGpa() > best.getGpa()) best = s;
        }

        System.out.println("Mahasiswa dengan GPA Tertinggi: " + best.getName() + " (" + best.getGpa() + ")");
        System.out.println("Total Mahasiswa Terdaftar: " + Student.getTotalStudents());
        System.out.println("Total Mata Kuliah Tersedia: " + Course.getTotalCourses());

        System.out.println("============================================");
    }
}
