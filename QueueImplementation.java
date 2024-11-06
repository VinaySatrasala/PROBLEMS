class queue{
    int frount;
    int rear;
    int capacity;
    int[] qarr;


    queue(int capacity){
        frount = -1;
        rear = -1;
        this.capacity = capacity;
        qarr = new int[capacity];
    }

    boolean isEmpty(){
        return (rear == -1 && frount == -1) ?true:false;
    }

    boolean isFull(){
        return rear == capacity - 1 ?true : false;
    }

    void enQueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(frount == -1){
                frount = 0;
            }
            qarr[++rear] = x;
        }
    }


    void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Removerd Element "+qarr[frount]);
            frount++;
            if(frount >= rear){
                frount = -1;
                rear = -1;
            }
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.print("Queue elements are : ");
            for (int i = frount;i<=rear;i++) {
                System.out.print(qarr[i]+" ");
            }
        }
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enQueue(0);
        q.enQueue(1);
        // q.deQueue();
        // q.deQueue();
        q.deQueue();

        q.display();
    }
}
