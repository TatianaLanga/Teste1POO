/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficha02;

/**
 *
 * @author dell
 */
public class impressa  extends ProdutoElectronico{
    public impressa (int serie, String tipo){
        super(serie, tipo);
        
    }
    
    @Override
    public void ligar (){
        System.out.println("A impressora está pronta para receber documentos.");
        
    }
    public void desligar (){
        System.out.println("A impressora não est;a mais disponivel");
    }
//    puvblic void
}
