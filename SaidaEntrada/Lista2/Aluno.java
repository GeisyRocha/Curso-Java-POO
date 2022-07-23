import java.util.Scanner;

public class Aluno{
    private String nome;
    private int idade;
/* private char sexo;*/
    private float nota1, nota2, nota3;

    public String getNome(){
        return this.nome;

    }   
    public void setNome(String newNome){
        this.nome = newNome;
    }

     public int getIdade(){
        return this.idade;

    }   
    public void setIdade(int valor){
        this.idade = valor;
    }

     /*public char getSexo(){
        return this.sexo;

    }   
    public void setSexo(char genero){
        this.sexo = genero;
    }*/

     public float  getNota1(){
        return this.nota1;

    }   
    public void setNota1(float newNota1){
        this.nota1 = newNota1;
    }

     public float  getNota2(){
        return this.nota2;

    }   
    public void setNota2(float newNota2){
        this.nota2 = newNota2;
    }
     public float  getNota3(){
        return this.nota3;

    }   
    public void setNota3(float newNota3){
        this.nota3 = newNota3;
    }

    public void imprimeMedia(){
        

        double media = (this.getNota1()+ this.getNota2()+this.getNota3())/3;
            System.out.println("Nome: " +this.getNome());
            System.out.println("Idade:" +this.getIdade());
            System.out.printf("Media:%.2f \n " ,media);

    }

    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
       // System.out.print("Informe o sexo do aluno");
        
        String nome = ler.nextLine();
        System.out.print("Informe a idade do aluno: ");

          int idade  = ler.nextInt();
         // char sexo = ler.next();
         System.out.println("Informe as notas do aluno: ");
          float nota1 = ler.nextFloat();
          float nota2 =ler.nextFloat();
          float nota3 = ler.nextFloat();

        Aluno nota = new Aluno();

        nota.setNome(nome);
        nota.setIdade(idade);
        nota.setNota1(nota1);
        nota.setNota2(nota2);
        nota.setNota3(nota3);
        nota.imprimeMedia();
        ler.close();

    }
}