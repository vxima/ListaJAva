class Senha{
    protected String senhaLetra;
    protected int senhaNumero;
    
    public Senha(String sl , int sn ){
        this.senhaLetra = sl;
        this.senhaNumero = sn;
    }
    //setters
    public void setSenhaLetra(String sl){
        this.senhaLetra = sl;
    }
    public void setSenhaNumero(int sn){
        this.senhaNumero = sn;
    }
    //getters
    public String getSenhaLetra(){
        return this.senhaLetra;
    }
    public int getSenhaNumero(){
        return this.senhaNumero;
    }
    
}

class Conta{
    protected int id;
    protected int agencia;
    Senha senha;
    public Conta(int id , int agencia , Senha senha){
        this.id = id;
        this.agencia = agencia;
        this.senha = senha;
    }
    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    //getters
    public int getId(){
        return this.id;
    }
    public int getAgencia(){
        return this.agencia;
    }
    
}

public class Q4 {
    public static void main(String[] args) {
        Conta conta = new Conta(12 , 34 , new Senha("CD23", 567));
        System.out.println("Senha da conta : " + conta.senha.getSenhaLetra());
        System.out.println("Id da conta : " + conta.getId());
        conta.senha.setSenhaLetra("12AB");
        System.out.println("Senha da conta modificada: " + conta.senha.getSenhaLetra());
    }
}
