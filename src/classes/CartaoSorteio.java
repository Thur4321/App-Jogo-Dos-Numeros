package classes;

import java.util.Random;

public class CartaoSorteio extends Cartao {

    public CartaoSorteio() {
        super(6);
        sorteiaNumeros();
    }

    private void sorteiaNumeros() {
        Random valor = new Random();
        while (totNumeros < numeros.length){
            addNumeros(valor.nextInt(50)+1);
        }
    }

}
