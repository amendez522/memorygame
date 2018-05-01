/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygamefinal;

/**
 *
 * @author antho
 */
public class UserScores 
{

    
    private int memScore = 0;
    private int flapScore = 0;
    private int puzzScore = 0;
    private int highScore;
    private String username;
    
    UserScores(String username, int memScore, int puzzScore, int flapScore) 
    {
        this.username = username;
        this.memScore = memScore;
        this.flapScore = flapScore;
        this.puzzScore = puzzScore;
    }
    
    public void setMemScore(int score)
    {
        this.memScore = score;
    }
    
    public int getMemScore()
    {
        return memScore;
    }
    
    public void setFlapScore(int score)
    {
        this.flapScore = score;
    }
    
    public int getFlapScore()
    {
        return flapScore;
    }
    
    public void setPuzzScore(int score)
    {
        this.puzzScore = score;
    }
    
    public int getPuzzScore()
    {
        return puzzScore;
    }
    
    public int getHighScore()
    {
        highScore = getPuzzScore() + getFlapScore() + getMemScore();
        return highScore;
    }
}
