/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author Camilo
 */
public interface CarBuilder {
    
    public void assembleChassis();
    public void assembleEngine();
    public void assembleBrakes();
    public void assembleWheels();
    public Car getCar();
}
