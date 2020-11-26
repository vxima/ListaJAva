interface Colecao{
    public void inserir(Pessoa pessoa);
    public int tamanhoColecaoNaoNull();
    
}

abstract class Pessoa{
    //atributos
    protected String nome;
    protected String cpf;
    //construtor
    protected Pessoa(String nome , String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    //setters
    public abstract void setNome(String n);
    public abstract void setCpf(String c);
    //getters
    public abstract String getNome();
    public abstract String getCpf();
}
class Professor extends Pessoa{
    //atributos
    private String formacao;
    private String area;
    //constructor
    public Professor(String nome , String cpf , String formacao , String area){
        super(nome, cpf);
        this.formacao = formacao;
        this.area = area;
    }
    //setters
    public void setFormacao(String f){
        this.formacao = f;
    }
    public void setArea(String a){
        this.area = a;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setCpf(String c){
        this.cpf = c;
    }
    //getters
    public String getFormacao(){
        return this.formacao;
    }
    public String getArea(){
        return this.area;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
}
class Aluno extends Pessoa{
    //atributos
    private String matricula;
    private String curso;
    //constructor
    public Aluno(String nome , String cpf , String matricula , String curso){
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }
    //setters
    public void setMatricula(String m){
        this.matricula = m;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setCpf(String c){
        this.cpf = c;
    }
    //getters
    public String getMatricula(){
        return this.matricula;
    }
    public String getCurso(){
        return this.curso;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
}
class ColecaoVetor implements Colecao{
    //atributos
    private int cursor;
    private Pessoa[] pessoas;
    //constructor
    public ColecaoVetor(){
        this.cursor = 0 ;
        this.pessoas = new Pessoa[5];
    }
    //metodos
    public void inserir(Pessoa p){
        pessoas[cursor] = p;
        cursor++;
    }
    public int tamanhoColecaoNaoNull(){
        return 5 - cursor;//5 tamanho maximo - quantidade ja presente
    }
    public String[] retornarNomes(){
        String[] cadastradas = new String[cursor];
        for(int i=0;i<cursor;i++){
            cadastradas[i] = pessoas[i].getNome();
        }
        return cadastradas;
    }

}
public class Q5 {
    public static void main(String[] args) {
        ColecaoVetor cVetor = new ColecaoVetor();
        Professor prof = new Professor("Castor", "123.456.789-10", "Computacao", "paradigmas");
        cVetor.inserir(prof);
        System.out.println("ainda tem " + cVetor.tamanhoColecaoNaoNull() + " vagas");
        Aluno victor = new Aluno("Victor" , "109.876.543-21" , "siga" ,  "Engenharia" );
        cVetor.inserir(victor);
        System.out.println("ainda tem " + cVetor.tamanhoColecaoNaoNull() + " vagas");
        Aluno danillo = new Aluno("Danillo" , "109.876.543-22" , "siga" ,  "Engenharia" );
        cVetor.inserir(danillo);
        System.out.println("ainda tem " + cVetor.tamanhoColecaoNaoNull() + " vagas");
        for(int i = 0 ; i<3;i++){
            System.out.println(cVetor.retornarNomes()[i]);
        }
        
    }
}
