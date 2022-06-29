public class SQLFactory{
    public static void main(String[] args){

        Alunos eu = new Alunos();
    
        eu.id = 4;
        eu.nome = "Fulano de tal";
        eu.idade = 20;
        eu.cidade = "Sinop";
        eu.uf = "MT";
      
        System.out.println("-------INSERT-------");
        System.out.println(eu.insertSQL());

        Database.inserir(eu);



    //Database.abrirID(eu, 5);
    //System.out.println("Nome: " + eu.nome + ", Idade: " + eu.idade + ", Cidade: " + eu.cidade + ", UF" + eu.uf );
        
    }

}

       //System.out.println("-------SELECT-------");
       //System.out.println(pilha.selectSQL());
       //System.out.println("-------INSERT-------");
       //System.out.println(pilha.insertSQL());
       //System.out.println("-------UPDATE-------");
       //System.out.println(pilha.updateSQL());
       //System.out.println("-------DELETE-------");
       //System.out.println(pilha.deleteSQL());
       