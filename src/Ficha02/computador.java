/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficha02;

/**
 *
 * @author dell
 */
public class computador extends ProdutoElectronico  {
    
    public computador(int serie, String tipo) {
        super(serie, tipo);
    }
    
    
    @Override
    public void ligar(){
        System.out.println("O computador está pronto para o uso.");
    }
    public void desligar(){
        System.out.println("O computador ja pode ser desligado com seguranca.");
    }
    public void velocidadeProcessamento( int velocidade){
        System.out.println("A velocidade do processamento é "+velocidade+"GHz"); 
    }
}
