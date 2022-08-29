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
    public Fraction add(Fraction a, Fraction b){
        int newNumerator = ((a.getNumerator()*b.getDenominator())+(a.getDenominator()*b.getNumerator()));
        int newDenominator = ((a.getDenominator()*b.getDenominator()));
        Fraction add = new Fraction(newNumerator, newDenominator);
        add = simplify(add);
        return add;
    }

    /**
     * This function takes two fractions and subtracts them
     * 
     * @param a Fraction
     * @param b Fraction
     * @return The difference between the two fractions.
     */
    public Fraction subtract(Fraction a, Fraction b){
        int newNumerator = ((a.getNumerator()*b.getDenominator())-(a.getDenominator()*b.getNumerator()));
        int newDenominator = ((a.getDenominator()*b.getDenominator()));
        Fraction subtract = new Fraction(newNumerator,newDenominator);
        subtract = simplify(subtract);
        return subtract;
    }

    /**
     * This function takes two fractions and multiplies them together
     * 
     * @param a Fraction
     * @param b Fraction
     * @return The method is returning the simplified version of the fraction.
     */
    public Fraction multiply(Fraction a, Fraction b){
        int newNumerator = (a.getNumerator()*b.getNumerator());
        int newDenominator = (a.getDenominator()*b.getDenominator());
        Fraction multiply = new Fraction(newNumerator, newDenominator);
        multiply = simplify(multiply);
        return multiply;
    }

    /**
     * 
     * @param a Fraction
     * @param b Fraction@1b6d3586
     * @return The method is returning the simplified fraction.
     */
    public Fraction divide(Fraction a, Fraction b){
        int newNumerator = (a.getNumerator()*b.getDenominator());
        int newDenominator = (a.getDenominator()*b.getNumerator());
        Fraction divide = new Fraction(newNumerator, newDenominator);
        divide = simplify(divide);
        return divide;
    }

    /**
     * This function takes a fraction and returns a simplified version of that fraction
     * 
     * @param a Fraction
     * @return The simplified fraction.
     */
    public Fraction simplify(Fraction a){
        int mcd=mcd(a.numerator,a.denominator);
        int newNumerator = a.getNumerator()/mcd;
        int newDenominator = a.getDenominator()/mcd;
        Fraction simplify=new Fraction(newNumerator,newDenominator);
        return simplify;
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
