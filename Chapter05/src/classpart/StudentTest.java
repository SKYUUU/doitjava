package classpart;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName = "이하치";
        studentLee.studentID = 100;
        studentLee.address = "서울시 마포구";

        Student studentKim = new Student();
        studentKim.studentName = "김하치";
        studentKim.studentID = 101;
        studentKim.address = "서울시 강동구";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
