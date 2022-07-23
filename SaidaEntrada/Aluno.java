import java.util.Scanner;
public class Aluno{

    private String nome;

     public String getNome(){
        return this.nome;
        }

     public void setNome(String novoNome){
            this.nome = novoNome;
         }
          public void digaSeuNome(){
            System.out.println(this.getNome());
    }

    public void someDoisNumeros(){
       Scanner ler = new Scanner(System.in);

       int n1, n2;
          System.out.println("Forneça dois numeros: ");

       n1= ler.nextInt();
       n2 = ler.nextInt();

       System.out.print("Os dois numeros lidos foram: ");
       System.out.print(n1);
       System.out.print(" e ");
       System.out.println(n2);

       int num3 = n1 + n2;
      System.out.print("O resultado da soma foi: ");
      System.out.println(num3);



    }
}
