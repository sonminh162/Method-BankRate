package com.company;

import java.util.Scanner;

public class Main{
    public static float tinhlai(float vay, float tile_laisuat, float biendo){
        float lai_thang;
        lai_thang = vay*(tile_laisuat+biendo)/12;
        return lai_thang;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float loans,tile_laisuat,biendo,KETQUA;
        System.out.print("Enter Loans:");
        loans = scanner.nextFloat();
        System.out.print("Enter interest_rate:");
        tile_laisuat = scanner.nextFloat();
        System.out.print("Enter Range:");
        biendo = scanner.nextFloat();
        KETQUA = tinhlai(loans,tile_laisuat,biendo);
        System.out.print("So tien phai hang thang:"+KETQUA);

    }
}
