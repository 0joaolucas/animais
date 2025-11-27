

abstract class Animal {

    String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    abstract void emitir_som();

    public void dormir(){
        System.out.println("Dormindo...");
    }
}
