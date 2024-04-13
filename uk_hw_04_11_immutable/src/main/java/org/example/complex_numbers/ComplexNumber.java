package org.example.complex_numbers;

public record ComplexNumber(double x, double y) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0;
    }

    @Override
    public String toString() {
        return "ImaginaryNumber{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
