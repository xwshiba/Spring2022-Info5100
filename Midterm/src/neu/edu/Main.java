package neu.edu;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    // Question 1 Test cases
        Student stu1 = new Student("Mary", 1, 4);
        // Shallow Copy
        Student stu2 = stu1;
        stu2.setName("John");
        System.out.println(stu1.getName()); // John
        System.out.println(stu2.getName()); // John

        // Deep Copy
        Student stu3 = new Student(stu1);
        stu3.setName("Louis");
        System.out.println(stu1.getName()); // John
        System.out.println(stu3.getName()); // Louis

        // Question 2 - Write difference between abstract class and interface.
        // abstract class can contain abstract attributes and abstract methods that can be overridden. abstract class cannot be initiated, it can only be 'extended'.
        // interface can only contain abstract methods that can be overridden. interface can only be 'implemented' by other classes.
        // A class (not abstract class) can extend an abstract class and implement an interface at the same time, or only extends an abstract class, or implements multiple interfaces.
        // For example, abstract class can be electronic devices, and Phone class can extend electronic devices. Interface can be iSMS or iCall, and Phone can implement iSMS and iCall.

        // Question 3 Test Cases
        Psychiatrist psy = new Psychiatrist();
        Happy happy = new Happy("Tom");
        Sad sad = new Sad("Cruz");
        psy.examine(happy);
        psy.observe(happy);
        psy.examine(sad);
        psy.observe(sad);

        // Question 4
        // Please switch to the 'Client' configuration to check the correct output.


        // Question 5:  Singleton: Create a singleton class for Camera  there  would  be  just  one  instance  of  Camera
        // Please see the 'Camera' Singleton Class.


        // Question 6: String question Test cases
        System.out.println(findLongestSubstring("abcabcbb")); // 3
        System.out.println(findLongestSubstring("bbbbb")); // 1
        System.out.println(findLongestSubstring("pwwkew")); // 3
        System.out.println(findLongestSubstring("")); // 0
        System.out.println(findLongestSubstring("abcdefgggggggg")); // 7
    }

    public static int findLongestSubstring(String s){
        if (s == null || s.length() == 0){
            return 0;
        }
        int res = 1;
        int curr = 0;

        HashSet<Character> curSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            Character curChar = s.charAt(i);
            if (!curSet.contains(curChar)){
                curSet.add(curChar);
                curr += 1;
            } else {
                curr = 1;
                curSet = new HashSet<>();
                curSet.add(curChar);
            }
            if (curr > res){
                res = curr;
            }
        }
        return res;
    }
}
