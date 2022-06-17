/*
  Номер зачетной книжки: 21-702.
 
  Выполнил:Федоров Артем Андреевич 
  Дата: 15.06.2022
 
  Передавать в качестве параметров два целочисленных числа. Вывести на экран 
  как сами значения, так и их сумму "3 + 2 = 5.". Если количество параметров не 
  равно 2, вывести сообщение "Неверное количество параметров.".
 */

public class Feduc3 {
    public static void main(String[] args) {
        if (args.length == 2) { /* Если в качестве параметров передано два целочисленных числа */
            int i = Integer.parseInt(args[0]); /* Целочисленное число в качестве первого аргумента */
            int j = Integer.parseInt(args[1]); /* Целочисленное числе в качестве второго аргумента */
            int result = i + j; /* Сумма двух целочисленных чисел */
        
            System.out.print(i + " + " + j + " = " + result); /* Значение двух целочисленных чисел и их сумма */
        } else {
            System.out.print("Неверное количество параметров."); 
        }
    }
}