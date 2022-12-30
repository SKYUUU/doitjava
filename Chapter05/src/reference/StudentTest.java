package reference;

public class StudentTest {

    public static void main(String[] args) {

        Student studentHachi = new Student(100, "Hachi");
        studentHachi.setKorean(100);
        studentHachi.setMath(100);

        Student studentMango = new Student(101, "Mango");
        studentMango.setKorean(90);
        studentMango.setMath(90);

        studentHachi.showStudentInfo();
        studentMango.showStudentInfo();
    }
}
