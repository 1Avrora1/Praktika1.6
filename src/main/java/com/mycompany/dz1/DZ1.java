/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz1;

import java.util.Scanner;


/**
 *
 * @author NicSt
 */
public class DZ1 {

    public static void main(String[] args) {
        System.out.println("Практическое задание - 1.6, Студент - Стрыгин Никита Владиславович, Группа - РИБО-03-22, Вариант - 1");
        Scanner Name = new Scanner(System.in);
        System.out.println("Введите марку автомобиля: ");
        String name = Name.next();
        Autoservice car = new Autoservice(name,"");
        car.modify();
        System.out.println(car.toString());
    }
}
