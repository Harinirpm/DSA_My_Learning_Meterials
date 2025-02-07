package dp;

public class Denomination {
	//greedy
	public static void minimumnotes (int amount) {
		int notes[] = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
		int[] change = new int[9];
		for(int i = 0;i<9;i++) {
			if(amount >= notes[i]) {
				change[i] = amount / notes[i];
				//remaining amount
				amount = amount % notes[i];
			}
		}
		// print the minimum notes
		for(int i = 0;i<change.length;i++) {
			if(change[i] != 0) {
				System.out.println(notes[i] + " "+ change[i]);
			}
		}
	}
	public static void main(String[] args) {
		int amount = 800;
		minimumnotes(amount);

	}

}
