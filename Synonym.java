import java.util.HashMap;
import java.util.Scanner;

public class Synonym {
    public static void main(String[] args) {
        HashMap<String, String[]> synonomes= new HashMap<String, String[]>();
        synonomes.put("hello", new String[]{"Hi","Hey"});
        synonomes.put("Bye", new String[]{"Good bye","c ya"});
        synonomes.put("good morning", new String[]{"gd mrng","gm"});
        
        Scanner acan = new Scanner(System.in);
        
        
        String syno = acan.next();
        String[] names = synonomes.get(syno);
        for(String temp: names){
            System.out.println(temp);
        }
        
    }
    
}

