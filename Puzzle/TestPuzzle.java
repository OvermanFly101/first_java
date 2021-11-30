import java.util.Arrays;
public class TestPuzzle {
    
	public static void main(String[] args) {
		Puzzle generator = new Puzzle();

    //----Ten Rolls----
		//ArrayList<Integer> randomRolls = generator.getTenRolls(roll);
		generator.getTenRolls();
		System.out.println("Random Letter: " + generator.getRandomLetter());
		System.out.println("Password Generator: " + generator.generatePassword());
		System.out.println("Password Generator: " + generator.generateNewPasswordSet(3));
    	//..
		// Write your other test cases here.
		//..
	}
}
