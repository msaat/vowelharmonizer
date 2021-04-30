public class twoVowel{







public static String plural(String n){
  String changer = "";
  if (n.equals("a") || n.equals("o") || n.equals("u") || n.equals("ı") ){
    changer = "a";
  }
  else{
    changer = "e";
  }
  String ending = "l"+changer+"r";
  return ending;
}






}