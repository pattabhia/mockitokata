package com.example.ex1.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    
    @Override
    public List<String> retrieveTodos(String user) {
        List<String> list = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        System.out.println(list.size());
        return list;
    }
}
