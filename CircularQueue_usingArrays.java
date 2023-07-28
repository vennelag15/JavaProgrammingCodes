public class CircularQueue_usingArrays {
    public static class Queue{
        static int size;
        static int arr[];
        static int rear;
        static int front;
        public Queue(int n){
            size=n;
            arr=new int[n];
            rear=-1;
            front=-1;
        }
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
                    }
             //adding first element case
             if(front==-1){
                front=0;
             }       
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
        }
        int result=arr[front];
    //last element removing
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;}
        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String args[]){
        Queue q=new Queue(3);//5 is array size
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
            }
    
}
