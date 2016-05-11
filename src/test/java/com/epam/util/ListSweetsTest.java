package com.epam.util;

import com.epam.entity.Cake;
import com.epam.entity.templ.Sweets;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertEquals;

public class ListSweetsTest {
    private ListSweets listSweets;

    @Before
    public void init() {
        listSweets = new ListSweets();
    }

    @Test
    public void testAddOne() {
        //given
        Sweets s1 = new Cake("c1",1,2);

        //when
        listSweets.add(s1);

        //then
        listSweets.print();
        assertEquals(1, listSweets.size());
    }

    @Test
    public void testAddMany() {
        //given
        for (int i = 0; i < 9; i++) {
            Sweets s1 = new Cake("c1"+i,i,2*i);
            listSweets.add(s1);
        }

        //then
        listSweets.print();
        assertEquals(9, listSweets.size());
    }

    @Test
    public void testEmptyList() {
        //then
        listSweets.print();
    }

    @Test
    public void testRemove_First() {
        //given
        Sweets s1 = new Cake("c1",12,2);
        Sweets s2 = new Cake("c2",18,29);
        Sweets s3 = new Cake("c3",1,20);
        Sweets s4 = new Cake("c4",14,2);

        listSweets.add(s1);
        listSweets.add(s2);
        listSweets.add(s3);
        listSweets.add(s4);

        //then
        listSweets.remove(s1);

        listSweets.print();
        for(Sweets sw : listSweets.getAll()){
            assertFalse(sw.equals(s1));
        }
        assertEquals(3,listSweets.size());
    }

    @Test
    public void testRemove_Middle() {
        //given
        Sweets s1 = new Cake("c1",12,2);
        Sweets s2 = new Cake("c2",18,29);
        Sweets s3 = new Cake("c3",1,20);
        Sweets s4 = new Cake("c4",14,2);

        listSweets.add(s1);
        listSweets.add(s2);
        listSweets.add(s3);
        listSweets.add(s4);

        //then
        listSweets.remove(s2);

        listSweets.print();
        for(Sweets sw : listSweets.getAll()){
            assertFalse(sw.equals(s2));
        }
        assertEquals(3,listSweets.size());
    }

    @Test
    public void testRemove_Last() {
        //given
        Sweets s1 = new Cake("c1",12,2);
        Sweets s2 = new Cake("c2",18,29);
        Sweets s3 = new Cake("c3",1,20);
        Sweets s4 = new Cake("c4",14,2);

        listSweets.add(s1);
        listSweets.add(s2);
        listSweets.add(s3);
        listSweets.add(s4);

        //then
        listSweets.remove(s4); // last elem

        listSweets.print();
        for(Sweets sw : listSweets.getAll()){
            assertFalse(sw.equals(s4));
        }
        assertEquals(3,listSweets.size());
    }

    @Test
    public void testGetWeighEmpty(){
        //when
        ListSweets list = new ListSweets();

        //then
        assertEquals(0.0,list.getWeigh());
    }
    @Test
    public void testGetWeigh(){
        //when
        ListSweets list = new ListSweets();
        for (int i = 0; i < 4; i++) {
            Sweets sw = new Cake("c1"+i,i,i);
            list.add(sw);
        }

        //then
        assertEquals(6.0, list.getWeigh());
    }

}
