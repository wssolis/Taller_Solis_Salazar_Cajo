/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author Santiago Solis
 */
public class Aplicacion {
    public static void main(String[] args) {
        Persona carua= new Persona();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("20/05/1984");
        Date fec= new Date();
        fec.setYear(1984);
        fec.setMonth(5);
        fec.setDate(20);
       Persona ob1= new Persona("1726303405", "dany", "paul", ""
               + "carua", "Armijos", "Quito", fec , "dany.carua@gmail.com");
       
        System.out.println("Fecha de nacimiento: "+ob1.getFechaNacimiento().getYear()+"/"
                + ""+ob1.getFechaNacimiento().getMonth()+"/"
                        + ""+ob1.getFechaNacimiento().getDate());
       
    }
    
}
