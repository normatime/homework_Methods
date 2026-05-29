//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Task 1");
        System.out.println();
        int currentYear = 1582;
        yearCounter(currentYear);

        System.out.println();
        System.out.println("Task 2");
        System.out.println();

        int clientOS = 1;

        int clientDeviceYear = LocalDate.now().getYear();

        deviceChecker(clientOS, clientDeviceYear);


        System.out.println();
        System.out.println("Task 3");
        System.out.println();


        int deliveryDistance = 5;
        int deliveryDays = deliveryTracker(deliveryDistance);
        if (deliveryDays != -1) {
            System.out.println("На доставку потребуется  " + deliveryDays + " дней");


        }


    }

    public static void yearCounter(int year) {

        if (year <= 1582) {

            System.out.println("Григорианский календарь был введён с 1582 года.");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год невисокосный");
        }

    }

    public static void deviceChecker(int deviceType, int deviceYear) {

        deviceYear = LocalDate.now().getYear();
        boolean android = deviceType == 1;
        boolean ios = deviceType == 0;

        if(deviceYear <2015 && android){
            System.out.println("Установите упрощённую версию для Android по ссылке.");

        }else if(deviceYear<2015 && ios){
            System.out.println("Установите упрощённую версию для IOS по ссылке.");

        }else if(android){
            System.out.println(" Установите версию для Android по ссылке. ");

        }else if(ios){
            System.out.println("Установите версию для IOS по ссылке. ");

        }

    }

    public static int deliveryTracker(int distanceDelivery) {

        if (distanceDelivery <= 20) {

            return 1;

        } else if (distanceDelivery <= 60) {

            return 2;

        } else if (distanceDelivery <= 100) {

            return 3;

        } else {

            System.out.println("Доставка не осуществляется!");
            return -1;


        }

    }


}
//1





