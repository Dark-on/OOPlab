import java.util.Random;
import java.util.Comparator;
import java.util.Arrays;


class SeaBoat{

  private String name;
  private int price;
  private int weight;
  private int age;
  private int numberOfPassangers;

  SeaBoat(int weight, int price, int age, int numberOfPassangers, String name){
    this.name = name;
    this.weight = weight;
    this.price = price;
    this.age = age;
    this.numberOfPassangers = numberOfPassangers;
  }

  public String getName(){
    return name;
  }

  public int getPrice(){
    return price;
  }

  public int getWeight(){
    return weight;
  }

  public int getAge(){
    return age;
  }

  public int getNumberOfPassangers(){
    return numberOfPassangers;
  }

}//SeeBoat

public class Lab4{
  public static void main(String[] args){

    String [] names = {"Clementina", "Ayvasovskiy", "Titanic", "Bismark", "Victoria"};
    SeaBoat [] array = new SeaBoat[5];
    Random rand = new Random();
    
    for (int i = 0; i < array.length; i++){
      array[i] = new SeaBoat(rand.nextInt(1000)+200, rand.nextInt(3000)+1000, rand.nextInt(50)+1, rand.nextInt(900)+10, names[i]);
    }
    Arrays.sort(array, Comparator.comparing(SeaBoat::getPrice));
	
	for (int i = 0; i < array.length; i++){
      System.out.println("##########\nName - " + array[i].getName());
      System.out.println("Age - " + array[i].getAge());
      System.out.println("Weight - " + array[i].getWeight());
      System.out.println("Number of Passangers - " + array[i].getNumberOfPassangers());
      System.out.println("Price - " + array[i].getPrice() + "\n");
    }

	System.out.println("REVERSE\n");

  Arrays.sort(array, Comparator.comparing(SeaBoat::getAge).reversed());

  for (int i = 0; i < array.length; i++){
      System.out.println("##########\nName - " + array[i].getName());
      System.out.println("Age - " + array[i].getAge());
      System.out.println("Weight - " + array[i].getWeight());
      System.out.println("Number of Passangers - " + array[i].getNumberOfPassangers());
      System.out.println("Price - " + array[i].getPrice() + "\n");
    }
  }//main()
}//Main class

/*Визначити клас морський човен, який складається як мінімум з 5-и полів.
Створити клас із виконавчим методом, в якому створити масив з об’єктів класу визначеному варіантом. 
Відсортувати масив, за одним з полів, за зростанням, а за іншим, за спаданням використавши при цьому стандартні засоби сортування. 
Всі змінні повинні бути описані та значення їх задані у виконавчому методі.*/
