/*
Implemente um programa completo, onde seja oferecido ao usuário funcionalidades de:
- Incluir novos registros no arquivo. O usuário deve fornecer quantidade inicial de itens em estoque e valor unitário.
- Vender itens. O usuário deve informar o código e o número de itens que foram vendidos.
- Modificar valor unitário: O usuário deve informar o código e o novo valor de um produto.
 */

package aula18.ex;

import java.io.RandomAccessFile;

public class Estoque {

    public static void main(String args[]) throws java.io.IOException {
        final int tamanhoRegistro = 24; // 2 * 4 + 2 * 8
        RandomAccessFile raf = new RandomAccessFile("estoque.txt", "rw");
//Escrevendo Registros
        for (int i = 0; i < 10; i++) {
            raf.writeInt(i);
            raf.writeInt(5);
            raf.writeDouble(3.50);
            raf.writeDouble(5 * 3.50);
        }
//Lendo Registros
        System.out.println("Imprimindo todo arquivo de estoque");
        raf.seek(0);
        int codigo, quantidade;
        double valorunitario, valorpassivo;
        for (int i = 0; i < 10; i++) {
            codigo = raf.readInt();
            quantidade = raf.readInt();
            valorunitario = raf.readDouble();
            valorpassivo = raf.readDouble();
            System.out.println("Item: " + codigo + " " +
                    "Estoque: " + quantidade + " " +
                    "R$ (un): " + valorunitario + " " +
                    "R$ (pas): " + valorpassivo);
        }
// Imprimir dados do registro de codigo 4
        System.out.println("Imprimindo o registro 4");
        raf.seek(5 * tamanhoRegistro);
        codigo = raf.readInt();
        quantidade = raf.readInt();
        valorunitario = raf.readDouble();
        valorpassivo = raf.readDouble();
        System.out.println("Item: " + codigo + " " +
                "Estoque: " + quantidade + " " +
                "R$ (un): " + valorunitario + " " +
                "R$ (pas): " + valorpassivo);
// Modificando o registro 4
        System.out.println("Vendendo um produto no registro 4");
        raf.seek(5 * tamanhoRegistro + 4); //caminhando ate a quantidade
        quantidade = raf.readInt(); //lendo a quantidade
        valorunitario = raf.readDouble(); //lendo o preco unitario
        quantidade = quantidade - 1;
//agora o ponteiro do arquivo esta posicionado no valor passivo
        raf.writeDouble(quantidade * valorunitario); //atualiza passivo
        raf.seek(5 * tamanhoRegistro + 4); //caminhando ate a quantidade
        raf.writeInt(quantidade); //atualiza quantidade
        System.out.println("Registro 4 apos a venda");
        raf.seek(5 * tamanhoRegistro); //posiciona no registro 4
        codigo = raf.readInt();
        quantidade = raf.readInt();
        valorunitario = raf.readDouble();
        valorpassivo = raf.readDouble();
        System.out.println("Item: " + codigo + " " +
                "Estoque: " + quantidade + " " +
                "R$ (un): " + valorunitario + " " +
                "R$ (pas): " + valorpassivo);
    }
}
