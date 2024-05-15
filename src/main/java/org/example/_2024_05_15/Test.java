package org.example._2024_05_15;


// Создать класс Test.
//Создать метод main.
//Создать все переменные примитивных и не примитивных типов.
//Присвоить значения переменным.
//Распечатать результат в консоль
public class Test {
    public static void main(String[] args) {
        // примитивные
//        byte byteValue = 1;
//        System.out.println(byteValue);

//        short shortValue = 900;
//        System.out.println(shortValue);

//        int intValue = 2000000;
//        System.out.println(intValue);

//        long longValue = 5000_000_000L;
//        System.out.println(longValue);

//        float floatValue = 15.5f;
//        System.out.println(floatValue);

//        double doubleValue = 111.111;
//        System.out.println(doubleValue);

//        boolean booleanValue = true;
//        System.out.println(booleanValue);

        // не примитивные
        String string = "Vadzim";
        System.out.println(string);

// Дано: два целочисленных числа: 168 и 1500.
//Примените все математические операторы, результат операций вывести в консоль.
//Проанализировать результат.

        int num1 = 168;
        int num2 = 1500;

        int sum = num1 + num2;
        System.out.println(sum);

        int minus = num1 - num2;
        System.out.println(minus);

        int multiply = num1 * num2;
        System.out.println(multiply);

        //Дано трехзначное число. Вывести на экран все цифры этого числа
        //Пример: 345
        //Вывод в консоль: Число 345 -> 3, 4, 5

        int number = 345;
        int n1 = number/100;
        int n2 = number - (number - (n1 * 100)) / 10;
        // int n2 = (number % 100)) / 10;
        int n3 = number % 10;
        System.out.println("число" + number + "->" + n1 + "," + n2 + "," + n3);

//        В методе main инициализировать все примитивные типы и не примитивные типы.
//        2. Вывести их результат в консоль:
//        char: G
//        int: 89
//        byte: 4
//        short: 56
//        float: 4.7333436
//        double: 4.355453532
//        long: 12121

        byte byteValue = 4;
        System.out.println(byteValue);
        short shortValue = 56;
        System.out.println(shortValue);
        int intValue = 89;
        System.out.println(intValue);
        long longValue = 12121;
        System.out.println(longValue);
        float floatValue = 4.7333436f;
        System.out.println(floatValue);
        double doubleValue = 4.355453532;
        System.out.println(doubleValue);
        boolean booleanValue = true;
        System.out.println(booleanValue);
//
//        Character: G
//        Integer: 89
//        Byte: 4
//        Short: 56
//        Float: 4.7333436
//        Double: 4.355453532
//        Long: 12121

        Byte byteObj = 4;
        System.out.println(byteObj);

        Short shortObj = 56;
        System.out.println(shortObj);

        Integer integerObj = 89;
        System.out.println(integerObj);

        Long longObj = 12121L;
        System.out.println(longObj);


        Float floatObj = 4.7333436f;
        System.out.println(floatObj);

        Double doubleObj = 4.355453532;
        System.out.println(doubleObj);

        Character charObj = 'G';
        System.out.println(charObj);

        Boolean booleanObj = true;
        System.out.println(booleanObj);




    }
}
