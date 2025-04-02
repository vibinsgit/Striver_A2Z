Collection in Java : 

Interfaces: 
    Set, List, Queue, Deque

Classes:
    ArrayList, Vector, LinkedList, PriorityQueue
    HashSet, LinkedHashSet, TreeSet

List Interface: 
    List interface is the child interface of Collection interface.
    Can store the ordered collection of objects.
    It can have duplicate values.

    List <data-type> list1 = new ArrayList();  
    List <data-type> list2 = new LinkedList();  
    List <data-type> list3 = new Vector();  
    List <data-type> list4 = new Stack(); 

1. ArrayList : 
    The ArrayList class implements the List interface.
    It uses a dynamic array to store the duplicate element of different data types.
    The ArrayList class maintains the insertion order and is non-synchronized.
    The elements stored in the ArrayList class can be randomly accessed.

2. LinkedList :
    LinkedList implements the Collection interface.
    It uses a doubly linked list internally to store the elements. 
    It can store the duplicate elements.
    It maintains the insertion order and is not synchronized.
    In LinkedList, the manipulation is fast because no shifting is required. 

3. Vector :
    Vector uses a dynamic array to store the data elements.
    It is similar to ArrayList.
    It is synchronized.
    Contains many methods that are not the part of Collection framework.

4. Stack :
    The stack is the subclass of Vector.
    It implements the last-in-first-out data structure.
    The stack contains all of the methods of Vector class.
    Also it its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.