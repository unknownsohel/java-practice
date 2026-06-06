
import bank.Student;

public class test {

    public static void main(String[] args) {
        Student b = new Student();
        b.name = "sohel";
        b.setAge(20);
        b.setrollNo(15);
        System.out.println(b.name);
        System.out.println(b.getAge());
        System.out.println(b.getrollNo());

    }

}