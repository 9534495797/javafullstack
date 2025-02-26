import java.util.*;
public class StringPractice {
    public static void main(String[] args) {
        // String s1="Hello World";
        // System.out.println(s1);
        Scanner sc=new Scanner(System.in);
//         System.out.println("enter the input");
// String s1=sc.nextLine();

// System.out.println(s1);


//length of string
// System.out.println("length of string "+s1.length());

//concat
// String s2="Hello guys";
// System.out.println("concated string: "+s2.concat(s1));

//comparison of two strings

// String s1="hello";
// String s2="HeLLo";
// System.out.println(s1.equalsIgnoreCase(s2));
// System.out.println(s1.equals(s2));


//updated any string

// System.out.println(s1.charAt(0));
// char[] updatedarray= s1.toCharArray();
// updatedarray[0]='k';
// s1=new String(updatedarray);
// System.out.println(s1);

//to lowercase and uppercase
// System.out.println(s1.toUpperCase());
// System.out.println(s2.toLowerCase());

//freq of char in a string;
// System.out.println("enter the char to find freq :");
// char ch=sc.nextLine().charAt(0);
// int count=0;
// for(char c:s1.toCharArray()){
//     if(c==ch)
//         count++;
    
// }
//     System.out.println(count);



//palindrome string
// String s3="amman";
// int left=0;
// int rigtht=s3.length()-1;
// while(left<rigtht){
//     if(s3.charAt(left)!=s3.charAt(rigtht)){
// System.out.println("false");
// return;

//     }
//     left++;
//     rigtht--;
// }
// System.out.println("true");


//reverse a string
// String s4="hello";
// String revrersed="";
// for(int i=s4.length()-1; i>=0;i--){
// revrersed+=s4.charAt(i);


// }
// System.out.println(revrersed);

//count vowels and consonant
// String s4="helloHK";
// String s5=s4.toLowerCase();
// int vowels=0, consonant=0;
// for(int i=0;i<s5.length();i++){
//     char ch=s5.charAt(i);

//     if(ch=='a' || ch=='e'|| ch=='i' ||ch=='o'||ch=='u'){
//         vowels++;
//     }else{

    
//     consonant++;}


// }
// System.out.println(vowels);
// System.out.println(consonant);    


//substrings
// String s1="Hello Ankit kaise ho";
// for(int i=0;i<s1.length();i++){
//     System.out.println(s1.charAt(i));
// }

//substr method

// System.out.println(s1.substring(1,3));

//sorting of string using Arrays.sort()
// String s="bcaden";
// char[] charArray=s.toCharArray();
// Arrays.sort(charArray);


// System.out.println(charArray);

//searching in a string
// String s="hello world";
// if(s.contains("hello")){
//     System.out.println("yes");
// }else{
//     System.out.println("no");
// }

//string tokenization
// String s="Apple,Banana,Cat";
// for(int i=0;i<s.length();i++){
//     System.out.println(s.charAt(i));
// }

//tokenization
// String [] token=s.split(",");
// for(String i : token){
//     System.out.println(i);
// }


//string anagram >> two string contains same char order does not matter
// String s1="hello";
// String s2="lloeh";

// char[] arr1=s1.toCharArray();
// char [] arr2=s2.toCharArray();

// Arrays.sort(arr1);
// Arrays.sort(arr2);
// if(Arrays.equals(arr2,arr1)){
//     System.out.println("true");
// }else{
//     System.out.println("false");
// }





    }

}
