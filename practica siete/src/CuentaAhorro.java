public class CuentaAhorro extends Cuenta{
    private double interes;
        
    public CuentaAhorro(int noCuenta, int balance, double interes) {
        super(noCuenta, balance);
        this.interes = interes; 
    }
    public void setInteres(double Inter){
        interes=Inter;
    }
    public double getInteres(){
        return interes;
    }
    public void agregarIntereses(){
        double intereses = super.getBalance() * (interes/100);
        // super.setBalance(super.getBalance() + intereses);
        super.depositar(intereses);
    }
    @Override
    public void retirar(double suma){
        if(suma > super.getBalance()){
            System.out.println("No se puede retirar esa cantidad");
        }else{
            super.retirar(suma);
            System.out.println("Retiro exitoso");
        }
    }
    @Override
    public String toString() {
        return super.toString()+ " Cuenta Ahorro{" + "interes=" + interes + "%}";
    }
    
    
}
