public class Alunos extends SQLClass {

    @Key
    int id;
    String nome;
    int idade;
    String cidade;
    String uf;

    Alunos(){
        this.setTableName("ALUNOS");
    }


}
