public class CircularqueueUsingArray {
    static int arr[] = new int[5];
    static int front=-1;
    static int rear=-1;
    static int size=0;

    public static void Enqueue(int n){
        if(size == arr.length){
            // System.out.println("rear: "+rear);
            System.out.println("Queue Overflow");
            // System.out.println(".");
        }else if(front==-1 && rear==-1){
            front=0;rear=0;
            arr[rear]=n;
            size++;
            System.out.println("Enqued: "+n);
            // System.out.println("Enqued front: "+front);
            // System.out.println("Enqued rear: "+rear);
            // System.out.println("..");
        }else{
            rear=((rear+1)%arr.length);
            arr[rear]=n;
            size++;
            System.out.println("Enqued: "+n);
            // System.out.println("Enqued front: "+front);
            // System.out.println("Enqued rear: "+rear);
            // System.out.println("...");
        }
    }

    public static void Dequeue(){    // can also do front++ at the plece of element shifting
        if(size==0){
            System.out.println("Queue Underflow");
            return;
        }else{
            // System.out.println("front: "+front);
            System.out.println("dequeue: "+ arr[front]);
            front = ((front+1) % arr.length);         // front = (front % arr.length)+1; and front = ((front+1) % arr.length); are different
            size--;
            // System.out.println("dequeue front: "+front);
        }
    }

    public static boolean IsEmpty(){
        if(size == 0)return true;
        else return false;
    }
    
    public static int Size(){
        return size;
    }
    
    public static void Peek(){
        if(size==0)System.out.println("Empty Queue");
        else {System.out.println("Peek: "+arr[front]);}
        
    }

    public static void display(){
        // System.out.println("size: "+size);
        for(int i=0,j=front;i<size;i++){
            System.out.print(arr[j]+" ");
            j = ((j+1) % arr.length);
        }System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enqueue:");
        Enqueue(5);
        Enqueue(4);
        Enqueue(3);
        Enqueue(2);
        Enqueue(1);
        Enqueue(66);

        System.out.println("Display:");
        display();

        System.out.println("Dequeue:");
        Dequeue();
        Dequeue();
        Dequeue();
        Dequeue();

        System.out.println("Display:");
        display();
       
        // System.out.println("Enqueue:");
        Enqueue(6);

        System.out.println("Display:");
        display();
        
        System.out.println("\nisEmpty: "+IsEmpty());
        System.out.println("size: "+Size());

        Peek();
    }
}
