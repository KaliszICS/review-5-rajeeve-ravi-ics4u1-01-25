import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num1 = input.nextDouble();
        System.out.print(Math.abs(num1) + "\n");
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num2a = input.nextDouble();
        System.out.print("Input another number: ");
        double num2b = input.nextDouble();
        double division = num2a / num2b;
        System.out.print(Math.floor(division) + "\n");
        System.out.print(Math.ceil(division) + "\n");
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num3 = input.nextDouble();
        System.out.print(Math.round(Math.sqrt(num3)) + "\n");
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num4a = input.nextDouble();
        System.out.print("Input another number: ");
        double num4b = input.nextDouble();
        System.out.print(Math.pow(num4a, num4b) + "\n");
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num5a = input.nextDouble();
        System.out.print("Input another number: ");
        double num5b = input.nextDouble();
        System.out.print("Input one more number: ");
        double num5c = input.nextDouble();
        System.out.print(Math.max(num5a, Math.max(num5b, num5c)) + "\n");
        System.out.print(Math.min(num5a, Math.min(num5b, num5c)) + "\n");
	}
	public static void q6() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence6 = input.nextLine();
        System.out.print(sentence6.contains("on") + "\n");
	}
	public static void q7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the word mango: ");
        String word7 = input.nextLine();
        System.out.print(word7.equalsIgnoreCase("mango") + "\n");
	}
	public static void q8() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word8 = input.nextLine();
        System.out.print("Input a letter: ");
        String letter8 = input.nextLine();
        System.out.print(word8.indexOf(letter8) + "\n");
        System.out.print(word8.lastIndexOf(letter8) + "\n");
	}

	public static void q9() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence9 = input.nextLine();
        System.out.print("Your sentence is " + sentence9.length() + " characters long" + "\n");
	}
	public static void q10() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence10 = input.nextLine();
        System.out.print("Input a word to replace: ");
        String oldWord = input.nextLine();
        System.out.print("What word would you like to replace it with: ");
        String newWord = input.nextLine();
        System.out.print(sentence10.replace(oldWord, newWord) + "\n");
	}

	public static void q11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence11 = input.nextLine();
        System.out.print(sentence11.trim().toUpperCase() + "\n");
        System.out.print(sentence11.trim().toLowerCase() + "\n");
	}

	public static void q12() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word12 = input.nextLine();
        System.out.print(word12.substring(0, 4) + "\n");
        System.out.print(word12.substring(word12.length() - 4) + "\n");
	}
	

}
