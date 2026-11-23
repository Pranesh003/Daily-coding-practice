class Node{
    Node prev, next;
    int key,value;

    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}

class LRUCache {
    HashMap<Integer,Node>map;
    int capacity=0;
    Node head, tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();

        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
    }

    public void remove(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }

    public void insert(Node node){
        node.next=head.next;
        node.prev=head;

        head.next.prev=node;
        head.next=node;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        return -1;

        Node node=map.get(key);
        remove(node);
        insert(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
        Node node =map.get(key);

        remove(node);
        node.value=value;
        insert(node);
        return;
        }
        if(map.size()==capacity){
            Node lru=tail.prev;
            remove(lru);

            map.remove(lru.key);
        }
        Node newNode= new Node(key,value);
        insert(newNode);
        map.put(key,newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */