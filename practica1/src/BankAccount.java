public  class BankAccount{
    private String name;
    private int id;
    private double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

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

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public String toString() {
        return "AccountBank [name=" + name + ", id=" + id + ", balance=" + balance + "]";
    }


}
