import java.util.HashMap;
import java.util.Set;
public class HashMapIt{
  public static void main(String[] args){
    HashMap<String, String> trackList  = new HashMap<String, String>();
    
    trackList.put("Spice Girl", "I need a Spice Girl __ Zig-a-zig-ah, fuck up my whole world __ Posh when she talk, nothin like old girl...");
    trackList.put("HoneyPie", "Ooh, girl, don't you stop __ Dont you stop til you get enough honey __ Oh, honey, honeypie");
    trackList.put("Buff Baby", "Im a buff baby, but I dance like a man __ She a nice lady and she shakin the yams __ Spent the whole summer trappin out the sedan __ Marching wit the bands cause I think that I can");
    trackList.put("How you feel", "I aint afraid to make a scene if you aint seein me __ I dont give a fuck we in a Carls Jr, Ill start screaming __ On and on __ Dont test my limits cause you dont believe me");

    Set<String> keys = trackList.keySet();
    for(String key : keys){
      System.out.println(key);
      System.out.println(trackList.get(key));
    }
  }
}