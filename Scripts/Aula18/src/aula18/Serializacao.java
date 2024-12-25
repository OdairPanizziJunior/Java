package aula18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serializacao {

    public static void main(String args[]) {
        Pessoa p = new Pessoa("Aluno POO", 1, 7, 2009);
        File f = new File("c:\\ArqSerializacao.arq");
        gravaObjeto(f, p);
        Pessoa p2 = (Pessoa) leObjeto(f);
        System.out.println("Foi armazendo o objeto pessoa com os valores:");
        System.out.println("Nome: " + p2.getNome() + " \nData: " + p2.getData());
    }

    private static void gravaObjeto(File f, Object o) {
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(o);
            os.close();
        } catch (IOException e) {
            System.out.println("Erro ao gravar objeto.");
        }
    }

    private static Object leObjeto(File f) {
        Object o = null;
        try {
            FileInputStream fos = new FileInputStream(f);
            ObjectInputStream os = new ObjectInputStream(fos);
            o = os.readObject();
            os.close();
        } catch (IOException e) {
            System.out.println("Erro ao abrir arquivo.");
        } catch (ClassNotFoundException ce) {
            System.out.println("Objeto nao encontrado.");
        }
        return o;
    }
} // da class Serializacao

class Pessoa implements Serializable {

    String nome;
    Data d;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        d = new Data(dia, mes, ano);
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return d.toString();
    }
} 

class Data implements Serializable {

    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
} 

