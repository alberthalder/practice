package java_practice_june;

public class Animal {

	public static void main(String[] args) {
	}
	public char[] color;

		
	class Dog extends Animal {
		String color = "black";
		void printColor() {
			System.out.println(color);// prints black
			System.out.println(super.color);// prints white
			}
		}
		

	}


