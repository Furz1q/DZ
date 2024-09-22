import java.time.LocalDate;

public class Main {
    public static void checkAndPrint(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    private static boolean isOldDevise ( int clientDeviceYear){
        int currentYear = 2015;
        return clientDeviceYear <= currentYear;
    }
    private static String giveRecommendVersion(int clientDeviceYear, int clientOS) {
        String massage = "Установите ";
        if (isOldDevise(clientDeviceYear)) {
            massage += "облегченную ";
        }
        massage += "версию приложения для ";
        if (clientOS == 1) {
            massage += "Android по ссылке";
        } else {
            massage += "iOS по ссылке";
        }
        return massage;
    }
    private static String calculateDeliveryDistance(int deliveryDistance) {
        String days = "Потребуется дне: ";
        if (deliveryDistance <= 20){
            days += "1";
        }else if (deliveryDistance > 20 && deliveryDistance <= 60){
            days += "2";
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            days += "3";
        }else {
            days = "Доставки нет";
        }
        return days;
    }

    public static void main(String[] args) {
        {
            System.out.println("Задание 1");

            int year = 2023;
            checkAndPrint(year);
        }

        {
            System.out.println("Задание 2");

            int clientOS = 1;
            int clientDeviceYear = 2015;
            System.out.println(giveRecommendVersion(2016, 1));

        }

        {
            System.out.println("Задание 3");

            System.out.println(calculateDeliveryDistance(188));


        }
    }
}

