package String_Comparision;

public class StringCom {
    public static void main(String[] args) {
        
        String password1= "rijon123";
        String password2 = "rijon123";
        String password3 = new String("rijon123");
        String password4 = new String("rijon123");

        //equal means contenst same...output true
        System.out.println(password1.equalsIgnoreCase(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        System.out.println();

        //== means referance same...output true
        System.out.println(password1==(password2));
        System.out.println(password1==(password3));
        System.out.println(password3==(password4));


    }
}
