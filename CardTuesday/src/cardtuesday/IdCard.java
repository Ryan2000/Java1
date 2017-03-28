/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtuesday;


public class IdCard extends Card {
    

private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdCard() {
    }

    public IdCard(String id) {
        this.id = id;
    }

    public IdCard(String name, String id) {
        super(name);
        this.id = id;
        System.out.println("IdCard");
    }

    public String toString() {
        System.out.println("IdCard.toString");
        return "IdCard: " + super.toString() + ", id=" + id;
    }
}
