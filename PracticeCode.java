
 public class LinearSearch{
    public static void main(String[] args){
String d = "I just wanna be yours";
char f =' ';
System.out.println(Search(d, f));
    }
    public static boolean Search(String s, char target){
        if(s.length() == 0){
            System.out.println("The string is empty");
            return false;
        }
        for(int i =0; i<s.length(); i++){ 
        if(target == s.charAt(i)) {
            return true;
        }
        }
        return false;
    }
 }