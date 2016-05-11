package com.epam.entity.box;

import com.epam.entity.templ.Sweets;
import com.epam.util.ListSweets;

public class Box {
    private ListSweets list;

    public Box() {
        list=new ListSweets();
    }

    public void addSweet(Sweets sw){
       list.add(sw);
    }

    public boolean removeSweet(Sweets sw){
        return list.remove(sw);
    }

    public int countTypeSweets(){
        return list.size();
    }

    public double getWeigh(){
        return list.getWeigh();
    }

    public int getCountAllSweets(){
        return  list.getCountAllSweets();
    }

    public ListSweets getAllSweets(){
        return list;
    }

    public void sortWeigh(){
        list.sortWeigh();
    }

    public void sortAmount(){
        list.sortAmount();
    }


}
