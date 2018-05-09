package cn.edu.ruc.hellogradle.todo;

import lombok.*;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/4/30
 */
@Setter
@Getter
@RequiredArgsConstructor()
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true,exclude="name")
public class TodoItem {

    private String name;

    private boolean hasDone;

    public TodoItem(String name) {
        this.name = name;
    }
}
