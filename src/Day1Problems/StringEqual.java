package Day1Problems;

public class StringEqual {
    static String checkStringEquality(String str1,String str2) {
        if(str1 == str2){
            return "Strings are Equal";
        }else {
            return "Strings are not equal";
        }
    }

    public static void main(String[] args) {
        String str1 = "KAVYA";
        String str2 = "GANESH";

        String str3 = "KAVYA";
        String str4 = "KAVYA";

        checkStringEquality(str1, str2);
        checkStringEquality(str3, str4);
    }
}
