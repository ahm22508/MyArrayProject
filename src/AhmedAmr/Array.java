package AhmedAmr;

import java.util.Arrays;

public class Array {
    private int[] Arrayedora;
    private int contadora;

    public Array(int longitud) {
        Arrayedora = new int[longitud];
    }

    public void print() {
        for (int i = 0; i < contadora; i++)
        System.out.println(Arrayedora[i]);
    }

    public void add(int NewValue) {
        if (Arrayedora.length == contadora) {
            int[] Nueva = new int[contadora * 2];
            for (int i = 0; i < contadora; i++)
                Nueva[i] = Arrayedora[i];
            Arrayedora = Nueva;
        }
        Arrayedora[contadora++] = NewValue;
    }

    public void RemoveFrom(int indice) {
        if (indice < 0 || indice >= contadora)
            throw new IllegalArgumentException();
        for (int i = indice; i < contadora - 1; i++)
            Arrayedora[i] = Arrayedora[i + 1];

        contadora--;
    }

    public void IndexOF(int index) {
        for (int i = 0; i < contadora; i++)
            if (Arrayedora[i] == index)
                System.out.println(i);
    }

}

