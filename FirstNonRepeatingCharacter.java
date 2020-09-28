import java.util.HashMap;

class FirstNonRepeatingCharacter{
    // Given a string, find index of first non-repeating character in it.
    
    // Input
    // loveleetcode

    // Output
    // 2
    public static int nonRepeatingCharacter(String str){
        HashMap<Character , Integer> hs = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            hs.put(ch , hs.getOrDefault(ch ,0)+1);
            
        }
        for (int i = 0; i < str.length(); i++) { 
             if (hs.get(str.charAt(i)) == 1)  {
                  return i;
             }
        }
        return -1;
      
       
    }
    public static void main(String[] args) {
        String str = "loveleetcode";
        int index = nonRepeatingCharacter(str);
        System.out.println(index);
    }
}