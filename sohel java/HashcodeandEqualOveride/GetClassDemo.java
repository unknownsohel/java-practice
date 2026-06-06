package HashcodeandEqualOveride;

public class GetClassDemo {
    public static void main(String[] args) {
        person person = new person();
        Class<? extends person> prsnClass = person.getClass();
        System.out.println(prsnClass.getName());
        System.out.println(prsnClass.getSimpleName());
        System.out.println(prsnClass.getPackageName());

    }

}
