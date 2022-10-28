package staticex;

public class StudentTest2 {
    public static void main(String[] args) {
        Student1 studentHa = new Student1();
        studentHa.setStudentName("하치");
        System.out.println(Student1.serialNum);
        System.out.println(studentHa.studentName + " 학번 : " + studentHa.studentID);

        Student1 studentMang = new Student1();
        studentMang.setStudentName("망고");
        System.out.println(Student1.serialNum);
        System.out.println(studentMang.studentName + " 학번 : " + studentMang.studentID);
    }
}
