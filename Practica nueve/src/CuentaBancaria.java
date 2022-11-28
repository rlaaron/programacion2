public class CuentaBancaria {
  private double balance;
    private int noCuenta;

    public CuentaBancaria(double balanceInicial, int noCuenta) {
        if(balanceInicial < 0){
            throw new IllegalArgumentException("Balance inicial no puede ser negativo");
        }
        String aux = noCuenta + "";

        if(aux.length() < 5){
            throw new IllegalArgumentException("No. debe de ser mayor");
        }

        this.balance = balanceInicial;
        this.noCuenta = noCuenta;
    }
    
    public double getBalance() {
        return balance;
    }

    public int getNoCuenta() {
        return noCuenta;
    }
    
    public void depositar(double cantidad ) {
        if(cantidad<0){
            throw new IllegalArgumentException("¡Cantidad negativa, no es posible depositar! Proporcione un valor positivo.");
        }
        balance = balance + cantidad;
    }

    public void retirar(double cantidad) throws SobregiroNegativo {
        if(cantidad<0){
            throw new IllegalArgumentException("¡Cantidad negativa, no es posible retirar! Proporcione un valor positivo.");
        }
        if(cantidad>getBalance()){
            throw new SobregiroNegativo("¡No hay fondos suficientes!");
        }
        else{
        balance = balance - cantidad;}
    }
    
    @Override
    public String toString () {
        return "" + noCuenta + " $" + balance;
    }
}
