

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
public interface StackInterface<T> 
{
    public void push(T newEntry);
    public void clear();
    public T peek();
    public boolean isEmpty();
    public T pop();
    
}
