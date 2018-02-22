/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Metodos{
    Scanner sc=new Scanner(System.in);
    ArrayList<String> lista=new ArrayList();
    
    
    File fichero;
    FileWriter fl;
    
    public Metodos(){

    }
    
    public void escribir(){
        for(int i=0;i<5;i++){
            System.out.println("Inserte palabra "+(i+1)+": ");
            lista.add(sc.next());
        }
    }
    
    public void ordenar(){
        for(int i=0;i<5;i++){
            lista.sort(null);
        }        
        
    }
    
    public void pasarFichero(){
        fichero=new File("lista.txt");
        
        try{
            fl=new FileWriter(fichero);
            for(int i=0;i<lista.size();i++){
                    fl.write((i+1)+". "+lista.get(i)+"\n");
            }
            fl.close();
        }catch(IOException e){
            System.out.println("Error al escribir");
        }
    }
}
