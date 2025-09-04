// Queue Implementation Using LinkedList

class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int data)
    {
       this.data = data;
       next = null;
    }
}  


class queueImplementation{
    QueueNode Front = null, Rear = null;
    int size = 0;

    public boolean Empty(){
        return Front == null;
    }

    public int Peek(){
        if(Empty())  
        {  System.out.println("Queue is Empty");
            return -1;
        } 
        else 
        return Front.data;
    }   

    public void Enqueue(int value){
        QueueNode Temp;
        Temp = new QueueNode(value); 
        if (Front == null){
            Front = Temp;
            Rear = Temp;
        } 
        else{
            Rear.next = Temp;
            Rear = Temp;
        }
        System.out.println(value+" Inserted into Queue ");
        size++; 
    }

    public void Dequeue(){
        if (Front == null) 
            System.out.println("Queue is Empty");
        else{ 
            System.out.println(Front.data+" Removed From Queue");
            Front = Front.next;
            size--;
        }  
    }  

    public static void main(String args[]){
        queueImplementation Q=new queueImplementation();
        Q.Enqueue(10);
        Q.Enqueue(20);
        Q.Enqueue(30);
        Q.Enqueue(40);
        Q.Enqueue(50);
        Q.Dequeue();
        System.out.println("The size of the Queue is "+Q.size);
        System.out.println("The Peek element of the Queue is "+Q.Peek());
    }
}  