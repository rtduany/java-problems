package Flavious;
//define a Josephus class
class Node {
	//lets declare our variables
    int iData;
    Node next;

	public Node(int x) {
        iData = x;
    }
	//define a displayNode method
    public void displayNode() {
        System.out.print(iData + " ");

    }
}
