public class CuentaCorriente extends Cuenta {
    private int limite;
    private boolean sobregiro;

    public CuentaCorriente(int noCuenta, int balcane, int limite) {
        super(noCuenta, balcane);
        this.limite = limite;
        this.sobregiro = false;
    }

    public void setLimite(int Limite) {
        limite = Limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setSobregiro(boolean Sobregiro) {
        sobregiro = Sobregiro;
    }

    public boolean getSobregiro() {
        return sobregiro;
    }

    @Override
    public void retirar(double suma){
	    if(suma >= super.getBalance()+ limite){
            System.out.println("Eso excede el límite Retiro no exitoso "); 
        } else if (suma > super.getBalance() ) { 
            System.out.println("Cuenta sobregirada   "); 
            this.sobregiro = true; 
            double l = super.getBalance() + limite; 
            double l2 = suma - l; 
            super.retirar(l2);
            System.out.println("Balance actual  = " + super.getBalance() );
            System.out.println("Retiro exitoso " );
        }else {
            super.retirar(suma);
            System.out.println("Retiro exitoso ");
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Cuenta Corriente{" + "limite=" + limite + '}';
    }

}
