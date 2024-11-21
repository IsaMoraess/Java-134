public class Pessoa{ //ATRIBUTO DE CLASSE SMP PRIVATE
    private String nome = "Isabelly";
    private int idade = 22;
    private double altura = 1.60;

    //METODOS DE ACESSO
    //<modificador-acesso> <retorno> nomeDoMetodo()
    public String getNome(){ //PEGAR
        return nome;
    }

    public void setNome(String nome){ //ALTERAR
        this.nome = nome;//"this.nome" eo atributo da classe, e "nome" é o parâmetro recebido
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
}