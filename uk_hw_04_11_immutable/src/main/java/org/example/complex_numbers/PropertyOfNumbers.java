package org.example.complex_numbers;

public class PropertyOfNumbers {
    public PropertyOfNumbers() {
    }

    public ComplexNumber sum(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.x() + z2.x(), z1.y() + z2.y());
    }

    public ComplexNumber sub(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.x() - z2.x(), z1.y() - z2.y());
    }

    public ComplexNumber multi(ComplexNumber z1, ComplexNumber z2) {
        double v = z1.x() * z2.x() - z1.y() * z2.y();
        double w = z1.x() * z2.y() + z1.y() * z2.x();
        return new ComplexNumber(v, w);
    }

    public ComplexNumber divide(ComplexNumber z1, ComplexNumber z2) {
        double v = (z1.x() * z2.x() + z1.y() * z2.y()) / (z2.x() * z2.x() + z2.y() * z2.y());
        double w = (z1.y() * z2.x() - z1.x() * z2.y()) / (z2.x() * z2.x() + z2.y() * z2.y());
        return new ComplexNumber(v, w);
    }

    public Double module(ComplexNumber z) {
        return Math.sqrt(z.x() * z.x() + z.y() * z.y());
    }
}

