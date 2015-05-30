package by.bsu.password;

/**
 * Created by dom on 14.02.2015.
 */
public class PasswordEqual {

    private  String pw = "";

    public PasswordEqual(String pw) {
        this.pw = pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public  String getPw() {
        return pw;
    }

    public void equal (String passw ) {
        String pw2 = getPw();
        System.out.print("Is equal? " + pw2.equals(passw) );
    }

}
