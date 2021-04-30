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

public static String from(String n){
  String changer = changerFinder(n);
  
  String ending = "d"+changer+"n";
  return ending;
}

public static String at(String n){
  String changer = changerFinder(n);
  
  String ending = "d"+changer;
  return ending;
}

public static String with(String n){
  String changer = changerFinder(n);
  
  String ending = "l"+changer;
  return ending;
}

public static String to(String n, String m){
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