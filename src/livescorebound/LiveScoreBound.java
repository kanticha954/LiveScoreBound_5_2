/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebound;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LiveScoreBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LiveScoreBean liveScore = new LiveScoreBean();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        liveScore.addPropertyChangeListener(sub1);
        liveScore.addPropertyChangeListener(sub2);
        
        System.out.println("Enter Score:");
        Scanner sc = new Scanner(System.in);
        String setScore = sc.nextLine();
        while(setScore!=null){
            if(setScore.equals(""))
               System.out.println("Enter Score:");
               liveScore.setScoreLine(setScore);
               liveScore.setScoreLine(setScore);
            if(sc.hasNextLine())
                setScore = sc.nextLine();
            
            else
                setScore = null;
               
            

        } 
    }
    
}
