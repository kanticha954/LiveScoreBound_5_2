/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author ASUS
 */
public class Subscriber1 implements PropertyChangeListener  {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.print("Thai " +
                evt.getNewValue()+"-");
        }
 
    }
    

