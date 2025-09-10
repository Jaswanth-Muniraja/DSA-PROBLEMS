import java.util.HashMap;

class DLLNode{
    int key, val;
    DLLNode next, prev;
    DLLNode(int key, int val){
        this.key = key;
        this.val = val;
        next = prev = null;
    }
}

public class LRUcache {
    HashMap<Integer, DLLNode> map;
    DLLNode head, tail;
    int capacity;

    public LRUcache(int capacity) {
        map = new HashMap<>();
        head = new DLLNode(-1, -1);
        tail = new DLLNode(-1, -1);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }
    
    
    public int get(int key){
        if(map.containsKey(key)){
            DLLNode temp = map.get(key);
            delete(temp);
            insert(temp);
            return temp.val;
        }else{
            return -1;
        }
    }

    public void put(int key, int val){
        if(map.containsKey(key)){
            DLLNode temp = map.get(key);
            delete(temp);
            map.remove(key);
        }else if(map.size() == capacity){
            DLLNode temp = tail.prev;
            delete(temp);
            map.remove(temp.key);
        }
        DLLNode newNode = new DLLNode(key, val);
        insert(newNode);
        map.put(key, newNode);
    }

    public void delete(DLLNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(DLLNode node){
        DLLNode temp = head.next;
        head.next = node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;
    }

    public static void main(String[] args) {
        int capacity = 4;
        LRUcache lru = new LRUcache(capacity);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        System.out.println(lru.get(2));
        lru.put(4, 4);
        lru.put(5, 5);
        System.out.println(lru.get(1));
        lru.put(6,6);
        System.out.println(lru.get(3));
        lru.put(4,14);
        System.out.println(lru.get(4));
    }
}