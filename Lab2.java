import java.util.Scanner;
import java.util.Random;

public class Lab2 {
	public static void matrint(char[][] arr, String line){
		// Виводить рядок line, а потім з нового рядка матрицю arr
		System.out.println(line);
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println("\n");
		}
	}
	public static void sumel(char[][] arr){
		// Обчислює і виводить суму найбільших парних елементів і найменших непарних
		char smax = 0, smin = 0, max, min;
		for (int i = 0; i < arr.length; i++){
			max = 0; min = 65535;			
			for (int j = 0; j < arr[i].length; j++){
				if (j % 2 == 0){
					if (max < arr[i][j])
						max = arr[i][j];
				}else{
					if (min > arr[i][j])
						min = arr[i][j];
				}
			}
			smin += min;
			smax += max;
		}
		System.out.println("Сума найбільших елементів: "+smax+"\nСума найменших елементів: "+smin);
	}
	public static int checkscan (String line){
		// Сканує число int, якщо воно менше 1000 - повертає його, повторює запит на ввід або пропонує вийти з програми
		System.out.print(line);
		Scanner scanner = new Scanner(System.in);
		while (true){
			if (scanner.hasNextInt()){
				int a = scanner.nextInt();
				if (a < 1000){
					return a;
				} else{
					System.out.println("Значення надто велике");
				}
			} else{
				if (scanner.nextLine().equals("end")){
					System.exit(0);
				} else{
					System.out.println("Ви ввели неправильні данні. Для виходу з програми введіть end");
				}
			}		
		}
	}
	public static void main(String[] args){
		/*
			Варіант - 8111;
			Тип елементів - char;
			Дія - транспонування;
			Завдання - Обчислити суму найбільших елементів в рядках матриці з парними номерами та найменших елементів в рядках матриці з непарними номерами;
		*/
		int a, d;
		//a = 2; d = 6;
		a = checkscan("Введіть кількість рядків матриці: ");		
		d = checkscan("Введіть кількість стовпців матриці: ");
		//char [][] b = {{100, 990, 74, 200, 67, 49}, {120, 93, 27, 59, 179, 140}};
		char [][] b = new char [a][d];
		char [][] c = new char[d][a];
		Random rand = new Random();		
		for (int i = 0; i < a; i++){
			for (int j = 0; j < d; j++){
				b[i][j] = (char)rand.nextInt(65535);
				c[j][i] = b[i][j];
			}
		}
		matrint(b, "Матриця B:\n");
		sumel(b);
		matrint(c, "\nМатриця С:\n");		
		sumel(c);
	}
}
