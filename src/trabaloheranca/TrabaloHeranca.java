
package trabaloheranca;


public class TrabaloHeranca {

    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       p1.copia=3;
       p1.tipopesssoa=1;
       // Para aluno inicialize com 1, para professor 2
       
    
       Professor prof = new Professor();
       prof.Salario= (float) 1.450;
       prof.descontosalario= (float) (prof.Salario*0.92);
       
       Aluno alu = new Aluno();
        alu.nota1=(float) 7.0;
        alu.nota2=(float) 6.0;
        alu.nota3=(float) 8.0;
        alu.medianota=(alu.nota1+alu.nota2+alu.nota3)/3;
       
       p1.tirarCopia();
       prof.Salario();
       alu.calcularMedia();
       alu.verificarAprovado();
    }
    
    
}
