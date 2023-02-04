public class MyClass {

    public static void main(String[] args){
        String primeiroNome = "Isabele";
        String segundoNome = "Leal";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
         return "Resultado do método " + primeiroNome.concat("  ").concat(segundoNome);
    }
}
 