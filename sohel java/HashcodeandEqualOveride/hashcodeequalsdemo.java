package HashcodeandEqualOveride;

public class hashcodeequalsdemo {
    public static void main(String[] args) {
        person p1 = new person("sohel", 20, 'M', 209876);
        person p2 = new person("sohel", 20, 'M', 209876);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);

    }
}
