package com.jungmin;

public class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() { // 위에 private이 있어서 name을 다른 곳에서 사용하기 위해 getter 만듦
        return name;
    }

    public int getPrice() {
        return price;
    }

}
