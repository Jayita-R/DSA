package jayita;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityCollectionTest {
    public static void main(String[] args) {
        ////what if we want top2 elements of bottom2?
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);
        //top two elements
        List<Integer> bottom2=new ArrayList<>();
        int index=0;
        while (!pq.isEmpty()){
            if(index==2)
                break;
            bottom2.add(pq.poll());
            index++;
        }

       //System.out.println(bottom2);
       // System.out.println(pq);
        //get me the top 3 students according to their maths marks

        List<StudentMarks> stMarks=new ArrayList<>();
        stMarks.add(new StudentMarks(70,80));
        stMarks.add(new StudentMarks(38,10));
        stMarks.add(new StudentMarks(100,38));
        stMarks.add(new StudentMarks(40,88));
        stMarks.add(new StudentMarks(93,60));

        PriorityQueue<StudentMarks> spq=new PriorityQueue<>((s1,s2)->{
            System.out.println("Comparator's compareTo method called");
            return s2.getPhys()-s1.getPhys();
        });

        for(StudentMarks sm:stMarks)
            spq.add(sm);

        List<StudentMarks> top3=new ArrayList<>();
        int ind=0;
        while (!spq.isEmpty()){
            if(ind==3)
                break;
            top3.add(spq.poll());
            ind++;
        }
        System.out.println(top3);


    }
}
