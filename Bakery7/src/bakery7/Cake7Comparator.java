/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery7;

/**
 *
 * @author ryanhoyda
 */
import java.util.Comparator;

public class Cake7Comparator implements Comparator<Cake7> {

    public int compare(Cake7 e1,  Cake7 e2) {
        int result = e1.getType().toString().compareTo(e2.getType().toString());
        if (result != 0) {
            return result;
        } else {
            return e1.getName().compareTo(e2.getName());
        }
    }
        
    }
    
    

