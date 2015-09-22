package Flavious;
//define a CircularList class
class CircularList {
	//lets define our variables
	private Node first;
    private Node last;
    private Node current;
    private int count; // total items in the list
	public CircularList getCurrent;

	//define a constructor method for the CircularList class
	public CircularList() {
        first = null;
        last = null;
        current = null;
        count = 0;
    }
	//lets now define our method
	public boolean isEmpty() {
        return first == null;
    }

    public void step() {
        current = current.next;
    }

    public Node getCurrent() {
        return current;
    }

    public Node getFirst() {
        return first;
    }


}
