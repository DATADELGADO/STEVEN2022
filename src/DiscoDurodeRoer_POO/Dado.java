package DiscoDurodeRoer_POO;

public class Dado {

    private int numCaras;

    public Dado() {
    }

    public Dado(int numCaras) {
        this.numCaras = numCaras;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public void setNumCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    @Override
    public String toString() {
        return "Dado{" + "numCaras=" + numCaras + '}';
    }

    public int tirarDado() {
        return (int) (Math.random() * this.numCaras + 1);
    }

    public int[] tirarDadoNveces(int veces) {
        int[] x = new int[veces];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * this.numCaras + 1);

        }
        return x;
    }
}
