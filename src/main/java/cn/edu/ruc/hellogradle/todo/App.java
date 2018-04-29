package cn.edu.ruc.hellogradle.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/4/30
 */
public class App {

    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++ i > 0){
            log.info(i + ". place input todo item name:");
            TodoItem item = new TodoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
