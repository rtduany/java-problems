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
	//lets now define some setter and getter methods for Josephus class
	public void setNumOfPeople(int x) {
        numOfPeople = x;
	}
    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setCountNum(int x) {
        countNum = x;
    }

    public int getCountNum() {
        return countNum;
    }
	public void addPeople() {
        for (int i = 1; i < numOfPeople; i++) {
            circle.insert(i);
        }
    }
	public void move() {

        for (int i = 0; i < countNum; i++) {
            tail = head;
            head = head.next;
        }

        System.out.println("KILLED : " + head.iData);

    }
}
