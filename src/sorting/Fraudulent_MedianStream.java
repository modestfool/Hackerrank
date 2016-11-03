package sorting;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 26,Oct,2016 at 1:53 PM.
 */
/*
    HackerLand National Bank has a simple policy for warning clients about possible fraudulent account activity. If the amount spent by a client on a particular day is greater than or equal to  the client's median spending for the last  days, they send the client a notification about potential fraud. The bank doesn't send the client any notifications until they have at least  prior days of transaction data.

Given the value of  and a client's total daily expenditures for a period of  days, find and print the number of times the client will receive a notification over all  days.

Note: The median of a list of numbers can be found by arranging all the numbers from smallest to greatest. If there is an odd number of numbers, the middle one is picked. If there is an even number of numbers, median is then defined to be the average of the two middle values. (Wikipedia)

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of days there is transaction data for) and  (the number of prior days the bank uses to calculate median spending).
The second line contains  space-separated non-negative integers where each integer  denotes (i.e., the client's total  for day ).

Constraints

Output Format

Print an integer denoting the total number of times the client receives a notification over a period of  days.

Sample Input 0

 */
public class Fraudulent_MedianStream
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int count = 0;
        Comparator<Integer> reverseInt = new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2){
                return i2-i1;
            }
        };
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(reverseInt);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            int curr = in.nextInt();
            arr[i] = curr;
            double currMedian = findMedian(minHeap,maxHeap);
            if ((( minHeap.size()+ maxHeap.size())>=d) && curr
                >= 2*currMedian) {
                count++;
            }
            insertInto(minHeap,maxHeap,curr,currMedian);
            if (i >= d)
            {
                if (arr[i - d] <= maxHeap.peek()) {
                    maxHeap.remove(arr[i - d]);
                } else {
                    minHeap.remove(arr[i - d]);
                }
            }
        }
        System.out.println(count);
    }

    private static void insertInto(PriorityQueue<Integer> minHeap,
                                   PriorityQueue<Integer> maxHeap, int curr, double currMedian) {
        if(maxHeap.isEmpty() || curr < currMedian)
            maxHeap.offer(curr);
        else
            minHeap.offer(curr);

        if (minHeap.size() > maxHeap.size())
        {
            maxHeap.offer(minHeap.poll());
        }
        else if (maxHeap.size() - minHeap.size() > 1)
        {
            minHeap.offer(maxHeap.poll());
        }
    }

    public static double findMedian(PriorityQueue<Integer> minHeap,
                                 PriorityQueue<Integer> maxHeap)
    {
        if(maxHeap.isEmpty() && minHeap.isEmpty())
        {
            return -1.0;
        }
        if (maxHeap.size() > minHeap.size())
            return maxHeap.peek();
        else
            return (maxHeap.peek() + minHeap.peek())/2.0;
    }
}
