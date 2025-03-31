public class Accessmodifier {
    public static void main(String[] args) {
        BankAccount b1= new BankAccount();
        b1.username = "vikas";
        //System.out.println(b1.password);
        System.out.println(b1.username);
        b1.setpassword("abcd");

        

        
    }
    
}
class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password = pwd;
    }
}
