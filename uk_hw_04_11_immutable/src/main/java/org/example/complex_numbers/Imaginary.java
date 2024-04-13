package org.example.complex_numbers;
/*
1 Если Вы знаете что такое комплексные числа, создайте неизменяемый класс
комплексных чисел с методами суммы, разности, произведения, деления и модуля
комплексного числа.
 */
public class Imaginary {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(1.0,-1);
        System.out.println(z1);
        ComplexNumber z2 = new ComplexNumber(-3.0,4.0);
        System.out.println(z2);
        PropertyOfNumbers property1 = new PropertyOfNumbers();
        System.out.println(property1.sum(z1, z2));
        System.out.println(property1.sub(z1, z2));
        System.out.println(property1.multi(z1, z2));
        System.out.println(property1.divide(z1, z2));
        System.out.println(property1.module(z1));
        System.out.println(property1.module(z2));

    }
}
