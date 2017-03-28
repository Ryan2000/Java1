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
public class BakeryItem {

//    private static int lastAssignedId = 95;
//
//    private String name;
//    int count;
//    private int id;
//
//    
//    public BakeryItem() {
//        this.id = lastAssignedId;
//        lastAssignedId++;
//    }
//
//    public BakeryItem(String name, int count) {
//        this();
//        this.name = name;
//        this.count = count;
//    }
//
//    public static int getLastAssignedId() {
//        return lastAssignedId;
//    }
//
//    public static void setLastAssignedId(int lastAssignedId) {
//        BakeryItem.lastAssignedId = lastAssignedId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void sell(int num) {
//        
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + id + "] " + name + " BakeryItem count=" + count;
//        //return "BakeryItem{" + "name=" + name + ", count=" + count + ", id=" + id + '}';
//    }
    private static int lastAssignedID = 100;
    private int id;
    protected String name;
    protected int count;

    public BakeryItem() {
        this.id = BakeryItem.lastAssignedID + 1;
        BakeryItem.lastAssignedID++;
    }

    public BakeryItem(String name, int count) {
        this();
        this.name = name;
        this.count = count;
    }

    // add getters & setters

    public static int getLastAssignedID() {
        return lastAssignedID;
    }

    public static void setLastAssignedID(int lastAssignedID) {
        BakeryItem.lastAssignedID = lastAssignedID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    public void sell(int num) {
        System.out.println("Selling " + num + " of " + this.name);
        if (this.count >= num) {
            this.count = this.count - num;
        } else {
            System.out.println("!!! Not enough " + this.name + " available to sell (" + this.count + " available)");
        }
    }

    public String toString() {
        return "[" + this.id + "] " + this.name;
    }

}
