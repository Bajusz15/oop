package mypersons.persontest;
import java.util.Scanner;

import mypersons.Adult;
import mypersons.Child;
import mypersons.Person;
public class Running {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1;
		Person person2;
		
		String name;
		int age;
		Scanner input= new Scanner(System.in);
		System.out.println("name: ");
		name = input.nextLine();
		System.out.println("age: ");
		age = input.nextInt(); input.nextLine();
		
		input.close();
		if(age>18){
			System.out.println("Munkahely: ");
			String munkahely = input.nextLine();
			person1 = new Adult(name, age, munkahely);
		} else{
			System.out.println("iskola: ");
			String iskola = input.nextLine();
			person1 = new Child(name, age, iskola);
		}
		System.out.println(person1);
		System.out.println(person1.getclass());
		System.out.println(person1 instanceof Person);
		System.out.println(person1 instanceof Child);
		System.out.println(person1 instanceof Adult);
		
		input.close();
	}

}
