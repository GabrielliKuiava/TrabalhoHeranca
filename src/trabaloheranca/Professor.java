
package trabaloheranca;

public class Professor extends Pessoa{
    public String Curso; 
    public float Salario, descontosalario;
   

    
    public Professor(){
    }
    
    public Professor(String Curso, float Salario , String Nome, String Endereco, String CPF, String Telefone) {
        super(Nome, Endereco, CPF, Telefone);
        this.Curso = Curso;
        this.Salario = Salario;
    }
    
    public void Salario(){
        System.out.println("O salário com desconto é:" + descontosalario);
    }
}
