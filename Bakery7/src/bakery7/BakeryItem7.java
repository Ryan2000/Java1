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
public abstract class BakeryItem7 implements Comparable<BakeryItem7> {

    private static int lastAssignedID = 100;
    private int id;
    protected String name;
    protected int count;

    public BakeryItem7() {
        this.id = BakeryItem7.lastAssignedID + 1;
        BakeryItem7.lastAssignedID++;
    }

    public BakeryItem7(String name, int count) {
        this();
        this.name = name;
        this.count = count;
    }

    // add getters & setters
    public static int getLastAssignedID() {
        return lastAssignedID;
    }

    public static void setLastAssignedID(int lastAssignedID) {
        BakeryItem7.lastAssignedID = lastAssignedID;
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

    public abstract void sell(int num);


    public String toString() {
        return "[" + this.id + "] " + this.name;
    }

    public int compareTo(BakeryItem7 other) {
        return name.compareTo(other.name);
    }

}
