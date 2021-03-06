/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygamefinal;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author antho
 */
public class MemoryGameFrame extends javax.swing.JFrame {
    
    int amountSelected;
    int winning;
    int count = 500;
    public static int userScore;
    boolean match;
    boolean selected, j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18;
    
    public static StackInterface<Integer> int1 = new LinkedStack();
    public static BagInterface<Integer> b1 = (BagInterface<Integer>) new LinkedBag();

    /**
     * Creates new form MemoryGameFrame
     */
    public MemoryGameFrame() {
        initComponents();
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask()
                
        {
            public void run()
            {
                if(count > 0)
                {
                    count --;
                    jLabel2.setText(Integer.toString(count));    
                }
                if(count ==0)
                {
                    timer.cancel();
                    new highScore().setVisible(true);
                    
                }
            }
        };timer.scheduleAtFixedRate(task, 0, 100);
    }
    
    public void reset()
    {
        if (!b1.contains(1))
        {
            one.setText("  ");
            oneMatch.setText("  "); 
        }
        if (!b1.contains(2))
        { 
            two.setText("  ");
            twoMatch.setText("  ");
        }
        if (!b1.contains(3))
        {
            three.setText("  ");
            threeMatch.setText("  "); 
        }
        if (!b1.contains(4))
        {
            four.setText("  ");
            fourMatch.setText("  ");  
        }
        if (!b1.contains(5))
        {
            five.setText("  ");
            fiveMatch.setText("  ");  
        }
        if (!b1.contains(6))
        {
            six.setText("  ");
            sixMatch.setText("  ");  
        }
        if (!b1.contains(7))
        {
            seven.setText("  ");
            sevenMatch.setText("  ");   
        }
        if (!b1.contains(8))
        {
            eight.setText("  ");
            eightMatch.setText("  ");  
        }
        if (!b1.contains(9))
        {
            nine.setText("  ");
            nineMatch.setText("  ");  
        }
    }    
    
