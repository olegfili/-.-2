//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2017;
        clientOS = 1;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1)
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        else {
            System.out.println("Неизвестная операционная система");
        }

        System.out.println("Задание 3");
        int year = 2021;
        if (year >= 1584)
            if (year % 4 == 0) {
                System.out.println(year + " год является високостным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високостным");
            } else if (year % 400 == 0) {
                System.out.println(year + " год является високостным");
            } else {
                System.out.println(year + " год не является високостным");
            }

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        if ( deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60  ) {
            days++;
        }
        System.out.println("Потребуется дней: " + days);



        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");

        }









    }

}