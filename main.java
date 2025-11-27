import java.util.Scanner;

public class main{
public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    int bicho;
    String nome_animal;

    

    System.out.print("Qual animal deseja adicionar? 1 - Cachorro, 2 - Gato: ");
    bicho = read.nextInt();
    read.nextLine();

    System.out.print("Qual o nome do seu animal? ");
    nome_animal = read.nextLine();
    

    Animal animal = null;

    if (bicho == 1){
        animal = new Cachorro(nome_animal);
    }else if (bicho == 2){
        animal = new Gato(nome_animal);
    }

    animal.emitir_som();
    animal.dormir();


    read.close();
}
}

class Cachorro extends Animal{

    String nome;

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    void emitir_som() {
        System.out.println("au au");
        
    }

    @Override
    public void dormir() {
        
        super.dormir();
    }

}

class Gato extends Animal{

    String nome;

    public Gato(String nome){
        super(nome);
    }

    @Override
    void emitir_som() {
        System.out.println("miau");
    }

    @Override
    public void dormir() {
        
        super.dormir();
    }

}