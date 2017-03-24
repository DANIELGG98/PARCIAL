/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    
    double num1;
    double num2;
    double resultado;
    
    public double sumar(){
        resultado=num1+num2;
        return (resultado);
    }
    
    public double restar(){
        resultado=num1-num2;
        return (resultado);
    }
    
    public double multiplicar(){
        resultado=num1*num2;
        return (resultado);
    }
    
    public double dividir(){
        resultado=num1/num2;
        return (resultado);
    }
    
    public double seno(){
        double radianes = Math.toRadians(num1);
        resultado=Math.sin(radianes);
        return(resultado);
    }
    
    public double coseno(){
        double radianes = Math.toRadians(num1);
        resultado=Math.cos(radianes);
        return(resultado);
    }
    
    public double tangente(){
        double radianes = Math.toRadians(num1);
        resultado=Math.tan(radianes);
        return(resultado);
    }
    
}
