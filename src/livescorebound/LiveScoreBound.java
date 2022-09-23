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
       
        Scanner sc = new Scanner(System.in);
        int thai;
        int uae;
       
        while(true){
            System.out.println("Enter score: ");
            thai = sc.nextInt();
            uae = sc.nextInt();
            
            if(uae == 0 && thai == 0){
                break;
            }

            liveScore.setScoreLine(thai);
            liveScore.setScoreLine(uae);
        }
    }
    
}
