public class Complex {
    private int real;
    private int imaginary;

    public Complex(){
        this.real = 10;
        this.imaginary = 20;
    }
    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    // getters
    public int getReal(){
        return real;
    }

    public int getImaginary(){
        return imaginary;
    }

    // setters

    public void setReal(int real){
        this.real = real;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    /**
     * This function takes two complex numbers, adds them together, and returns the sum
     * 
     * @param a Complex
     * @param b (2, 3)
     * @return The method is returning the sum of the two complex numbers.
     */
    public Complex add(Complex a){
        return new Complex(a.getReal()+this.real, a.getImaginary()+this.imaginary);
    }


    /**
     * This function takes two complex numbers, a and b, and returns a new complex number that is the
     * difference of a and b
     * 
     * @param a Complex
     * @param b (2, 3)
     * @return The difference between the two complex numbers.
     */
    public Complex subtract(Complex a){
        int newReal = a.getReal()-this.real;
        int newImaginary = a.getImaginary()-this.imaginary;
        Complex subtract = new Complex(newReal, newImaginary);
        return subtract;
    }

    /**
     * This function takes two complex numbers and multiplies them together
     * 
     * @param a Complex
     * @param b (2, 3)
     * @return The method is returning the product of the two complex numbers.
     */
    public Complex multiply(Complex a){
        int newReal = (a.getReal()*this.real)-(a.getImaginary()*this.imaginary);
        int newImaginary = (a.getReal()*this.imaginary)+(a.getImaginary()*this.real);
        Complex multiply = new Complex(newReal, newImaginary);
        return multiply;
    }

    /**
     * This function takes a complex number and returns its conjugate
     * 
     * @param a The complex number to be conjugated
     * @return The conjugate of the complex number.
     */
    public Complex conjugate(){
        int newReal = this.real;
        int newImaginary = this.imaginary*-1;
        Complex conjugate = new Complex(newReal, newImaginary);
        return conjugate;
    }

   /**
    * // Java
    * public double module(Complex a, Complex b){
    *         return Math.sqrt((a.getReal()*this.real)+(a.getImaginary()*b.getImaginary()));
    *     }
    * 
    * @param a Complex
    * @param b the complex number that is being multiplied by the complex number a
    * @return The module of the complex number.
    */
    public double module(){
        return Math.sqrt((this.real*this.real)+(this.imaginary*this.imaginary));
    }

    /**
     * 
     * @param a Complex number
     * @return The angle of the complex number.
     */
    public int angle(){
        int angle = (int) Math.atan(this.imaginary/this.real);
        return angle;
    }

    public Boolean same(Complex a){
        if(this.real == a.getReal() && this.imaginary == a.getImaginary()){
            return true;
        }else{
            return false;
        }
    }

    /**
     * The toString() method returns a string representation of the object
     * 
     * @return The real and imaginary parts of the complex number.
     */
    @Override

    public String toString(){
        return "("+real+", "+imaginary+")";
    }

    
}
