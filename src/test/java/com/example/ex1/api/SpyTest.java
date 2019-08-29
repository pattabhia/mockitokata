package com.example.ex1.api;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    public void test() {
        List arrayListSpy = spy(ArrayList.class);
        assertEquals(0,arrayListSpy.size());
        arrayListSpy.add("welcome");//add didn't effect size!
        assertEquals(1,arrayListSpy.size());

        arrayListSpy.remove("welcome");
        assertEquals(0,arrayListSpy.size());
    }

    public void testOverideListMethod() {
        List arrayListSpy = spy(ArrayList.class);
        stub(arrayListSpy.size()).toReturn(6);
        assertEquals(5,arrayListSpy.size());
        assertEquals(null,arrayListSpy.get(0));
        verify(arrayListSpy).size();
        verify(arrayListSpy,never()).get(1);//TODO: Something Incorrect here, check it!!
    }
}
