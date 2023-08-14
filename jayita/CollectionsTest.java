package jayita;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        //OurGenericList<Integer> list=new OurGenericList<>();
        List<Integer> alist=new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(2);

        /*Integer[] arr=alist.toArray(new Integer[0]);
        for(int x:arr)
            System.out.print(x+",");

        System.out.println();*/

        //System.out.println("element that got replaced = "+alist.set(1,100));

        /*List<Integer> alst2=new ArrayList<>();
        alst2.add(4);
        alst2.add(5);
        alst2.add(6);

        alst2.addAll(alist);*/
        //System.out.println(alist.lastIndexOf(2));

        //List<Integer> alst3=alst2.subList(1,4);
        //alst3.set(0,100);
        //System.out.println(alst3);

       /* Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());*/
        //System.out.println(alist);
        //System.out.println(alst2);
        //for(int x:list)
        //    System.out.println(x);

     /*   List<Integer> lk=new LinkedList<>();
        lk.add(1);
        lk.add(2);
        lk.add(3);

        ListIterator<Integer> iterator=lk.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());*/
        //FIFO queue
       /* Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }*/
/*
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(1);
        dq.offerLast(2);*/
        //System.out.println(dq);

        //dq.pollFirst();
        //dq.peekFirst();
        //System.out.println(dq.pollFirst());

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);
        //top two elements
        List<Integer> lst=new ArrayList<>();
        int index=0;
        while (!pq.isEmpty()){
            if(index==2)
                break;
            lst.add(pq.poll());
            index++;
        }
        //System.out.println(lst);
        //System.out.println(pq);

        List<StudentMarks> stMarks=new ArrayList<>();
        stMarks.add(new StudentMarks(70,80));
        stMarks.add(new StudentMarks(38,10));
        stMarks.add(new StudentMarks(100,38));
        stMarks.add(new StudentMarks(40,88));
        stMarks.add(new StudentMarks(93,60));

        Set<Integer> set1=new HashSet<>(alist);
        //System.out.println(set1.contains(1));
        //System.out.println(set1.contains(200));

        Set<Integer> set2=new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(2);
        set2.add(0);

        Set<StudentMarks> set3=new HashSet<>(stMarks);

        //System.out.println(set3.contains(new StudentMarks(70,80)));
        /*for(int x:set2)
            System.out.print(x+" ");
        System.out.println();*/
        //for(StudentMarks st:set3)
        //    System.out.print(st+" ");
        //set.remove(2);
        //set.clear();
        /*System.out.println(set1);
        System.out.println(set2);

        System.out.println("After retaining");
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);*/

        Set<StudentMarks> treeSet=new TreeSet<>((s1,s2)->s2.getPhys()-s1.getPhys());
        treeSet.add(new StudentMarks(70,80));
        treeSet.add(new StudentMarks(38,10));
        treeSet.add(new StudentMarks(100,38));
        treeSet.add(new StudentMarks(40,88));
        treeSet.add(new StudentMarks(93,60));

        //for(StudentMarks x:treeSet)
        //    System.out.print(x+",");

        NavigableSet<Integer> set5=new TreeSet<>();
        set5.add(8);
        set5.add(3);
        set5.add(1);
        set5.add(0);

        //for(int x:set5)
            //System.out.print(x+" ");
        //System.out.println();
        //System.out.println(set5.ceiling(2));
        Map<String,Integer> map=new HashMap<>();
        map.put("Jayita",1);
        map.put("Ishita",2);
        map.put("Sukla",6);
        map.remove("Ishita");

        System.out.println(map.getOrDefault("Tapas",0));
        System.out.println(map.getOrDefault("Ishita",2));

        System.out.println(map.containsKey("Ishita"));

        Map<Integer,List<Integer>> adj=new HashMap<>();
        //1-2 3-5 1-3

        /*
        if(adj.get(1)==null)
            adj.put(1,new ArrayList<>());
        adj.get(1).add(2);
         */

        //adj.computeIfAbsent(1,f->new ArrayList<>()).add(2);

        /*Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet)
            System.out.println(entry.getKey()+", "+entry.getValue());

        Set<String> keySets=map.keySet();
        for(String key:keySets)
            System.out.println(key+" "+map.get(key));*/

        NavigableMap<Integer,String> tmap=new TreeMap<>();
        tmap.put(1,"Jayita");
        tmap.put(2,"Ishita");
        tmap.put(7,"Raktim");

        //tmap.remove(1);

        //System.out.println(tmap);

        Set<Map.Entry<Integer,String>> entrySet=tmap.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet)
            System.out.println(entry.getKey()+", "+entry.getValue());

        //System.out.println(tmap.ceilingKey(3));

        Integer arr[]=new Integer[]{1,2,3,0,11,5,10,7};

        Arrays.sort(arr);

        //System.out.println(arr);

        //Collections.sort(arr,Collections.reverseOrder());

        List<Integer> list=Arrays.asList(arr);

        System.out.println(list);


    }
}
