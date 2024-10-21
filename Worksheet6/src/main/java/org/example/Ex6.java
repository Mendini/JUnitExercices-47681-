package org.example;

public class Ex6
{
    public double mediaDigitos(int numero)
    {
        int soma = 0;
        int quantDigitos = 0;
        int n = Math.abs(numero);
        while (n > 0)
        {
            soma += n % 10;
            n /= 10;
            quantDigitos++;
        }
        if (quantDigitos == 0)
        {
            return 0;
        }
        return (double) soma / quantDigitos;
    }
}
