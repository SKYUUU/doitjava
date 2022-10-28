package staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 studentHa = new Student2();
        studentHa.setStudentName("하치");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentHa.studentName + " 학번 : " + studentHa.studentID);

        Student2 studentMang = new Student2();
        studentMang.setStudentName("망고");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentMang.studentName + " 학번 : " + studentMang.studentID);
    }
}
