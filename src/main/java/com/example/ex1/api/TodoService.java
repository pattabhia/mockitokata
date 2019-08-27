package com.example.ex1.api;

import java.util.List;

public interface TodoService {
    List<String> retrieveTodos(String user);
}
