package com.jungmin;

import java.util.Scanner;

public class Kiosk {
    private final static MenuItem menuItem1 = new MenuItem("김밥", 1000);
    private final static MenuItem menuItem2 = new MenuItem("계란 김밥", 1500);
    private final static MenuItem menuItem3 = new MenuItem("충무 김밥", 1000);
    private final static MenuItem menuItem4 = new MenuItem("떡볶이", 2000);


    // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
    public static void start() {
        System.out.println("김밥천국에 오신 것을 환영합니다");
    }
    // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("원하시는 메뉴의 번호를 입력하여 주세요");
            System.out.println("1) " + menuItem1.getName() +  menuItem1.getPrice() +
                    " 2) " + menuItem2.getName() + menuItem2.getPrice() +
                    " 3) " + menuItem3.getName() + menuItem3.getPrice() +
                    " 4) " + menuItem4.getName() + menuItem4.getPrice());
            // "1) %s %d 로 , menuItem1.getName()으로 받을 수 잇음

            choice = Integer.parseInt(scanner.nextLine());

            if (choice < 1 || choice > 4) {
                System.out.println("메뉴에 포함된 번호를 입력하여 주세요");
            }
        } while (choice < 1 || choice > 4);
        return choice;
    }
    // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.
    public static int count() {
        Scanner scanner = new Scanner(System.in);
        int count;
       do {
           System.out.println("선택하신 메뉴의 수량을 입력하여 주세요");
           System.out.println("(※ 최대 주문 가능 수량 : 99)");
           count = scanner.nextInt();

           if (count >= 100) {
               System.out.println(count + "개는 입력하실 수 없습니다");
               System.out.println("수량 선택 화면으로 돌아갑니다");
           }
       } while(count >= 100);
       return count;
    }
    // 음식 주문을 위한 메서드를 정의할 수 있습니다.

    // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
    public static int price(int choice, int count) {
        int totalPrice = 0;
        if (choice == 1) {
            totalPrice = menuItem1.getPrice() * count;
        } else if (choice == 2) {
            totalPrice = menuItem2.getPrice() * count;
        } else if (choice == 3) {
            totalPrice = menuItem3.getPrice() * count;
        } else {
            totalPrice = menuItem4.getPrice() * count;
        }
        return totalPrice;

    }
}
