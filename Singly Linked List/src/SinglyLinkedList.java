
public class SinglyLinkedList {
	public Node head;
    public SinglyLinkedList() {
        head = null;
    }
    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
	public void remove() {
		if(head != null) {
			Node previous = head;
			Node runner = head.next;
			while(runner.next != null) {
				//System.out.println(runner.value);
				runner = runner.next;
				previous = previous.next;
			}
			previous.next = null;
			
		}
		
	}
	public void printValues() {
		if(head != null) {
			 Node runner = head;
	            while(runner != null) {
	            	System.out.println(runner.value);
	                runner = runner.next;
	            }
	          
		}
		
	}    
}
