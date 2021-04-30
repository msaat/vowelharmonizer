public class fourVowel{

public static String changerFinder(String n){
  String changer = "";
  String backRounded = "ou";
  String backUnrounded = "aı";
  String frontRounded = "öü";
  if (backRounded.contains(n)){
    changer = "u";
  }
  else if (backUnrounded.contains(n)){
    changer = "ı";
  }
  else if (frontRounded.contains(n)){
    changer = "ü";
  }
  else{
    changer = "i";
  }
  return changer;
}

public static String without(String n){
  String changer = changerFinder(n);
  
  String ending = "s"+changer+"z";
  return ending;
}

public static String accusative(String n, String m){
  String changer = changerFinder(n);
  String ending = "";
  if (n.equals(m)){ 
  ending = "y"+changer;
  }
  else {
  ending = changer;
  }
  return ending;
}


}