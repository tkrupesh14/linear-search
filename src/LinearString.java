public class LinearString {
    public static void main(String[] args) {
        String nm = "krupesh";
        char t = 'a';
        System.out.println(stringLinear(nm, t));
    }
    static boolean stringLinear(String name, char target){
        if (name.length() == 0){
            return false;
        }
        for (int i=0; i<name.length(); i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return  false;
    }
}
