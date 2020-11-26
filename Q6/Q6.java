import java.util.Scanner;

interface Expression{
    //metodos
    public String avaliar(String expr);
    public String imprimirArvore(String expr);
}
class ExprAritmetica implements Expression{
    //atributo
    private String expre;
    //constructor
    public ExprAritmetica(String expr){
        this.expre = expr;
    }
    public String toString(Double val){
        return val + "";
    }
    //setters
    public void setExpr(String expr){
        this.expre = expr;
    }
    //getters
    public String getExpr(){
        return this.expre;
    }
    //metodos com corpo
    public String avaliar(String expr){
        //prioridade [/ , * , - , +]
        //ler da direita pra esquerda
        int tam = expr.length();
        String l ;
        String r ;
        char[] str = expr.toCharArray();
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '-'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL - valorR;
                return toString(result);
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '+'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL + valorR;
                return toString(result);
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '*'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL * valorR;
                return toString(result);
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '/'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL / valorR;
                return toString(result);
            }
        }
        return expr;
        

    }
    public String  imprimirArvore(String expr){
        //imprimir arvore
        int tam = expr.length();
        String l ;
        String r ;
        char[] str = expr.toCharArray();
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '-'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "-" + r + ")");
                
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '+'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "+" + r + ")");
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '*'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "*" + r + ")");
                
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '/'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "/" + r + ")");
                
            }
            
        }
        return "(" + expr + ")";
    }
}
class ExprLogica implements Expression{
    //atributo
    private String expre;
    //constructor
    public ExprLogica(String expr){
        this.expre = expr;
    }
    public String toString(Boolean val){
        return val + "";
    }
    public String toString(Double val){
        return val + "";
    }
    //setters
    public void setExpr(String expr){
        this.expre = expr;
    }
    //getters
    public String getExpr(){
        return this.expre;
    }
    //metodos com corpo
    public String avaliar(String expr){

        //prioridade [/ , * , - , +]
        //ler da direita pra esquerda
        int tam = expr.length();
        String l ;
        String r ;
        char[] str = expr.toCharArray();
        //parte de logica
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '<'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Boolean result = valorL < valorR;
                return toString(result);
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '>'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Boolean result = valorL > valorR;
                return toString(result);
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '<'){
                l = avaliar(expr.substring(0, i-1));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Boolean result = valorL <= valorR;
                return toString(result);
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '>'){
                l = avaliar(expr.substring(0, i-1));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Boolean result = valorL >= valorR;
                return toString(result);
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '='){
                l = avaliar(expr.substring(0, i-1));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Boolean result = valorL == valorR;
                return toString(result);
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '!'){
                l = avaliar(expr.substring(0, i-1));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Boolean result = valorL != valorR;
                return toString(result);
                
            }
        }
        //parte de calculo
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '-'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL - valorR;
                return toString(result);
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '+'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL + valorR;
                return toString(result);
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '*'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL * valorR;
                return toString(result);
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '/'){
                l = avaliar(expr.substring(0, i));
                r = avaliar(expr.substring(i+1));
                Double valorL = Double.parseDouble(l);
                Double valorR = Double.parseDouble(r);
                Double result = valorL / valorR;
                return toString(result);
            }
        }
        return expr;
    }
    
    public String imprimirArvore(String expr){
        //imprimir arvore
        int tam = expr.length();
        String l ;
        String r ;
        char[] str = expr.toCharArray();
        //parte de logica
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '<'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                return ("("  + l  + "<" + r + ")"); 
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '>'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                return ("("  + l  + ">" + r + ")"); 
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '<'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                return ("("  + l  + "<=" + r + ")"); 
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '>'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                return ("("  + l  + ">=" + r + ")"); 
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '='){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                return ("("  + l  + "==" + r + ")"); 
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '=' && str[i-1] == '!'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                return ("("  + l  + "!=" + r + ")"); 
            }
            
        }
        //parte de calculo
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '-'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "-" + r + ")");
                
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '+'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "+" + r + ")");
                
            }
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '*'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "*" + r + ")");
                
            }
            
        }
        for(int i = tam - 1 ; i >=0 ; i--){
            if(str[i] == '/'){
                l = imprimirArvore(expr.substring(0, i));
                r = imprimirArvore(expr.substring(i+1));
                
                return ("("  + l  + "/" + r + ")");
                
            }
            
        }
        return "(" + expr + ")";
    }
}

public class Q6 {
    public static Boolean descobreTipo(String expr){
        //se tiver operador logico , eh logico ,  se nao , eh aritmetio
        if(expr.contains("<") || expr.contains(">") || expr.contains("=>") || expr.contains("=<") || expr.contains("==") || expr.contains("!=") ){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expr = input.nextLine();
        if(descobreTipo(expr)){
            //exprLogica
            ExprLogica logic = new ExprLogica(expr);
            System.out.println("Avaliar: " + logic.avaliar(logic.getExpr()));
            System.out.println("ImprimirArvore: " + logic.imprimirArvore(logic.getExpr()));
        }
        else{
            //exprArit
            ExprAritmetica arit = new ExprAritmetica(expr);
            System.out.println("Avaliar: " + arit.avaliar(arit.getExpr()));
            System.out.println("ImprimirArvore: " + arit.imprimirArvore(arit.getExpr()));
            
        }
    }
}
