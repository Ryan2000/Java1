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
public class Cookie7 extends BakeryItem7 {
    
    public static enum COOKIE_TYPE {
        SUGAR, SPRINKLES, CHOCOLATECHIP, VANILLA
    }
    
    protected COOKIE_TYPE type;

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
    
    
    public Cookie7(String name, int count, COOKIE_TYPE type) {
        super(name, count);
        this.type = type;
    }
    

    public String toString() {
        return super.toString() + " (" + super.count + " " + this.type + " cookies)";
    }

    
    @Override
    public void sell(int num) {
        System.out.println("Selling " + num + " of " + this.name);
        if (this.count >= num) {
            this.count = this.count - num;
        } else {
            System.out.println("!!! Not enough " + this.name + " available to sell (" + this.count + " available)");
        }
    }

    }


