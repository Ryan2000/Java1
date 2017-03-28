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
public class Cake extends BakeryItem {

//    public static enum CAKE_TYPE {BIRTHDAY, WEDDING}
//    private CAKE_TYPE type;
//
//    public Cake(String name, int count, CAKE_TYPE type) {
//        super(name, count);
//        this.type = type;
//    } 
//    
//    public CAKE_TYPE getType() {
//        return type;
//    }
//
//    public void setType(CAKE_TYPE type) {
//        this.type = type;
//    }
//
//    @Override
//    public String toString() {
//        return "Type: " + super.toString() + ", id =" + count;
//        //return "Cake{" + "type=" + this.type.toString() + '}';
//    }
    public static enum CAKE_TYPE {
        BIRTHDAY, WEDDING
    }
    protected CAKE_TYPE type;

    public Cake(String name, int count, CAKE_TYPE type) {
        super(name, count);
        this.type = type;
    }

    // add getters & setters

    public CAKE_TYPE getType() {
        return type;
    }

    public void setType(CAKE_TYPE type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    public String toString() {
        return super.toString() + " (" + super.count + " " + this.type + " cakes)";
    }

}
