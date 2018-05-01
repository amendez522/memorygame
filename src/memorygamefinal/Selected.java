/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygamefinal;

import static memorygamefinal.MemoryGameFrame.int1;

/**
 *
 * @author antho
 */
public class Selected 
{
    static boolean match;
    
    
    
    
    private static String first;
    private static String second;
    /**
     *
     * @return 
     */
    /*public static void twoSelected()
    {
        first = str1.pop();
        second = str1.pop();
        if(first.equals(second))
        {
            MemoryGameFrame.correct();
        }
        else
        {
            MemoryGameFrame.reset();
        }
        
       
    }*/
    
    
    
    public static boolean isMatched(int first, int second)
    {
        match = false;
        if(first == second)
        {
            match = true;
        }
       
        return match;
    }
    
    
    
    
}
