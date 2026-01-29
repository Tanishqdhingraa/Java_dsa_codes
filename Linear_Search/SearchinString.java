package Linear_Search;

public class SearchinString {
    public static void main(String[] args) {
        String st = "Tanishq";
        char ch = 'p';
        boolean response = isinWord(st , ch);
        System.out.println(response);
    }
    static boolean isinWord(String str , char ch){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0 ; i < str.length(); i++){
            if(ch == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    
}
