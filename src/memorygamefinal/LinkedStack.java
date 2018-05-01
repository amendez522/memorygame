/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygamefinal;

/**
 *
 * @author Student
 * @param <T>
 */
public class LinkedStack<T> implements StackInterface<T>
{

    private Node topNode;
    
    
    public void push(T newEntry)
    {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
    }
            
    public void clear()
    {
        topNode = null;
    }
            
            
    public T peek()
    {
        T top = null;
        if( topNode != null)
            top = topNode.getData();
        
        return top;
    }
            
    public boolean isEmpty()
    {
        return topNode == null;
    }
            
    public T pop()
    {
        T top = peek();
        if (topNode != null)
            topNode = topNode.getNextNode();
        
        return top;
    }
    
    private class Node
    {
        private T    data; // Entry in bag
        private Node next; // Link to next node
        
        private Node(T dataPortion)
        {
            this(dataPortion, null);
        } // end constructor
        
        private Node(T dataPortion, Node nextNode)
        {
            data = dataPortion;
            next = nextNode;
        } // end constructor

        private Node getNextNode() 
        {
            return next;
        }
        
        private T getData()
        {
            return data;
        }
    } // end Node
}
