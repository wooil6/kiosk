package com.jungmin;

public class KioskApplication {
    public static void main(String[] args) {
        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        Kiosk order = new Kiosk(); // 키오스크 클래스를 가져올거니까

        order.start();
        int choice = order.choice();
        int count = order.count();


        int totalPrice = order.price(choice, count);

        System.out.println("주문하신 메뉴의 총 금액은 " + totalPrice + "원 입니다");

        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.



    }
}
