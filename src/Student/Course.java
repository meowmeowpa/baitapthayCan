package Student;

public class Course {
    private String courseName;
    private int courseCode;
    private student[] students;


    public Course() {
        students = new student[0];
    }

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new student[0];
    }

    public student[] addStudentInCourse(student student) {
        student[] newList = new student[students.length + 1];
        newList[0] = student;
        for (int i = 0; i < students.length; i++) {
            newList[i + 1] = students[i];
        }
        students = newList;
        return students;
    }

    public void show() {
        if (students.length == 0) {
            System.out.println("Không có sinh viên nào trong khóa học.");
        } else {
            System.out.println("Danh sách sinh viên trong khóa học:");
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].getStudentID() + " " + students[i].getName() + " " + students[i].getAge());
            }
        }
    }

//heloo
//pank
//hiu

