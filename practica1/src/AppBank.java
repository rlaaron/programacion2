

public class AppBank {
    public static void main(String[] args) throws Exception{
        BankAccount account = new BankAccount("John", 1234, 1000);
        
        
        System.out.println(account.getName());
        System.out.println(account.getId());
        System.out.println(account.getBalance());
        System.out.println(account.toString());
    }
    
}
