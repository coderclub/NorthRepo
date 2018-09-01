package DataStructure;

public class TestAuth {
    public static void main(String[] args) {

        Authentication.Login.loginPromt();
        Authentication au = new Authentication();
        au.greetings();
        au.Reg.emailInput();
    }
}
