public class Student {
    private String name;
    private String studentCode;
    private String birthDay;
    private String className;

    public Student(String name, String studentCode, String birthDay, String className) {
        this.name = name;
        this.studentCode = studentCode;
        this.birthDay = birthDay;
        this.className = className;
    }

    public String getStudentCode() {
        return studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentCode='" + studentCode + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
