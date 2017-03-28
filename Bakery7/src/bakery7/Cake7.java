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
public class Cake7 extends BakeryItem7 {

    @Override
    public void sell(int num) {
        System.out.println("Selling " + num + " of " + this.name);
        if (this.count >= num) {
            this.count = this.count - num;
        } else {
            System.out.println("!!! Not enough " + this.name + " available to sell (" + this.count + " available)");
        }
    }


    public static enum CAKE_TYPE {
        BIRTHDAY, WEDDING, BACHELORPARTY, RETIREMENT, DIVORCE
    }
    protected CAKE_TYPE type;

    public Cake7(String name, int count, CAKE_TYPE type) {
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
