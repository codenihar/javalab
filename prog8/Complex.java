class Complex {
    double real;
    double imaginary;

    // Constructor to initialize complex numbers
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Method to add two complex numbers
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    // Method to subtract two complex numbers
    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    // Method to multiply two complex numbers
    public static Complex multiply(Complex c1, Complex c2) {
        return new Complex(c1.real * c2.real - c1.imaginary * c2.imaginary,
                c1.real * c2.imaginary + c1.imaginary * c2.real);
    }

    // Method to divide two complex numbers
    public static Complex divide(Complex c1, Complex c2) {
        double denominator = c2.real * c2.real + c2.imaginary * c2.imaginary;
        return new Complex((c1.real * c2.real + c1.imaginary * c2.imaginary) / denominator,
                (c1.imaginary * c2.real - c1.real * c2.imaginary) / denominator);
    }

    // Method to display complex number
    public void display() {
        if (imaginary < 0)
            System.out.println(real + " - " + (-imaginary) + "i");
        else
            System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, -1);

        System.out.println("Complex numbers:");
        System.out.print("c1 = ");
        c1.display();
        System.out.print("c2 = ");
        c2.display();

        System.out.println("\nAddition:");
        Complex sum = Complex.add(c1, c2);
        sum.display();

        System.out.println("\nSubtraction:");
        Complex difference = Complex.subtract(c1, c2);
        difference.display();

        System.out.println("\nMultiplication:");
        Complex product = Complex.multiply(c1, c2);
        product.display();

        System.out.println("\nDivision:");
        Complex quotient = Complex.divide(c1, c2);
        quotient.display();
    }
}
