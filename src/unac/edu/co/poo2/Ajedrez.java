package unac.edu.co.poo2;

public class Ajedrez{
    static final int N=8;
    static final int n = (N+1);
    // columnas
    final int y0=6;
    // filas
    final int x0=5;
    public final int j=1;
    public int contador = 0;
    boolean visitado [] = new boolean[9];
    public void ponPeon(int b) {
        boolean exito = true;
        visitado[b] = true;
        for (int i = 1; i < 9; i++) {
            if (Math.abs(x0 - i) == Math.abs(y0 - b)) {
                exito = false;
                break;
            }
        }
        if (b < 8 && !visitado[b + 1]) {
            ponPeon(b + 1);
        }
        if (b > 1 && !visitado[b - 1]) {
            ponPeon(b - 1);
        }
        if (exito){
            contador++;
        }
    }

}