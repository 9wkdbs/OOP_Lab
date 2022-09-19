
public class ConcatTester {

	public static void main(String[] args) {
		
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		String Sentence = article.concat(" ").concat(animal1).concat(action).concat(animal2);
		System.out.println(Sentence);
	}

}

