package com.iva;

public class IVAMain {

    public static void main(String[] args){
        System.out.println(addIVA(10, 21));

    }

    public static float addIVA(int precio, int iva)
    {
        float result = (float) precio * (1 + (float)iva/100);
        return result;
    }


}
