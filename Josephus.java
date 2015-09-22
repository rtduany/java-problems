package Flavious;
//define a Josephus class
class Josephus {
	//define our variables
	private int numOfPeople; // number of people in a circle
    private int countNum; // number used for counting off
    private Node head;
    private Node tail;
    CircularList circle;
	//define a constructor method for Josephus class
	public Josephus() {
        circle = new CircularList();
        numOfPeople = 0;
        countNum = 0;
    }
}
