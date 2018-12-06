package by.artsiomiv.Task3;

//Каков самый большой делитель числа 600851475143, являющийся простым числом?
//http://euler.jakumo.org/problems/view/3.html

import java.util.ArrayList;
import java.util.List;


public class MainSimpleNb {

    public static void main(String[] args) {

        long inputNumber;
        inputNumber = 600851475143L;

        // Get Factorials
        ArrayList<Long> factorialsAll = factorialForInput(inputNumber);
        Long bigestFactorial = findLastSimpleFactorial(factorialsAll);
        System.out.println("Самый большой делитель, являющийся простым числом: " + bigestFactorial);




    }

    //Factorials Calculation
    private static ArrayList<Long> factorialForInput(Long input){

         // input Long число кторое будет разложено на факториалы и вернет результат

        Long curMaxFactor = input;
        System.out.println(curMaxFactor);

        List<Long> listHighFactorials = new ArrayList<>();
        List<Long> listLowFactorials = new ArrayList<>();
        for(Long i = 2L;i < curMaxFactor;i++){
            //обновляет i когла найден следующий больший факториал
            if(input % i == 0L){
                curMaxFactor = input/i;

                listHighFactorials.add(curMaxFactor);

                listLowFactorials.add(i);
            }
        }

        ArrayList<Long> listAllFactorials = new ArrayList<>(listLowFactorials);

        // перекидываем из большего списка в обратном порядке
        for(int j = (listHighFactorials.size() - 1 );j>=0;j--){
            listAllFactorials.add(listHighFactorials.get(j));
        }

        return listAllFactorials;
    }


    private static Long findLastSimpleFactorial(ArrayList<Long> inputListNums){

        //из всех факториалов выбираем простые числа
        ArrayList<Long> primeFactorials = new ArrayList<>();
        for (Long num : inputListNums) {
            if(isPrime(num)){
                primeFactorials.add(num);
            }
        }
        return (primeFactorials.get(primeFactorials.size()-1));
    }

    private static boolean isPrime(Long num){

        for(Long i = 1L;i<num;i++){
            if(num % i == 0 && i != 1L){
                return false;
            }
        }
        return true;
    }




}
