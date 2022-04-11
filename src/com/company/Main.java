package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String str = "bbcDaeFGhijklmoNp1234567890 substring1 Abcasd dASASD substring2";
        String inputString = "kksJnaVYbuoeHlsds875468546 first Catdnfp kPPWJF second";
        String substring = "Cat";

        System.out.println(divideOddEven(str));
        System.out.println(numberOfDigits(str));
        System.out.println(createOnlyDigits(str));
        System.out.println(deleteDuplicateChars(str));
        System.out.println(countSpecialChar(str, '1'));
        System.out.println(reverseString(str));
        System.out.println(countSubstring(str,substring));
        System.out.println(reverseStringWords(str));
        System.out.println(sortStringArray(str));
        System.out.println(findLengthOfShortestWord(str));
        System.out.println(numberOfWordsInString(str));
        System.out.println(addSpaces(str));
        System.out.println(isPalindrome(str));
        System.out.println(replaceSubstring(str, substring));
        System.out.println(findDistanceBetweenSubstrings(str, "first", "second"));
    }


    //Четные и нечетные символы разделить по разным строкам
    public static String divideOddEven(String inputString){
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for(int i = 0; i < inputString.length(); i++){
            if(i % 2 == 0)
                odd.append(inputString.charAt(i));
            else
                even.append(inputString.charAt(i));
        }
        String evenString = even.toString();
        String oddString = odd.toString();
        return "Четные и нечетные символы разделить по разным строкам:\n"+
                "Odd: " + oddString +
                "\nEven: " + evenString;
    }

    //Количество цифр в строке
    public static String numberOfDigits(String string){
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                count++;
            }
        }
        return "Количество цифр в строке" + count;
    }

    //Вводится строка из букв и цифр, построить новую только из цифр
    public static String createOnlyDigits(String inputString){
        return "Вводится строка из букв и цифр, построить новую только из цифр: " + inputString.replaceAll("\\D", "");
    }

    //Удаление одинаковых символов
    public static String deleteDuplicateChars(String inputString){
        String result = new StringBuilder(inputString).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        return "Удаление одинаковых символов: " + result;
    }

    //Частота встречаемости символа в строке
    public static String countSpecialChar(String inputString, char character){
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character) {
                count++;
            }
        }
        return "Частота встречаемости символа в строке: " + count;
    }

    //Переворот строки
    public static String reverseString(String testString){
        StringBuilder revertString = new StringBuilder(testString);
        String reverse = revertString.reverse().toString();
        return "Переворот строки: " + reverse;
    }

    //Количество вхождений подстроки в строку
    public static String countSubstring(String testString, String substring){
        int index = 0;
        int count = 0;
        while ((index = testString.indexOf(substring, index)) != -1 ){
            count++;
            index++;
        }
        return "Количество вхождений подстроки в строку: " + count;
    }

    //Вывести слова строки в обратном порядке
    public static String reverseStringWords(String testString){
        String[] words = testString.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
        {
            res.append(words[i]).append(" ");
        }
        return "Вывести слова строки в обратном порядке: " + res.toString();
    }

    //Сортировка массива строк по алфавиту
    public static String sortStringArray(String inputString) {
        String[] wordsForSort = inputString.split(" ");
        Arrays.sort(wordsForSort, String.CASE_INSENSITIVE_ORDER);
        return "В алфавитном порядке: " + Arrays.toString(wordsForSort);
    }

    //Определить длину самого короткого слова в строке
    public static String findLengthOfShortestWord(String inputString){
        String[] words = inputString.split("\\s");
        int shortestLength = 10;
        for (String word: words) {
            if(word.length() < shortestLength){
                shortestLength = word.length();
            }
        }
        return "Длинна самой короткой строки: " + shortestLength;

    }

    //Подсчет количества слов в строк
    public static String numberOfWordsInString(String inputString){
        String[] words = inputString.split("\\s");
        return "Подсчет количества слов в строк: " + words.length;
    }

    //Добавление пробелов в строку
    public static String addSpaces(String inputString) {
        StringBuilder addSpaceBuilder = new StringBuilder();
        char[] inputArray = inputString.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            addSpaceBuilder.append(inputArray[i] + " ");
        }
        String withSpaces = addSpaceBuilder.toString();
        return "Добавление пробелов в строку: " + withSpaces;
    }

    //Замена подстроки в строке
    public static String isPalindrome(String inputString) {
        StringBuilder reverse = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse.append(inputString.charAt(i));
        }
        return "Замена подстроки в строке: " + inputString.equals(reverse.toString());
    }

    //Замена подстроки в строке
    public static String replaceSubstring(String inputString, String substring) {
        return "Замена подстроки в строке: " + inputString.replaceAll(substring, "DDD");
    }

    //Расстояние между подстроками
    public static String findDistanceBetweenSubstrings(String inputString, String substring1, String substring2) {
        int substrPosition1 = inputString.indexOf(substring1);
        int substrPosition2 = inputString.indexOf(substring2);

        int distance = Math.abs(substrPosition1 - substrPosition2);
        return "Расстояние между подстроками: " + distance;

    }


}