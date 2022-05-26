package Mawande;

// To change this template file, choose Tools | Templates
// * and open the template in the editor.

/**
 *
 * @author DELL
 */
/*
Class Computer to stroe information about computer
*/
class Computer {

    //Member function to store IPAddress and value
    String IPAddress;
    float Value;

    //Parametrized constructor
    public Computer(String ip,float value ) {

        this.IPAddress=ip;
        this.Value=value;
    }
    @Override
    public String toString() {

        return this.IPAddress+" $"+ this.Value+"\n";
    }
}
