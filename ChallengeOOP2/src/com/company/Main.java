package com.company;

import java.util.Scanner;

public class Main
{
    public static int luas (int panjang ,int lebar){
        return panjang*lebar;
    }
    public static void main(String[] args)
    {
        Variabel variabel = new Variabel();
        variabel.setPanjang(5);
        variabel.setLebar(4);
        System.out.println(luas(variabel.getPanjang(),variabel.getLebar()));

    }
}