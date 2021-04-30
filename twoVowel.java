public class twoVowel{


public static String changerFinder(String n){
  String changer = "";
  String backVowels = "aouı";
  if (backVowels.contains(n)){
    changer = "a";
  }
  else{
    changer = "e";
  }
  return changer;
}




public static String plural(String n){
  String changer = changerFinder(n);
  
  String ending = "l"+changer+"r";
  return ending;
}






}