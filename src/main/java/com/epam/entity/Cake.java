package com.epam.entity;

import com.epam.entity.templ.Sweets;

public class Cake  extends Sweets {

    public Cake(String name, double weigh, int amount) {
        super.setName(name);
        super.setWeigh(weigh);
        super.setAmount(amount);
    }

    @Override
    public String toString() {
        return "Cake{ name:"+super.getName()+", weigh:"+super.getWeigh()+", amount:"+super.getAmount()+" }" ;
    }
}
