import java.util.Scanner;

public class DrunkApp {
    public static void main(String[] args) {
        MyQueue q1 = new MyQueue(5), q2 = new MyQueue(5);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            q1.offer(in.nextInt());
        for (int i = 0; i < 5; i++)
            q2.offer(in.nextInt());
        int i = 0;
        while (!q1.empty() && !q2.empty() && i < 1000 * 1000)
        {
            int c1 = q1.poll();
            int c2 = q2.poll();
            if (c1 > c2 && !(c2 == 0 && c1 == 9) || (c1 == 0 && c2 == 9))
            {
                q1.offer(c1);
                q1.offer(c2);
            }
            else
            {
                q2.offer(c1);
                q2.offer(c2);
            }
            i++;
        }
        if (q1.empty()) System.out.print("second " + i);
        else if (q2.empty()) System.out.print("first " + i);
        else System.out.print("botva");
    }
}

class MyQueue{
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;
    MyQueue(int s)
    {
        maxSize= s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems= 0;
    }
    public void offer(int v)
    {
        if(rear == maxSize-1)
            rear = -1;
        rear++;
        queArray[rear] = v;
        nItems++;
    }
    public int poll()
    {
        int temp = queArray[front];
        front++;
        if(front== maxSize)
            front= 0;
        nItems--;
        return temp;
    }
    public boolean empty()
    {
        if (nItems == 0)
            return true;
        return false;
    }
    public boolean isFull()
    {
        if (nItems==maxSize)
            return true;
        return false;
    }
}