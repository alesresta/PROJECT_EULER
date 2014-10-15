﻿/*
The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?

Result ---------------> 76576500
 */


public class Euler12{
        
    public static void main(String[] args) {
        
        int th = 1;
        int triangleNum = 1;
        int nDiv = 0;
        
        while (nDiv <= 5) {
            nDiv = countDiv(triangleNum); // Chama a funçao que verifica o numero de divisores do numero tiangular
            th++; // incrementa a posicao do n triangular 1º, 2º
            triangleNum += th; // Numero Trinagular + a sua posiçao dá acesso ao seu numero seguinte
            
            System.out.println(th+"º Numero Triangular é "+triangleNum+", e tem "+nDiv+" Divores");
        }

        int result = triangleNum-th; //Numero tringular com menos a sua posicao temos acesso ao anterior numero triangular
        System.out.println("Result -- " + result);   
    }
    
    private static int countDiv(int x) {
        int count = 1;
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                count ++;
            }
        }
        
        return count;
    }
}
