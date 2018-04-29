package cn.edu.ruc.hellogradle.todo;

import java.util.Scanner;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/4/30
 */
public class App {
    public static void main(String[] args){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++ i > 0){
            System.out.println(i + ". place input todo item name:");
            TodoItem item = new TodoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
