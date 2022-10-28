package lambda;

public class Produto {

    public String nome;
    public double preco;
    public double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double precoReal () {
        double precoComDesconto = preco - (desconto*preco);
        return precoComDesconto;
    }

    public double impostoMunicipal(double precoComDesconto) {
        double precoComImposto = precoComDesconto + (precoComDesconto * 0.085);
        return precoComImposto;
    }

    public String imprimirPrecoFinal() {
        double precoFinal = precoReal();
        if (precoFinal > 2500) {
            precoFinal = impostoMunicipal(precoFinal);
        }
        if (precoFinal >= 3000) {
            precoFinal += 100;
        }
        else {
            precoFinal += 50;
        }
        return String.format("R$ %.2f", precoFinal);
    }

}
