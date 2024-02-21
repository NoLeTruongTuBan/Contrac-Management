/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsitory;

import controller.DataAccess;
import model.History;


/**
 *
 * @author Bravo
 */
public class workerResponsitory  {
    private DataAccess run = new DataAccess();
    private History history;
   
    public void addWorker() {
        run.addWorker();
    }

   
    public void UpSalary() {
        run.changeSalary();
    }

 
    public void Downsalary() {
        run.changeSalary();
    }

   
    public void DisPlay() {
        run.printListHistory();
    }
    
}
