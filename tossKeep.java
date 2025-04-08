public class Lab11Prob01 {
	public static void main(String[] args) {
	
		//Make the treasure chests with weight being on the left and amount worth on the right 
		int[][] pirateBooty = { { 110, 1600 }, { 101, 1400 }, { 200, 50 }, { 322, 700 }, { 57, 500 }, { 625, 1500 },
				{ 300, 320 }, { 50, 210 }, { 100, 105 }, { 90, 400 }, { 30, 2000 }, { 200, 1300 }, };

		String[] overboard = new String[pirateBooty.length];
		
		//make for loop to go through the length of the array and toss anything that weighs more than 100lbs or has value less than $1500
		for (int i = 0; i < overboard.length; i++) {

			if (pirateBooty[i][0] > 100 && pirateBooty[i][1] < 1500) {
				overboard[i] = "toss";
			} else {
				overboard[i] = "keep";
			}
			
			//Print out final result
			System.out.printf("Cargo %2d: %s\n", i + 1, overboard[i]);
		}
	}

}
