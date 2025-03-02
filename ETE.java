// import java.util.Scanner;
// import java.time.DateTimeException;

//palindrome number

//  class PalindromeCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
//         sc.close();

//         String rev="";
//         for(int i=str.length()-1;i>=0;i--){
//            rev+=str.charAt(i);
//         }
//         if(str.equalsIgnoreCase(rev)){
//             System.out.println("yes it is ");
//         }else{
//             System.out.println("no");
//         }
//     }
// }




//count vowels and consonants

// import java.util.Scanner;

// public class VowelConsonantCount {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine().toLowerCase();
//         sc.close();

//         int vowels = 0, consonants = 0;
//         String vow="";
//         String cons="";
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch == 'a'|| ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
//                 vowels++;
//                 vow+=ch;
//             }else{
//                 consonants++;
//                 cons+=ch;
//             }
           
//         }
//         System.out.println("Vowels: " + vowels);
//         System.out.println(vow);
//         System.out.println("Consonants: " + consonants);
//         System.out.println(cons);
//     }
// }



//reverse a string

// import java.util.Scanner;

// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
//         sc.close();

//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }

//         System.out.println("Reversed string: " + rev);
//     }
// }




//second largest array

// import java.util.Scanner;
// import java.util.Arrays;

// public class SecondLargest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter elements of array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         Arrays.sort(arr);
//         System.out.println("Second Largest Element: " + arr[n - 2]);
//     }
// }



//array equality


// import java.util.Scanner;
// import java.util.Arrays;

// public class ArrayEquality {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter size of arrays: ");
//         int n = sc.nextInt();

//         int arr1[] = new int[n];
//         int arr2[] = new int[n];

//         System.out.println("Enter elements of first array: ");
//         for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

//         System.out.println("Enter elements of second array: ");
//         for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

//         sc.close();

//         if (Arrays.equals(arr1, arr2)) {
//             System.out.println("Arrays are equal.");
//         } else {
//             System.out.println("Arrays are not equal.");
//         }
//     }
// }



//reverse an array

// import java.util.*;
// class ArrayReverse{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("size of array");
//         int n=sc.nextInt();
//         int[]arr=new int[n];
//         int[]rev=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
     
//         for(int i=n-1;i>=0;i--){
//             rev[i]=arr[n-i-1];
//         }

//         System.out.println("reversed array : ");
//         for(int i=0;i<n;i++){
//             System.out.println(rev[i]);
//         }
//     }
// }

//second way
// import java.util.Scanner;

// public class ReverseArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         for (int i = 0, j = n - 1; i < j; i++, j--) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }

//         System.out.println("Reversed Array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


//ArrayList
// import java.util.ArrayList;
// import java.util.Scanner;

//  class ArrayListExample {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<String> names = new ArrayList<>();

//         System.out.print("Enter number of names: ");
//         int n = sc.nextInt();
//         sc.nextLine(); // consume newline

//         System.out.println("Enter names:");
//         for (int i = 0; i < n; i++) {
//             names.add(sc.nextLine());
//         }

//         System.out.println("Names in the list: " + names);

//         System.out.print("Enter a name to remove: ");
//         String removeName = sc.nextLine();
//         names.remove(removeName);

//         System.out.println("Updated list: " + names);
//         sc.close();
//     }
// }


//linkedlist

// import java.util.LinkedList;
// import java.util.Scanner;

// class LinkedListExample {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> numbers = new LinkedList<>();

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             numbers.add(sc.nextInt());
//         }

//         System.out.println("Linked List: " + numbers);
//         System.out.println("First element: " + numbers.getFirst());
//         System.out.println("Last element: " + numbers.getLast());

//         sc.close();
//     }
// }




//HashMap

// import java.util.HashMap;
// import java.util.Scanner;

//  class HashMapExample {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         HashMap<String, Integer> studentMarks = new HashMap<>();

//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();
//         sc.nextLine();

//         System.out.println("Enter student names and marks:");
//         for (int i = 0; i < n; i++) {
//             System.out.print("Name: ");
//             String name = sc.nextLine();
//             System.out.print("Marks: ");
//             int marks = sc.nextInt();
//             sc.nextLine();
//             studentMarks.put(name, marks);
//         }

//         System.out.print("Enter a student's name to check marks: ");
//         String checkName = sc.nextLine();

//         if (studentMarks.containsKey(checkName)) {
//             System.out.println(checkName + "'s Marks: " + studentMarks.get(checkName));
//         } else {
//             System.out.println(checkName + " not found.");
//         }

//         sc.close();
//     }
// }



//calendar , date and time

// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// class DateTime{
//     public static void main(String[] args) {
//         // LocalDate date=LocalDate.now();
//         // LocalTime time=LocalTime.now();
//          LocalDateTime datetime=LocalDateTime.now();
//         // System.out.println(date);
//         // System.out.println(time);
//         // System.out.println(datetime);

//         //using datetimeformatter
// DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyyy ss:mm:HH");
// String updated=datetime.format(formatter);
// System.out.println(updated);
//     }
// }




//age cal
// import java.time.LocalDate;
// import java.util.Scanner;

//  class AgeCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your birth year: ");
//         int birthYear = sc.nextInt();

//         int currentYear = LocalDate.now().getYear();
//         int age = currentYear - birthYear;

//         System.out.println("You are " + age + " years old.");
//         sc.close();
//     }
// }




//day after n days

// import java.util.*;
// import java.time.LocalDate;
//  class AgeCalculator {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int day=sc.nextInt();
//     LocalDate date=LocalDate.now().plusDays(day);
//     System.out.println(date);
// }
    
// }


