package main;

import models.Book;
import models.Box;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String empty = "";
        // Test cases for Question 1.
        String s1 = "ABCBA";
        String s2 = "ABCD";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(empty));

        // Test cases for Question 2.
        String s3 = "abbbcda";
        String s4 = "12db93k";
        System.out.println(uniqueCharacters(s3));
        System.out.println(uniqueCharacters(s4));
        System.out.println(uniqueCharacters(empty));

        // Test cases for Question 3.
        String s5 = "123543443abdsa";
        String s6 = "ertikl304";
        System.out.println(containsDuplicates(s5));
        System.out.println(containsDuplicates(s6));
        System.out.println(containsDuplicates(empty));

        // Test cases for Question 4.
        String s7 = "132677aa";
        String s8 = "aa713267";
        String s9 = "39493fef";
        System.out.println(isAnagrams(s7, s8));
        System.out.println(isAnagrams(s8, s9));
        System.out.println(isAnagrams(s8, empty));

        // Test cases for Question 5.
        int year1 = 2000;
        int year2 = 1948;
        int year3 = 1700;
        System.out.println(isLeapYear(year1));
        System.out.println(isLeapYear(year2));
        System.out.println(isLeapYear(year3));

        // Test cases for Question 6.
        System.out.println(calcBills(89)); // 200
        System.out.println(calcBills(121)); // 212.6
        System.out.println(calcBills(178)); // 244.0
        System.out.println(calcBills(450)); // 355.0

        // Test cases for Question 7.
        String s10 = "abc";
        String s11 = "abcdfgsbca";
        String s12 = "djfkdkfjb";
        System.out.println(canConstruct(s10, s11));
        System.out.println(canConstruct(s10, s12));
        System.out.println(canConstruct(empty, s12));

        // Test for Question 8.
        System.out.println("***************************");
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the user's grade: ");
        String grade = reader.nextLine();
        String meaning = getGradeMeaning(grade);
        System.out.println("Here's the meaning for your grade " + grade + ": " + meaning);

        // Test for Question 9.
        Book priceAndPrejudice = new Book("Price and Prejudice", 1398293, "Novel", 25.00);
        priceAndPrejudice.printBookInfo();

        // Test for Question 10.
        Box milkbox = new Box(1, 1, 2);
        System.out.println(milkbox.calcBoxVolume());
        Box invalidBox = new Box(0, -1, 2);
        System.out.println(invalidBox.calcBoxVolume());
    }

    // Question 1: Write a program find if String is Palindrome?
    private static boolean isPalindrome(String s){
        for (int i = 0, j = s.length() - 1; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    // Question2: Write a program to check if a string has all unique characters.
    private static boolean uniqueCharacters(String s){
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++){
            if (count.get(s.charAt(i)) > 1) {
                return false;
            }
        }
        return true;
    }

    // Question 3. Write a program to check if string contains duplicates.
    private static boolean containsDuplicates(String s){
        HashSet<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (uniqueChars.contains(c)){
                return true;
            }
            uniqueChars.add(c);
        }
        return false;
    }

    // Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
    private static boolean isAnagrams(String s1, String s2){
        if (s1.length() == 0 || s2.length() == 0 || s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s1.length(); i++){
            count.put(s1.charAt(i), count.getOrDefault(s1.charAt(i), 0) + 1);
            count.put(s2.charAt(i), count.getOrDefault(s2.charAt(i), 0) - 1);
        }
        for (char c: count.keySet()){
            if (count.get(c) != 0){
                return false;
            }
        }
        return true;
    }

    // Question 5:  Write a program to determine whether the year is a leap year or not.
    // Leap Years are any year that can be evenly divided by 4.  A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
    private static boolean isLeapYear(int year){
        if (year % 4 != 0){
            return false;
        }
        if (year % 100 == 0){
            if (year % 400 != 0){
                return false;
            }
        }
        return true;
    }

    // Question 6: Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
    // Plus $ 0.60 per call for next 50 calls.
    // Plus $ 0.50 per call for next 50 calls.
    // Plus $ 0.40 per call for any call beyond 200 calls.
    // Use Switch Statement in the function.
    private static float calcBills(int calls){
        int base = calls / 100;
        float total = 0f;
        switch (base){
            case 0:
                total += 200;
                break;
            case 1:
                total += 200;
                int remain = calls - 100;
                int flag = remain / 50;
                switch (flag){
                    case 0:
                        total += remain % 50 * 0.6;
                        break;
                    case 1:
                        total += 0.6 * 50 + (remain % 50) * 0.5;
                        break;
                }
                break;
            default:
                total += 200;
                total += 0.6 * 50 + 0.5 * 50;
                total += (calls - 200) * 0.4;
                break;

        }
        return total;
    }

    // Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
    // Each letter in magazine can only be used once in ransomNote.
    private static boolean canConstruct(String ransomNote, String magazine){
        if (magazine.length() == 0 || magazine.length() < ransomNote.length()){
            return false;
        }
        HashMap<Character, Integer> countMagazine = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            countMagazine.put(c, countMagazine.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            countMagazine.put(c, countMagazine.getOrDefault(c, 0) - 1);
        }
        for (char c: countMagazine.keySet()) {
            if (countMagazine.get(c) < 0) {
                return false;
            }
        }
        return true;
    }


    // Question 8 : Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
    //A: Excellent
    //B: Good
    //C: Average
    //D: Deficient
    //F: Failing
    private static String getGradeMeaning(String grade){
        String meaning = "";
        switch (grade){
            case "A":
                meaning = "Excellent";
                break;
            case "B":
                meaning = "Good";
                break;
            case "C":
                meaning = "Average";
                break;
            case "D":
                meaning = "Deficient";
                break;
            case "F":
                meaning = "Failing";
                break;
            default:
                meaning = "Not valid input";
        }
        return meaning;
    }

    // Question 9 and Question 10 see the classes under "models" folder.

}
