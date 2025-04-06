

public class Complex extends Object {
    double real;
    double imaginary;

    public Complex() {
        this(0.0,0.0);
    }
    //Constructor
    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    //Setter-Mutator
    //Mevcut instance değişkenlerimize değer atamak için kullandığımız metotlardır.
    public void setReal(double real)
    {
        this.real = real;
    }
    public void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }

    //Getter-Accessor

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {return this.imaginary;}

    //Instance Methods

    public Complex plus(Complex other)
    {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }




    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(obj==this)
            return true;
        if(!(obj instanceof Complex))
            return false;
        Complex c = (Complex)obj;
        return this.real == c.real && this.imaginary == c.imaginary;
    }

    @Override
    public String toString()
    {
        return real+"+"+imaginary+"i";
    }

    public static void main(String[] args)
    {
        Complex a=new Complex(1.0,2.0);
        Complex b=new Complex(1.0,2.0);
        Complex c=a.plus(b);

        System.out.println(a.equals(b));
        System.out.println(c.toString());
    }
}



