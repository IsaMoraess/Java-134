public class App{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //MODIFICAR -> setNomeVariavel
        //PEGAR -> getNomeVariavel

        pessoa.setNome("Erika");
        pessoa.setIdade(19);
        pessoa.setAltura(1.63);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
}