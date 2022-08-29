public class Fraction {
    private int numerator;
    private int denominator;

    // Default Constructor
    public Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

    // Param Constructor
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // getters

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    // setters
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    /**
     * This function takes two fractions and adds them together
     * 
     * @param a Fraction
     * @param b Fraction
     * @return The method is returning the sum of the two fractions.
     */
    public Fraction add(Fraction a){
        int newNumerator = ((a.getNumerator()*this.denominator)+(a.getDenominator()*this.numerator));
        int newDenominator = ((a.getDenominator()*this.denominator));
        Fraction add = new Fraction(newNumerator, newDenominator);
        add = simplifyPrivate(add);
        return add;
    }

    /**
     * This function takes two fractions and subtracts them
     * 
     * @param a Fraction
     * @param b Fraction
     * @return The difference between the two fractions.
     */
    public Fraction subtract(Fraction a){
        int newNumerator = ((a.getNumerator()*this.denominator)-(a.getDenominator()*this.numerator));
        int newDenominator = ((a.getDenominator()*this.denominator));
        Fraction subtract = new Fraction(newNumerator,newDenominator);
        subtract = simplifyPrivate(subtract);
        return subtract;
    }

    /**
     * This function takes two fractions and multiplies them together
     * 
     * @param a Fraction
     * @param b Fraction
     * @return The method is returning the simplified version of the fraction.
     */
    public Fraction multiply(Fraction a){
        int newNumerator = (a.getNumerator()*this.numerator);
        int newDenominator = (a.getDenominator()*this.denominator);
        Fraction multiply = new Fraction(newNumerator, newDenominator);
        multiply = simplifyPrivate(multiply);
        return multiply;
    }

    /**
     * 
     * @param a Fraction
     * @param b Fraction@1b6d3586
     * @return The method is returning the simplified fraction.
     */
    public Fraction divide(Fraction a){
        int newNumerator = (a.getNumerator()*this.denominator);
        int newDenominator = (a.getDenominator()*this.numerator);
        Fraction divide = new Fraction(newNumerator, newDenominator);
        divide = simplifyPrivate(divide);
        return divide;
    }

    /**
     * This function takes a fraction and returns a simplified version of that fraction
     * 
     * @param a Fraction
     * @return The simplified fraction.
     */
    public Fraction simplify(){
        int mcd=mcd(this.numerator,this.denominator);
        int newNumerator = this.numerator/mcd;
        int newDenominator = this.denominator/mcd;
        Fraction simplifyPrivate=new Fraction(newNumerator,newDenominator);
        return simplifyPrivate;
    }
    
    private Fraction simplifyPrivate(Fraction a){
        int mcd=mcd(a.numerator,a.denominator);
        int newNumerator = a.getNumerator()/mcd;
        int newDenominator = a.getDenominator()/mcd;
        Fraction simplifyPrivate=new Fraction(newNumerator,newDenominator);
        return simplifyPrivate;
    }
    
  /**
   * If b is 0, then return a, otherwise return the mcd of b and the remainder of a divided by b
   * 
   * @param a the first number
   * @param b the number of the first parameter
   * @return The greatest common divisor of a and b.
   */
    public int mcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return mcd(b,a%b);
        }
    }


    @Override
    public String toString(){
        return numerator+"/"+denominator;
    }

}
