package Student;

public class student {
    private String name;
    private int age;
    private int StudentID;

    public student(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        StudentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getStudentID() {
        return StudentID;

    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", StudentID=" + StudentID +
                '}';
    }


}
