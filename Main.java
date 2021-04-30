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
    System.out.println("pick function: 'plural'");
   String choice = myOtherObj.nextLine();   
    String v = vowelSearch(inputtedWord);
    if (choice.equals("plural")){
      String y = twoVowel.plural(v);
      String finalPlural = inputtedWord.concat(y);
      System.out.println(finalPlural);
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


}