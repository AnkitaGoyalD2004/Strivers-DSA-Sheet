package POD.String;

public class RemoveOccOfSubstring {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        if(part.length() > s.length()){
            return s;
        }
        while(sb.indexOf(part) != -1 ){
            int idx=sb.indexOf(part);
          sb.delete(idx , idx + part.length());
          
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
