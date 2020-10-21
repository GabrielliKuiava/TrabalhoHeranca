
package trabaloheranca;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pessoa {
    // Atributos
    public String Nome , Endereco, CPF , Telefone;
    public int tipopesssoa;
    public float valor, copia;

//Métodos Construtorres
    public Pessoa(){
    }

    public Pessoa(String Nome, String Endereco, String CPF , String Telefone){
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }
 
      public void tirarCopia (){
          if (this.tipopesssoa==1.00)
            {
            valor=(float) (copia*0.10);
            } else{
                    valor=(float) (copia*0.05);
                    }
         System.out.println("Valor total R$" + valor);
      }
              
              
              
              
              
}
