package ru.rostel;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String method;
        String path;
        String phrase;
        Scanner scanner = new Scanner(System.in);
        Mem mem = new Mem();
        if (args.length > 2) {
            method = args[0];
            path = args[1];
            String[] p = Arrays.copyOfRange(args, 2, args.length);
            phrase = String.join(" ", p);
            if(method.equals("mem")) {
                Mem.mem(path, phrase);
            } else {
                throw new RuntimeException("Введен неккоректный метод");
            }
        } else if (args.length == 0) {
            System.out.println("Введите help для вывода мануала");
            String mes = scanner.nextLine();
            if (mes.equals("help")) {
                Manual.printInstr();
            }
            mes = scanner.nextLine();
            String[] mes1 = mes.split(" ");
            Mem.mem(mes1[0], mes1[1]);
        } else {
            throw new RuntimeException("Введен неккоректный аргумент");
        }
    }
}