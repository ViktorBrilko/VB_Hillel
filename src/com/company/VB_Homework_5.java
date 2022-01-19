package com.company;


public class VB_Homework_5 {
    public static void main(String[] args) {
        Box first = new Box(2, 3,4);
        System.out.println("Объем вашей коробки - " + first.countVolume());

        Box second = new Box(1.5, 2.36, 74);
        System.out.println("Объем вашей коробки - " + second.countVolume());

        Box third = new Box(11, 22, 63);
        System.out.println("Объем вашей коробки - " + third.countVolume());

        Box forth = new Box(0, 0,0);
        forth.setHeight(13);
        forth.setLength(100);
        forth.setWidth(12.31);
        System.out.println("Объем вашей коробки - " + forth.countVolume());

        Box evil = new Box(6, 6,6);
        evil.setHeight(999);
        evil.setLength(333);
        evil.setWidth(1);
        System.out.println("Объем вашей коробки - " + evil.countVolume());

    }
}