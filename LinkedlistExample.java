import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<String> studentNames = new LinkedList<>();

        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("Diana");
        studentNames.add("Ethan");

        System.out.println("Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        studentNames.add(2, "Frank");
        System.out.println("\nAfter adding 'Frank' at index 2:");
        System.out.println(studentNames);

        studentNames.remove("Charlie");
        System.out.println("\nAfter removing 'Charlie':");
        System.out.println(studentNames);

        System.out.println("\nStudent at index 3: " + studentNames.get(3));
    }
}

