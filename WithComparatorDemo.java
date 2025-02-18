// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// public class WithComparatorDemo {
//     public static void main(String[] args) {
//         List<Integer> num = new ArrayList<>();
//         num.add(4);
//         num.add(3);
//         num.add(7);
//         num.add(9);
        
//         // Using a custom comparator for descending or ascending order
//         Collections.sort(num, new Comparator<Integer>() {
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                 return o1 - o2; // Compare 
//             }
//         });
        
//         // Printing the sorted list
//         System.out.println(num);
//     }
// }


import java.util.*;


class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class WithComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding students with their names and ages
        students.add(new Student("ankit", 4));
        students.add(new Student("abishek", 3));
        students.add(new Student("vishal", 7));
        students.add(new Student("banka", 9));

        // Sorting students by age (ascending order)
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age; // Compare by age
            }
        });

        // Printing the sorted list of students
        System.out.println("Sorted by age (ascending):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting students by age (descending order)
        Collections.sort(students, (s1, s2) -> s2.age - s1.age);

        // Printing the sorted list of students
        System.out.println("\nSorted by age (descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
