public class Complex {
    private int real;
    private int imaginary;

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
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


    
}
