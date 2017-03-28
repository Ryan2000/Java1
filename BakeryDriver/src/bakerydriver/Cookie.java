/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakerydriver;

/**
 *
 * @author ryanhoyda
 */
public class Cookie extends BakeryItem {

//    private int cookie;
//    private int bag;
//    
//    
//    public Cookie(String name, int count) {
//        super(name, count);
//    }
//    
//    public int getCookie() {
//        return cookie;
//    }
//
//    public void setCookie(int cookie) {
//        this.cookie = cookie;
//    }
//
//    @Override
//    public String toString() {
//        return "Cookie: " + super.toString() + ", count=" + count;
//        //return "Cookie{" + "cookie=" + cookie + '}';
//    }
//  
//    public int bag() {
//        return this.cookie * 6;
//    }
    
    
    
    public Cookie(String name, int count) {
        super(name, count);
    }

    public void sell(int bag) {
        super.sell(bag * 6);
    }

    public String toString() {
        return super.toString() + " (" + super.count + " cookies)";        
    }

    
}



