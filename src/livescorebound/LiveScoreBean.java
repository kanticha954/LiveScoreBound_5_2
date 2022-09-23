/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebound;

import java.beans.*;
import java.io.Serializable;
import static javax.management.Query.value;

/**
 *
 * @author ASUS
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SCORELINE_PROPERTY = "scoreLine";
    
    private int scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getSampleProperty() {
        return scoreLine;
    }
    
    
    public void setScoreLine(int value) {
        int oldValue = scoreLine;
        scoreLine = value;
        propertySupport.firePropertyChange(SCORELINE_PROPERTY, oldValue, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    
    
}
