package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentHa = new Student();
        studentHa.setStudentName("하치");
        System.out.println(studentHa.serialNum);
        studentHa.serialNum++;

        Student studentMang = new Student();
        studentMang.setStudentName("망고");
        System.out.println(studentMang.serialNum);
        System.out.println(studentHa.serialNum);
    }
}
