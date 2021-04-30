import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("input word:");
    String inputtedWord = myObj.nextLine();  
    //System.out.println(inputtedWord);
    Scanner myOtherObj = new Scanner(System.in);
    System.out.println("type name of function from the following list:\nplural, without, from, at, with, to");
   String choice = myOtherObj.nextLine();   
    String v = vowelSearch(inputtedWord);
    String lastLet = lastLetter(inputtedWord);
    if (choice.equals("plural")){
      String y = twoVowel.plural(v);
      String finalPlural = inputtedWord.concat(y);
      System.out.println(finalPlural);
    }
    if (choice.equals("without")){
      String y = fourVowel.without(v);
      String finalWithout = inputtedWord.concat(y);
      System.out.println(finalWithout);
    }
    if (choice.equals("from")){
      String y = twoVowel.from(v);
      String finalFrom = inputtedWord.concat(y);
      System.out.println(finalFrom);
    }
    if (choice.equals("at")){
      String y = twoVowel.at(v);
      String finalAt = inputtedWord.concat(y);
      System.out.println(finalAt);
    }
    if (choice.equals("with")){
      String y = twoVowel.with(v);
      String finalWith = inputtedWord.concat(y);
      System.out.println(finalWith);
    }
    if (choice.equals("to")){
      String y = twoVowel.to(v,lastLet);
      String finalTo = inputtedWord.concat(y);
      System.out.println(finalTo);
    }



  }

  public static String vowelSearch(String m){
    String[] vowelsone = {"a", "ı", "e", "i", "u", "o", "ü", "ö"};
     ArrayList<String> vowels = new ArrayList<String>(Arrays.asList(vowelsone));
     int i = m.length();
     String letter = m.substring(i-1,i);
     if (vowels.contains(letter)){
       return letter;
     }
     else{
       String lettertwo = m.substring(i-2,i-1);
       return lettertwo;
     }
       
  }

  public static String lastLetter(String m){
    String letter = m.substring(m.length()-1,m.length());
    return letter;
  }
       
  


}