package ru.geekbrains.java2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Socket socket;
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    while (socket.isConnected()) {
                        String str = in.readUTF();
                        if (str.equals("/end")) {
                            socket.close();
                            break;
                        }
                        System.out.println("Клиент: " + str);
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }).start();
            while (socket.isConnected()) {
                String str = reader.readLine();

                out.writeUTF(str);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