    public void win(int winning)
    {
        if (winning == 9)
        {
            new highScore().setVisible(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        oneMatch = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        four = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        fourMatch = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        seven = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        sevenMatch = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        two = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        twoMatch = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        five = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        fiveMatch = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        eight = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        eightMatch = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        three = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        threeMatch = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        six = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        sixMatch = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        nineMatch = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        nine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 800));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new java.awt.GridLayout(3, 6, 3, 3));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPanel3.setName(""); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        one.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel3.add(one, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        oneMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        oneMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneMatchActionPerformed(evt);
            }
        });
        jPanel4.add(oneMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new java.awt.BorderLayout());

        four.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel5.add(four, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(new java.awt.BorderLayout());

        fourMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        fourMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourMatchActionPerformed(evt);
            }
        });
        jPanel6.add(fourMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new java.awt.BorderLayout());

        seven.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel7.add(seven, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setLayout(new java.awt.BorderLayout());

        sevenMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        sevenMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenMatchActionPerformed(evt);
            }
        });
        jPanel10.add(sevenMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setLayout(new java.awt.BorderLayout());

        two.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel8.add(two, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new java.awt.BorderLayout());

        twoMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        twoMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoMatchActionPerformed(evt);
            }
        });
        jPanel9.add(twoMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setLayout(new java.awt.BorderLayout());

        five.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel11.add(five, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.setLayout(new java.awt.BorderLayout());

        fiveMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        fiveMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveMatchActionPerformed(evt);
            }
        });
        jPanel12.add(fiveMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setLayout(new java.awt.BorderLayout());

        eight.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel13.add(eight, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setLayout(new java.awt.BorderLayout());

        eightMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        eightMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightMatchActionPerformed(evt);
            }
        });
        jPanel14.add(eightMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setLayout(new java.awt.BorderLayout());

        three.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel15.add(three, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));
        jPanel16.setLayout(new java.awt.BorderLayout());

        threeMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        threeMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeMatchActionPerformed(evt);
            }
        });
        jPanel16.add(threeMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));
        jPanel17.setLayout(new java.awt.BorderLayout());

        six.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel17.add(six, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(102, 102, 102));
        jPanel18.setLayout(new java.awt.BorderLayout());

        sixMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        sixMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixMatchActionPerformed(evt);
            }
        });
        jPanel18.add(sixMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(102, 102, 102));
        jPanel19.setLayout(new java.awt.BorderLayout());

        nineMatch.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        nineMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineMatchActionPerformed(evt);
            }
        });
        jPanel19.add(nineMatch, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(102, 102, 102));
        jPanel20.setLayout(new java.awt.BorderLayout());

        nine.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel20.add(nine, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        selected = true;
        if(selected)
        {
            amountSelected++;
            one.setText("1");
            int1.push(1);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                    one.setVisible(false);
                    oneMatch.setVisible(false);
                    b1.add(1);
                    winning++;
                    win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
            
        }    
    }//GEN-LAST:event_oneActionPerformed

    private void oneMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneMatchActionPerformed
        selected = true;
        if (selected)
        {
            amountSelected++;
            oneMatch.setText("1");
            int1.push(1);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                    one.setVisible(false);
                    oneMatch.setVisible(false);
                    b1.add(1);
                    winning++;
                    win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
                
            }
        }
    }//GEN-LAST:event_oneMatchActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            two.setText("2");
            int1.push(2);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                two.setVisible(false);
                twoMatch.setVisible(false);
                b1.add(2);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        }  
    }//GEN-LAST:event_twoActionPerformed

    private void twoMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            twoMatch.setText("2");
            int1.push(2);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                two.setVisible(false);
                twoMatch.setVisible(false);
                b1.add(2);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        }  
    }//GEN-LAST:event_twoMatchActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            three.setText("3");
            int1.push(3);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                three.setVisible(false);
                threeMatch.setVisible(false);
                b1.add(3);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_threeActionPerformed

    private void threeMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            threeMatch.setText("3");
            int1.push(3);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                three.setVisible(false);
                threeMatch.setVisible(false);
                b1.add(3);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_threeMatchActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            four.setText("4");
            int1.push(4);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                four.setVisible(false);
                fourMatch.setVisible(false);
                b1.add(4);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_fourActionPerformed

    private void fourMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            fourMatch.setText("4");
            int1.push(4);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                four.setVisible(false);
                fourMatch.setVisible(false);
                b1.add(4);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_fourMatchActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            five.setText("5");
            int1.push(5);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                five.setVisible(false);
                fiveMatch.setVisible(false);
                b1.add(5);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_fiveActionPerformed

    private void fiveMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            fiveMatch.setText("5");
            int1.push(5);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                five.setVisible(false);
                fiveMatch.setVisible(false);
                b1.add(5);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_fiveMatchActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            six.setText("6");
            int1.push(6);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                six.setVisible(false);
                sixMatch.setVisible(false);
                b1.add(6);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_sixActionPerformed

    private void sixMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            sixMatch.setText("6");
            int1.push(6);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                six.setVisible(false);
                sixMatch.setVisible(false);
                b1.add(6);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_sixMatchActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            seven.setText("7");
            int1.push(7);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                seven.setVisible(false);
                sevenMatch.setVisible(false);
                b1.add(7);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_sevenActionPerformed

    private void sevenMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            sevenMatch.setText("7");
            int1.push(7);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                seven.setVisible(false);
                sevenMatch.setVisible(false);
                b1.add(7);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_sevenMatchActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            eight.setText("8");
            int1.push(8);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                eight.setVisible(false);
                eightMatch.setVisible(false);
                b1.add(8);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_eightActionPerformed

    private void eightMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            eightMatch.setText("8");
            int1.push(8);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                eight.setVisible(false);
                eightMatch.setVisible(false);
                b1.add(8);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_eightMatchActionPerformed

    private void nineMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineMatchActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            nineMatch.setText("9");
            int1.push(9);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                nine.setVisible(false);
                nineMatch.setVisible(false);
                b1.add(9);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_nineMatchActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        selected = true;
        if(selected)
        {
            amountSelected++;
            nine.setText("9");
            int1.push(9);
        
            if(amountSelected == 2)
            {
                match = Selected.isMatched(int1.pop(), int1.pop());
                if(match)
                {
                nine.setVisible(false);
                nineMatch.setVisible(false);
                b1.add(9);
                winning++;
                win(winning);
                }
                else
                {
                    reset();
                }
                
                amountSelected = 0;
            }
        } 
    }//GEN-LAST:event_nineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemoryGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eight;
    private javax.swing.JButton eightMatch;
    private javax.swing.JButton five;
    private javax.swing.JButton fiveMatch;
    private javax.swing.JButton four;
    private javax.swing.JButton fourMatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton nine;
    private javax.swing.JButton nineMatch;
    private javax.swing.JButton one;
    private javax.swing.JButton oneMatch;
    private javax.swing.JButton seven;
    private javax.swing.JButton sevenMatch;
    private javax.swing.JButton six;
    private javax.swing.JButton sixMatch;
    private javax.swing.JButton three;
    private javax.swing.JButton threeMatch;
    private javax.swing.JButton two;
    private javax.swing.JButton twoMatch;
    // End of variables declaration//GEN-END:variables
}
