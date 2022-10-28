package lambda;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 1000.0, 0.10);
        System.out.println(p.precoReal());
        System.out.println(p.imprimirPrecoFinal());
    }
}
