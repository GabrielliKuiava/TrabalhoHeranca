
package trabaloheranca;

public class Aluno extends Pessoa{
    public String Curso; 
    public float nota1, nota2, nota3, medianota;
    
    
    public Aluno(){
    }

    public Aluno(String Curso, float nota1, float nota2, float nota3, String Nome, String Endereco, String CPF, String Telefone) {
        super(Nome, Endereco, CPF, Telefone);
        this.Curso = Curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
        
    public void calcularMedia(){
        System.out.println("A Média é:"+ medianota);
    }
    
     public void verificarAprovado(){
        if (this.medianota>=7) {
         System.out.println("Aprovado");
        } else {
                 System.out.println("Reprovado");
             }
    }
}
    

