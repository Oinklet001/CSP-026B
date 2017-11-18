import java.util.*;

class Node{

	int element;
	Node left, right;
	public int data;

	Node(int val){
		element = val;
		left = null;
		right = null;
	}

	Node(int val, Node leftChild, Node rightChild){

		element = val;
		left = leftChild;
		right = rightChild;

	}
	
			
	}
	 





public class BinarySearchTreeDemoTurnIn {

	static Node root;
	
	Node arrayToBinary(int array[], int s, int last){
		
		if(s>last)
			return null;
		//Gtes the middle of the Array
		int middle = (s+last)/2;
			
			Node node = new Node(array[middle]);

			//Node node = new Node [array.length/2];
			
			node.left = arrayToBinary(array,s,middle-1);
			node.right = arrayToBinary(array,middle+1,last);
			
			return node;
		
	}
	//-----------------------------------------------------------------------------
	static void inOrder(Node node){
		
	
		Stack<Node> stack1 = new Stack<Node>();

		
	 
		while (!false) {
			// Go to the left extreme insert all the elements to stack
			while (node != null) {
				
				//Pushes the node to the stack
				stack1.push(node);
				//It pushes the node to the left
				node = node.left;
			}
			//returns if stack is empty.
			if (stack1.isEmpty()) {
				return;
			}
            //pops what's in the stack
			node =stack1.pop();
			System.out.print(node.element + " ");
			//Moves the node to the right.
			node = node.right;
			
			
		}
		
	}
	//-----------------------------------------------------------------------------
	  

  static void adding(Node tempNode, int element)
    {
        Queue<Node> helpTemp = new LinkedList<Node>();
        helpTemp.add(tempNode);
      
 
        while (!helpTemp.isEmpty()) {
        	tempNode = helpTemp.peek();
        	helpTemp.remove();
      
            if (tempNode.left == null) {
            	tempNode.left = new Node(element);
                break;
            } else
            	helpTemp.add(tempNode.left);
      
            if (tempNode.right == null) {
            	tempNode.right = new Node(element);
                break;
            } else
            	helpTemp.add(tempNode.right);
        }
    }
/**	Node insert(int data, Node node){
		Node nodeA = new Node(data);
		if(node == null){
			
			return nodeA;
			
			
		}
		
		Node parent = null, current = root;
		
		while(current != null){
			parent = current;
			
			if(current.data <= data){
				
				current = current.right;
			}
			else{
				current = current.left;
			}
			
		}
		if(parent.data<= data){
			parent.right =nodeA;
			
			
		}
		else{
			parent.left = nodeA;
		}
		return nodeA;
		
		
	}**/
  

public Node delete(int disap){
	Node node = root;
	Node current = root;
	
	if(current.left==null && current.right==null){
		if(current==root){
			root = null;
		}
		node.right = null;
	}
	return node;
	}

  
  
	
	public static void main(String[] args) {
		
		BinarySearchTreeDemoTurnIn base = new BinarySearchTreeDemoTurnIn();
		
		
		int[] array = new int[5];
		array[0] = 33;
		array[1] = 55;
		array[2] = 75;
		array[3] = 32;
		array[4] = 8;

		
		for (int i = 0; i < array.length; i++)
		
		Arrays.sort(array);
		System.out.println("Here is the sorted Array:");
		System.out.println(Arrays.toString(array));
	
		int lengthArray = array.length;
		
		
		
		root = base.arrayToBinary(array,0,lengthArray-1);
		
	//	int data = 6;
	//	root = tree.insert(data, root);
	//-------------------------------------------------	
		System.out.println("Here is the in order:");
		
		base.inOrder(base.root);
        int element = 12;
        adding(root, element);
  
        System.out.println("");
        System.out.println("Here is the in order  after insertion:");
        inOrder(root);
      //----------------------------------------------------  
        System.out.println("");
        int disap = 12;
        System.out.println("Here is the in order  after deletion:"  );		
        base.delete(disap);

	}

}
