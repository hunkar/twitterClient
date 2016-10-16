/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittertimeline;

import twitter4j.TwitterException;

/**
 *
 * @author hackp
 */
public class TwitterTimeline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        // TODO code application logic here
        MainFrame frame = new MainFrame();
        frame.SetTwitter();
        frame.setVisible(true);
    }
    
}
