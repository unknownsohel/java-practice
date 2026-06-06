package ARRAY;

public class arrayExample {
    public static void main(String[] args) {
        String[] names = { "Saziya", "Sahil", "Simran", "Sohel" };
        System.out.println(names[2]);

        for (String nam : names) {
            System.out.println(nam);
        }

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
            System.out.println(names[i]);

        }

    }
}
