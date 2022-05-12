package classes;

public class Cartao {

    protected int[] numeros;
    protected int totNumeros;

    public Cartao(int qtde) {
        numeros = new int[qtde];
        totNumeros = 0;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getTotNumeros() {
        return totNumeros;
    }

    public int addNumeros(int numero) {
        if (totNumeros < numeros.length) {
            if (!existe(numero)) {
                numeros[totNumeros] = numero;
                totNumeros++;
                return 1;//1 adicionado com sucesso
            }else{
            return 0;// 0 quando número já existe na coleção
            }
        }
        return -1;// não tem mais espaço
    }

    public boolean existe(int numeroProcurado) {
        boolean achou = false;
        for (int i = 0; i < totNumeros; i++) {
            if (numeros[i] == numeroProcurado) {
                achou = true;
            }

        }
        return achou;
    }

    public String numerosCartao() {
        StringBuilder saida = new StringBuilder("\n");
        for (int i = 0; i < numeros.length; i++) {
            saida.append(numeros[i]).append(" ");
        }

        return saida.toString();
    }
}
