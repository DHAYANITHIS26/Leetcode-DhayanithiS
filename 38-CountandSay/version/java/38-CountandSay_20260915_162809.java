// Last updated: 15/09/2026, 16:28:09
1class RandomizedSet {
2private ArrayList<Integer> list;
3private Map<Integer, Integer>map;
4    public RandomizedSet() {
5        list = new ArrayList<>();
6        map = new HashMap<>();
7    }
8    
9    public boolean search(int val) {
10        return map.containsKey(val);
11        
12    }
13    public boolean insert(int val){
14        if(search(val))return false;
15        list.add(val);
16        map.put(val,list.size()-1);
17        return true;
18    }
19    
20    public boolean remove(int val) {
21        if(!search(val)) return false;
22        int index = map.get(val);
23        list.set(index,list.get(list.size()-1));
24        map.put(list.get(index),index);
25        list.remove(list.size()-1);
26        map.remove(val);
27        return true;
28    }
29    
30    public int getRandom() {
31        Random rand = new Random();
32        return list.get(rand.nextInt(list.size()));
33    }
34}
35