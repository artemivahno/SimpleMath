package by.artsiomiv.Task2;

//Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.

public class MainFibonachi {

    public static void main(String[] args) {

        int val1 = 1;
        int val2 = 1;
        int fibonachi = 0;
        int sum = 0;
        int y = 4_000_000;

        while (fibonachi <= y){
            fibonachi = val1+val2;
            val1=val2;
            val2=fibonachi;

            boolean x = (fibonachi%2 == 0);

            if (x) sum += fibonachi;

        }
        System.out.println("Сумма четных чисел фибоначи до " +y+ " = " + sum);

    }
}
