package by.artsiomiv.Task1;

//Найдите сумму всех чисел меньше 1000, кратных 3 или 5.

public class Math35 {

    public static void main(String[] args) {
        int start = 0;
        int end = 1000;
        int sum =0;

        for (int i=start; i < end; i++){
            boolean x = (i%3 == 0);
            boolean y = (i%5 == 0);

            if (x || y ) {
                System.out.println(i + " ");
                sum +=i;
            }

        }
        System.out.println("Итого " +sum);
    }
}
