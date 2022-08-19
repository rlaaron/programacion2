public  class BankAccount{
    private String name;
    private int id;
    private double balance;

    // A constructor.
    public BankAccount() {
        name = "juan perez";
        id = 1200;
        balance = 2000;
    }
    // A constructor.
    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    /**
     * This function returns the name of the person
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * This function takes in a double amount and adds it to the balance
     * 
     * @param amount The amount to deposit
     * @return The balance is being returned.
     */
    public double deposit(double amount) {
        System.out.println("Balance after deposit: ");
        return  balance += amount;
    }

    public double withdraw(double amount) {
        double balanceTemp = balance - amount;
        if(balanceTemp < 0){
            balance = 0;
            System.out.println("Error: You can't withdraw more than you have");
            System.out.println("You have left: ");
            return balance;
        }
        balance = balanceTemp;
        System.out.println("Balance after withdraw: ");
        return balance;
    }

    public String toString() {
        return "AccountBank [name=" + name + ", id=" + id + ", balance=" + balance + "]";
    }


}
