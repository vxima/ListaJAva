//enum
enum Genero{
    CISGENERO , 
    TRANSGENERO ,
    GENERO_FLUIDO,
    NAO_BINARIO , 
    NAO_INFORMADO
}
class Pessoa1{
    //atributos encapsulados
    protected String nome;
    protected int idade;
    protected String grauEscolaridade;
    protected Genero idGenero;
    protected String orientacaoSexual;
    protected String sexoBiologico;

    //construtor default
    public Pessoa1(){
        this.nome = "Nao informado";
        this.idade = -1;
        this.grauEscolaridade = "Nao informado";
        this.idGenero = Genero.NAO_INFORMADO;
        this.orientacaoSexual = "Nao informado";
        this.sexoBiologico = "Nao informado";
    }
    //constructor com parametro
    public Pessoa1(String nome , int idade , String grau , Genero idGenero , String orientacaoSexual , String sexoBiologico){
        this.nome = nome;
        this.idade = idade;
        this.grauEscolaridade = grau;
        this.idGenero = idGenero;
        this.orientacaoSexual = orientacaoSexual;
        this.sexoBiologico = sexoBiologico;
    }
    //setters
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setGrauEscolaridade(String grau){
        this.grauEscolaridade = grau;
    }
    //getters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getGrauEscolaridade(){
        return this.grauEscolaridade;
    }
    public Genero getIdGenero(){
        return this.idGenero;
    }
    public String getOrientaçaoSexual(){
        return this.orientacaoSexual;
    }
    public String getSexoBiologico(){
        return this.sexoBiologico;
    }
    //metodos 
    public void dormir(){
        System.out.println("Fui dormir");
    }
    public void cagar(){
        System.out.println("Fui cagar");
    }
    public void comer(){
        System.out.println("Fui comer");
    }
    public void estudar(){
        System.out.println("Fui estudar");
    }
    public void viver(){
        System.out.println("Estou vivo!");
    }
    public void sobreviver(){
        System.out.println("Sobrevivi");
    }
    public void trabalhar(){
        System.out.println("Fui trabalhar");
    }

    
    
}

public class Q3 {
    public static void main(String[] args) {
        Pessoa1 p1 = new Pessoa1() ;
        Pessoa1 p2 = new Pessoa1("Joseph" , 17 , "Ensino fundamental" , Genero.TRANSGENERO , "Heterossexual" , "Masculino" );
        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getGrauEscolaridade());
        System.out.println(p2.getIdGenero());
        System.out.println(p2.getOrientaçaoSexual());
        System.out.println(p2.getSexoBiologico());
        p2.comer();
        p2.dormir();
        p2.sobreviver();
    }
}
