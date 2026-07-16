// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        // TODO: implement ตาม spec ใน README.md (R1-R6)
        if(pw == null) throw new IllegalArgumentException();
        if ((pw.length()<8)) return false;
        if ((pw.length()>20)) return false;

        boolean hasupper = false;
        boolean haslower = false;
        boolean hasdigit = false;
        boolean hadspace = true;
        
        
        
        for (int i = 0; i < pw.length(); i++){

            if(Character.isUpperCase(pw.charAt(i))) hasupper = true;
            if(Character.isLowerCase(pw.charAt(i))) haslower = true;
            if(Character.isDigit(pw.charAt(i))) hasdigit = true;
            if(Character.isWhitespace(pw.charAt(i))) hadspace = false;
            
                
            
            

            
        }

        return haslower && hasupper && hasdigit && hadspace ;
    }
}
