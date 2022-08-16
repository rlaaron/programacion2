public class App {
    public static void main(String[] args) throws Exception {
        
        BankAccount account = new BankAccount("John", 1234, 1000);

        // System.out.println(account.getName());
        // System.out.println(account.getId());
        // System.out.println(account.getBalance());
        System.out.println(account.toString());

        CoffeeMaker maker = new CoffeeMaker();
        System.out.println(maker.fillCoffee());
        System.out.println(maker.serveCoffe(100));
        System.out.println(maker.addCoffe(200));
        System.out.println(maker.emptyCoffe());
        System.out.println(maker.toString());

    }


}
