package week6;

import java.util.ArrayList;
import java.util.List;

// Interface Segregation Principle (ISP)
interface StudentDetails {
    String getName();
    String getId();
    void enrollCourse(Course course);
}

interface CourseDetails {
    String getCourseName();
    String getCourseId();
    void addStudent(Student student);
}

// Single Responsibility Principle (SRP)
// Class for managing Student details
class Student implements StudentDetails {
    private String name;
    private String id;
    private List<Course> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Class for managing Course details
class Course implements CourseDetails {
    private String courseId;
    private String courseName;
    private List<Student> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

// Dependency Inversion Principle (DIP)
// High-level module depends on abstraction
class EnrollmentManager {
    public void enroll(StudentDetails student, CourseDetails course) {
        student.enrollCourse((Course) course);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Creating courses
        Course course1 = new Course("C001", "Math");
        Course course2 = new Course("C002", "Science");

        // Enrollment
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course2);

        // Output
        System.out.println(student1.getName() + " is enrolled in: " + student1.getCourses().get(0).getCourseName());
        System.out.println(student2.getName() + " is enrolled in: " + student2.getCourses().get(0).getCourseName());
    }
}
