/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author CARLOS
 */
public class Ogro implements Raza{
      CentrodeMando Centro; 
    @Override
    public void ContructorCentrodeMando(){
         CentrodeMando centro= new CentrodeMando();
         centro.setVida(800);
           centro.setRecurso1(1000);
         centro.setRecurso2(500);
         centro.setRecurso3(300);
     }
    @Override
    public void ConstructorRecolector1(){
        
    }
    @Override
    public void ConstructorRecolector2(){
        
    }
    @Override
    public void ConstructorRecolector3(){
        
    }
    @Override
    public void ConstructorVehiculo1(){
        
    }
    @Override
    public void ConstructorVehiculo2(){
        
    }
    @Override
    public void ConstructorMilicia1(){
        
    }
    @Override
    public void ConstructorMilicia2(){
        
    }
    @Override
    public void ConstructorMiliciaEspecial(){
        
    }
    @Override
    public void ContructorEntrenamiento(){
        
    }
}
