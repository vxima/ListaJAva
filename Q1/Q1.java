abstract class Livro{
    //atributos basicos de livro
    String nome;
    String autor;
    int qntdPagina;
}
class LivroLivraria extends Livro{
    //atributos de livro de livraria
    double preco;
    int estoque;
    //settes

    public LivroLivraria(String nome ,  String autor , int qntdPagina){
        this.nome = nome;
        this.autor = autor;
        this.qntdPagina = qntdPagina;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    

}
class LivroBiblioteca extends Livro{
    //atributos de livro de biblioteca
    boolean emprestado;
    //settes

    public LivroBiblioteca(String nome ,  String autor , int qntdPagina){
        this.nome = nome;
        this.autor = autor;
        this.qntdPagina = qntdPagina;
    }
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    

}
public class Q1 {
    public static void main(String[] args) {
        LivroLivraria L1 = new LivroLivraria("O Hobbit", "J. R. R. Tolkien" , 325);
        L1.setEstoque(20);
        L1.setPreco(32.90);
        LivroBiblioteca L2 = new LivroBiblioteca("20000 leguas submarinas", "Julio Verne", 242);
        L2.setEmprestado(false);
        System.out.println(L1.nome);
        System.out.println(L2.emprestado);
    }
}
