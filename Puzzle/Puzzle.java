import java.util.ArrayList;
import java.util.Random;
public class Puzzle{
  
  public ArrayList<Integer> getTenRolls(){
    Random random = new Random();
    ArrayList<Integer> tenRolls = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++){
      tenRolls.add(random.nextInt(10)+1);
    }
    System.out.println(tenRolls);
    return tenRolls;
  }

  public String getRandomLetter(){
    Random random = new Random();
    String alphabetLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String[] alphabet = new String[26];
    for(int i=0; i < 26; i++ ){
      alphabet[i] = String.valueOf(alphabetLetters.charAt(i));
    }

    int letterRandom = random.nextInt(26);
    return alphabet[letterRandom];

  }

  public String generatePassword(){
    Random random = new Random();
    String passGenerate = "abcdefghijklmnopqrstuvwxyz&*%$#@!_.?";
    String[] passArray = new String[36];
    //turns passGenerate into a fixed Array -> passArray
    for(int i=0; i < 36; i++ ){
      passArray[i] = String.valueOf(passGenerate.charAt(i));
    }

    ArrayList<String> passWordList = new ArrayList<String>();
    //takes passArray and creates an array of random characters
    for(int j=0; j < 8; j++){
      passWordList.add(passArray[random.nextInt(36)+1]);
    }
    String pass = "";
    for(String character: passWordList){
      pass+= character;
    }
    return pass;
  }

  public String generateNewPasswordSet(int passLength){
    Random random = new Random();
    String passGenerate = "abcdefghijklmnopqrstuvwxyz&*%$#@!_.?";
    String[] passArray = new String[36];
    //turns passGenerate into a fixed Array -> passArray
    for(int i=0; i < 36; i++ ){
      passArray[i] = String.valueOf(passGenerate.charAt(i));
    }

    ArrayList<String> passWordList = new ArrayList<String>();
    //takes passArray and creates an array of random characters
    for(int j=0; j < passLength; j++){
      passWordList.add(passArray[random.nextInt(36)+1]);
    }
    String pass = "";
    for(String character: passWordList){
      pass+= character;
    }
    return pass;
  }

}