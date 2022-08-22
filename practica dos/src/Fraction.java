public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

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

    public Fraction add(Fraction a, Fraction b){
        int newNumerator = ((a.getNumerator()*b.getDenominator())+(a.getDenominator()*b.getNumerator()));
        int newDenominator = ((a.getDenominator()*b.getDenominator()));
        Fraction add = new Fraction(newNumerator, newDenominator);
        return add;
    }

    public Fraction subtract(Fraction a, Fraction b){
        int newNumerator = ((a.getNumerator()*b.getDenominator())-(a.getDenominator()*b.getNumerator()));
        int newDenominator = ((a.getDenominator()*b.getDenominator()));
        Fraction subtract = new Fraction(newNumerator, newDenominator);
        return subtract;
    }

    public Fraction multiply(Fraction a, Fraction b){
        int newNumerator = (a.getNumerator()*b.getNumerator());
        int newDenominator = (a.getDenominator()*b.getDenominator());
        Fraction multiply = new Fraction(newNumerator, newDenominator);
        return multiply;
    }

    public Fraction divide(Fraction a, Fraction b){
        int newNumerator = (a.getNumerator()*b.getDenominator());
        int newDenominator = (a.getDenominator()*b.getNumerator());
        Fraction divide = new Fraction(newNumerator, newDenominator);
        return divide;
    }

    public Fraction simplify(Fraction a){
        int newNumerator = a.getNumerator();
        int newDenominator = a.getDenominator();
        for(int i = newNumerator; i>0; i--){
            if(newNumerator%i==0 && newDenominator%i==0){
                newNumerator = newNumerator/i;
                newDenominator = newDenominator/i;
            }
        }
        Fraction simplify = new Fraction(newNumerator, newDenominator);
        return simplify;
    } 

    @Override
    public String toString(){
        return numerator+"/"+denominator;
    }

}
