package Flavious;
//define a Test class to test our program
class Test {
	//lets define our main method to test our program
	public static void main(String[] args) {
		//lets instantiate a Josephus object
		Josephus suicide = new Josephus();

		suicide.setNumOfPeople(8);
        suicide.addPeople();
        suicide.display();

		//set the rules and begin execution
		suicide.setCountNum(3);
        suicide.execute();
	}
}
