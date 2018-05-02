package cn.edu.ruc.hellogradle.firstproject;

import java.util.*;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/5/1
 */
public class Calculator {

    public double sum(double num1, double num2){
        return num1 + num2;
    }

    public int sumEvens(List<Integer> integers){
        return integers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public Map<String, Integer> sortAndCount(List<String> strings){
        Collections.sort(strings);
        Map<String, Integer> result = new LinkedHashMap<>();
        strings.forEach(item -> result.put(item, item.length()));
        return result;
    }

}
