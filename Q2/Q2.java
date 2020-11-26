class Texto{
    protected String txt;

    //setters
    public void setTxt(String txt){
        this.txt = txt;
    }
    //getters
    public String getTxt(){
        return this.txt;
    }
    public int qntdPalavras(){
        String[] aux = this.txt.split(" ");
        return aux.length;
    }
    public int Frequencia(String substring){
        int qntd = 0;
        int tamTxt = this.txt.length();
        int tamSub = substring.length();

        for(int i = 0 ; i < tamTxt - tamSub ; i++){
            int j;
            for(j=0;j<tamSub;j++){
                if(this.txt.charAt(i+j) != substring.charAt(j)){
                    break;
                }
            }
            if(j == tamSub){
                qntd++;
                j = 0;
            }
        }
        return qntd;
        
    }
    public String Substituir(String palavra , String substituta){
        String aux = this.txt;
        return aux.replace(palavra , substituta);
    }

}
public class Q2 {
    public static void main(String[] args) {
        Texto teste = new Texto();
        teste.setTxt("porta portaria");
        System.out.println("Texto: " + teste.getTxt());
        System.out.println("Quantidade de palavras: " + teste.qntdPalavras());
        System.out.println("Frequencia : " + teste.Frequencia("porta"));
        System.out.println(teste.Substituir("porta", "porrada"));
    }
}
