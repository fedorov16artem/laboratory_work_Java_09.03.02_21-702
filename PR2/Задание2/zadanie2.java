/* 
 * Номер зачтеной книжки:21-702
 * Выполнил:Федоров Артем Андреевич 
 * Вариант:9
 * Задание: Дан Массив с(n). Переписать в Массив x(n) все нулевые элементы массива умноженные на 4.
 * (со сжатием., без пустых элментов внутри).Затем упорядочить метдом "выбора и перестановки" возрастанию новый массив.
 * 
 */

public class zadanie2 {
	public static void main (String[] args) {
		int n= 10; // размер массива
		int c[] = new int [n]; // объявление первого массива
		int x[] = new int [n]; // объявление второго массива
		for (int i = 0; i < n; i++) {
			c[i] = (int) (Math.random() * 10); // формирование массива случайными числами
			System.out.print(c[i] + " ");
		}
		System.out.println();
			for (int i=0; i<n; i++) { 
				if (c[i] !=0) { // проверью если в первом массиве элемент не раваен 0
					x[i] = c[i] *4; // то к элементу второго который не равен 0
					
				}
			}
			for(int i= 0; i < 10; i++)
				System.out.print(x[i] + " ");
	}

}