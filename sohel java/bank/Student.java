
package bank;

public class Student {
    public String name;

    private int age;

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;

    }

    public int getAge() {
        return this.age;
    }

    private int rollNo;

    public void setrollNo(int rollNo) {
        if (rollNo < 0) {
            rollNo = 0;
        }
        this.rollNo = rollNo;

    }

    public int getrollNo() {
        return rollNo;
    }

}
