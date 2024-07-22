package Student;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        student student1 = new student("pank", 19, 23);
        student student2 = new student("meowmeweow", 23, 25);
        System.out.println("tất cả thông tin của student1 là:" + student1.toString());
        System.out.println("tât cả thông tin của student2 là:" + student2.toString());
        course.addStudentInCourse(student1);
        course.addStudentInCourse(student2);
        course.show();
        System.out.println("hehe");

    }
}
