package com.epam.util;

import com.epam.entity.templ.Sweets;

public class ListSweets {
    private Sweets[] list;

    public void add(Sweets sw) {
        if (list != null) {
            Sweets[] result = new Sweets[list.length + 1];
            System.arraycopy(list, 0, result, 0, list.length);
            result[result.length - 1] = sw;
            list = result;
        } else {
            list = new Sweets[1];
            list[0] = sw;
        }
    }

    public boolean remove(Sweets sw) {
        if (list != null) {
            for (int i = 0; i < list.length; i++) {
                Sweets[] result = new Sweets[list.length - 1];
                if (list[list.length - 1].equals(sw)) {
                    System.arraycopy(list, 0, result, 0, list.length - 1);
                    this.list = result;
                    return true;
                }
                if (list[i].equals(sw)) {
                    System.arraycopy(list, 0, result, 0, i);
                    for (; i < list.length - 1; i++) {
                        int j = i;
                        result[i] = list[++j];
                    }
                    this.list = result;
                    return true;
                }
            }
        }
        return false;
    }

    public Sweets[] getAll() {
        return list;
    }

    public int size() {
        return list.length;
    }

    public void sortWeigh(){
        for (int j = list.length - 1; j > 0; j--) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].getWeigh() > list[i + 1].getWeigh()) {
                    Sweets result = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = result;
                }
            }
        }
    }

    public void sortAmount(){
        for (int j = list.length - 1; j > 0; j--) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].getAmount() > list[i + 1].getAmount()) {
                    Sweets result = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = result;
                }
            }
        }
    }

    public double getWeigh() {
        double weigh = 0;
        if (list != null) {
            for (Sweets sw : list) {
                weigh += sw.getWeigh();
            }
        }
        return weigh;
    }

    public int getCountAllSweets(){
        int count = 0;
        if (list != null) {
            for (Sweets sw : list) {
                count += sw.getAmount();
            }
        }
        return count;
    }

    public void print() {
        if (list != null)
            for (Sweets sw : list) {
                System.out.println(sw);
            }
    }

}
