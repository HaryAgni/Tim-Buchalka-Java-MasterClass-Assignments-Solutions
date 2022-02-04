public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real1,double imaginary1){
        this.real = getReal()+real1;
        this.imaginary = getImaginary()+imaginary1;
    }
    public void add(ComplexNumber another){
        add(another.getReal(),another.getImaginary());
    }
    public void subtract(double real1,double imaginary1){
        this.real = this.getReal()-real1;
        this.imaginary = this.getImaginary()-imaginary1;
    }
    public void subtract(ComplexNumber another){
        subtract(another.getReal(),another.getImaginary());
    }
}
