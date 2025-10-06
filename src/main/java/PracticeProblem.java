public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int find(int[] givenArr, int givenNumber) {
		int index = 0;
		while (index < givenArr.length) {
			if (givenArr[index] == givenNumber) {
				return index;
			}
			index++;
		}
		return -1;
	}
	public static int findLast(String[] givenArr, String givenString) {
		int indexLast = givenArr.length - 1;
		while (indexLast > -1) {
			if (givenString.equals(givenArr[indexLast])) {
				return indexLast;
			}
			indexLast--;
		}
		return -1;
	}
	public static int findSecond(char[] givenArr, char character){
		int index = 0;
		int counter = 0;
		while (index < givenArr.length) {
			if (givenArr[index] == character) {
				counter++;
				if (counter == 2) {
					return index;
				}
				if (counter == 1 && index == givenArr.length - 1) {
					return index;
				}
			}
			index++;
		}
		return -1;
	}

	

}
