/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
class User {
    private int id;
    private String Name;
    
    public User(int id, String Name){
        this.id=id;
        this.Name=Name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
