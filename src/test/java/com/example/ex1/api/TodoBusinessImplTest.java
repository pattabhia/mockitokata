package com.example.ex1.api;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TodoBusinessImplTest  {

    @Test
    public void testRetrieveTodosRelatedToSpring() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2,filteredTodos.size());
    }
}