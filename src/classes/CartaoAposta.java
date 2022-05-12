package classes;

public class CartaoAposta extends Cartao {

    private static int numeroAposta;

    public CartaoAposta(int qtdeNumeros) {
        super(qtdeNumeros);
        setNumeroAposta();
    }

    public int getNumeroAposta() {
        return numeroAposta;
    }

    private void setNumeroAposta() {
        numeroAposta++;
    }

    public Cartao acertos(CartaoSorteio sorteio) {
        Cartao acerto = new Cartao(sorteio.getTotNumeros());
        for (int i = 0; i < totNumeros; i++) {
            if (sorteio.existe(numeros[i])) {
                acerto.addNumeros(numeros[i]);
            }
        }
        return acerto;
    }

    public float calculaAposta() {
        float valor = 0;
        if (numeros.length == 6) {
            valor = 4.5f;
        }
        if (numeros.length == 7) {
            valor =31.5f;
        }
        if (numeros.length == 8) {
            valor = 126;
        }
        if (numeros.length == 9) {
            valor = 378;
        }
        if (numeros.length == 10) {
            valor = 945;
        }
        return valor;
    }

}
