package homeWork;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        //substring() - вырезает указанный промежуток символов
        String string2 = string1.substring(0, 35);
        System.out.println(string2);
        System.out.println(string2.length());
        String string3 = string2.concat(" it is perfect");
        System.out.println(string3);
        System.out.println(string3.length());
        System.out.println("===============");

        String string = "Testing, is my favourite job";
//        String[] splitedWords = string.split("[\\s,]");
//        System.out.println(Arrays.toString(splitedWords));
//        int firstWordLength = splitedWords[0].length();
//        Boolean result = true;
//        for (int i = 0; i<splitedWords.length ; i++)
//        {
//            System.out.println("слово " + i+" = " + splitedWords[i] + ", Длинна этого слова = " + splitedWords[i].length());
//            if (result)
//                result = firstWordLength > splitedWords[i].length();
//        }
//
//
//        System.out.println(result);
        String word1 = string.split("\\s")[0];
        word1 = word1.replace(",","");
        String word2 = string.split("\\s")[1];
        String word3 = string.split("\\s")[2];
        String word4 = string.split("\\s")[3];
        String word5 = string.split("\\s")[4];
        System.out.println("слово1 " + word1 + ", Длинна этого слова =" + word1.length() + ".");
        System.out.println("слово2 " + word2 + ", Длинна этого слова =" + word2.length() + ".");
        System.out.println("слово3 " + word3 + ", Длинна этого слова =" + word3.length() + ".");
        System.out.println("слово4 " + word4 + ", Длинна этого слова =" + word4.length() + ".");
        System.out.println("слово5 " + word5 + ", Длинна этого слова =" + word5.length() + ".");
        boolean result = word1.length()>word2.length() && word1.length()>word3.length() && word1.length()>word3.length() && word1.length()>word4.length() && word1.length()>word5.length();
        System.out.println(result);
        System.out.println("=============");

        String someText = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";

        int counta = someText.split("a").length;
        System.out.println("буква а встречается "+ (counta - 1) + " раз");
        int countA = someText.split("A").length;
        System.out.println("буква A встречается "+ (countA - 1) + " раз");
    }
}
