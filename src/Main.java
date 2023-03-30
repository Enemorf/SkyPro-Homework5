public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    static void task1()
    {
        System.out.println("Задание 1");
        boolean clientOS = false; // true = Android false = iOS

        if(clientOS)
        {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }
        else
        {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        }
        System.out.println("----\n");
    }

    static void task2()
    {
        System.out.println("Задание 2");
        boolean clientOS = false; // true = Android false = iOS
        int clientDeviceYear = 2015;

        if(clientOS)
        {
            if(clientDeviceYear >= 2015)
            {
                System.out.println("Установите версию приложения для Android по ссылке...");
            }
            else
            {
                System.out.println("Установите облегченную версию приложения для Android по ссылке...");
            }
        }
        else
        {
            if(clientDeviceYear >= 2015)
            {
                System.out.println("Установите версию приложения для iOS по ссылке...");
            }
            else
            {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке...");
            }
        }
        System.out.println("----\n");
    }

    static void task3()
    {
        System.out.println("Задание 3");
        int year = 2023;

        boolean isLeapYear = (year % 4) == 0;
        System.out.printf("Год "+year+" является");

        if(isLeapYear)
        {
            System.out.printf(" високосным\n");
        }
        else
        {
            System.out.printf(" не високосным\n");
        }
        System.out.println("----\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");
        int deliveryDistance = 95;

        if(deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("----\n");
    }

    static void task5()
    {
        System.out.println("Задание 5");
        byte monthNumber = 12;

        switch (monthNumber)
        {
            case 1:
            case 2:
            case 12:
            {
                System.out.println("Это - зимний месяц.");
                break;
            }
            case 3:
            case 4:
            case 5:
            {
                System.out.println("Это - весенний месяц.");
                break;
            }
            case 6:
            case 7:
            case 8:
            {
                System.out.println("Это - летний месяц.");
                break;
            }
            case 9:
            case 10:
            case 11:
            {
                System.out.println("Это - осенний месяц.");
                break;
            }
            default:
            {
                System.out.println("Нет такого месяца");
                break;
            }
        }
        System.out.println("----\n");
    }
}