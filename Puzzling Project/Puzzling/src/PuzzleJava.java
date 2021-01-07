import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class PuzzleJava {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(1);
		numbers.add(2);
		numbers.add(7);
		numbers.add(9);
		numbers.add(8);
		numbers.add(13);
		numbers.add(25);
		numbers.add(32);
		System.out.println("numbers greater than 10 are: " + greaterThan10(numbers));

		System.out.println(shuffleArray());
		alphabet();
		System.out.println("Random array 1 is " + randomTenNumbers());
		sortArray();
		System.out.println("random string "+randomString());
		System.out.println("Array of random strings: "+arrayOfRandomStrings());
		
	}

	public static ArrayList<Integer> greaterThan10(ArrayList<Integer> numbers) {
		int sum = 0;
		ArrayList<Integer> greaterThanTen = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);
			if (numbers.get(i) > 10) {
				greaterThanTen.add(numbers.get(i));
			}

		}
		System.out.println("The sum of array numbers is " + sum);
		return greaterThanTen;

	}

	public static ArrayList<String> shuffleArray() {
		ArrayList<String> names = new ArrayList<>();
		names.add("Nancy");
		names.add("Jinichi");
		names.add("Fujibayashi");
		names.add("Momochi");
		names.add("Ishikawa");
		Collections.shuffle(names);
		ArrayList<String> greaterThan5Chars = new ArrayList<>();
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			if (names.get(i).length() > 5) {
				greaterThan5Chars.add(names.get(i));
			}

		}
		return greaterThan5Chars;
	}

	public static void alphabet() {
		ArrayList<Character> alphabets = new ArrayList<>();
		alphabets.add('a');
		alphabets.add('b');
		alphabets.add('c');
		alphabets.add('d');
		alphabets.add('e');
		alphabets.add('f');
		alphabets.add('g');
		alphabets.add('h');
		alphabets.add('i');
		alphabets.add('j');
		alphabets.add('k');
		alphabets.add('l');
		alphabets.add('m');
		alphabets.add('n');
		alphabets.add('o');
		alphabets.add('p');
		alphabets.add('q');
		alphabets.add('r');
		alphabets.add('s');
		alphabets.add('t');
		alphabets.add('u');
		alphabets.add('v');
		alphabets.add('w');
		alphabets.add('x');
		alphabets.add('y');
		alphabets.add('z');

		System.out.println("Last letter is " + alphabets.get(alphabets.size() - 1));
		char first = alphabets.get(0);
		if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
			System.out.println("First letter is vowel!");
		} else {
			System.out.println("First letter" + alphabets.get(0));
		}

	}

	public static ArrayList<Integer> randomTenNumbers() {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		int counter = 0;

		while (counter < 10) {
			int number = random.nextInt(100);
			if (number >= 55) {
				numbers.add(number);
				counter++;
			}

		}

		return numbers;
	}

	public static void sortArray() {
		ArrayList<Integer> randomNumbers = randomTenNumbers();
		Collections.sort(randomNumbers);
		int min = randomNumbers.get(0);
		int max = randomNumbers.get(randomNumbers.size() - 1);
		System.out.println("Sorted Random array 2 is " + randomNumbers + "Min " + min + " Max " + max);
	}

	public static String randomString() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder generator = new StringBuilder();
        Random random = new Random();
        while (generator.length() < 5) {
            int index = (int) (random.nextFloat() * alphabet.length());
            generator.append(alphabet.charAt(index));
        }
        String saltStr = generator.toString();
        return saltStr;

    }
	
	public static ArrayList<String> arrayOfRandomStrings(){
		ArrayList<String> array = new ArrayList<>();
		for(int i=0;i<10;i++) {
			array.add(randomString());
		}
		return array;
	}
	

}
