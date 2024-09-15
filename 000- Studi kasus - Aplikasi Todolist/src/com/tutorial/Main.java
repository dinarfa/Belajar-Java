package com.tutorial;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String model[] = new String[10];

     public static void main(String[] args) {

        // showTodoList();
        // testAddTodoList();
        // testViewShowTodoList();
        // testInput();
        // addTodoList("haha");
        // testViewRemoveTodoList();
        viewShowTodoList();
        
    }

    /**
     * Menampilkan todo List
     */
    public static void showTodoList(){
        System.out.println("\nTODO LIST");
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * Menambahkan todo List
     */

    public static void addTodoList(String todo){
        // Penuh gak list nya?
        var isFull = true;
        for(var i = 0; i < model.length;i++){
            if(model[i] == null){
                isFull = false;
                break;
            }
        }

        // kalau penuh kita resize arraynya
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];
            for(var i = 0; i < temp.length; i++){
                model[i] = temp[i];
                
            }
        }

        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Menghapus todo List
     */

    public static boolean removeTodoList(int number){
        if((number - 1) >= model.length || number == 0){
            return false;
        } else if(model[number-1] == null){
            return false;
        } else{
            for(int i = (number-1); i < model.length; i++){
                if(i == (model.length - 1)){
                    model[i] = null;
                }else{
                    model[i] = model[i+1];
                }
            }
            return true;
        }   
    }

    public static String input(String info){
        System.out.print(info + " : ");
        var data = scanner.nextLine();
        return data;
    }

    /**
     * Menampilkan view todo List
     */

    public static void viewShowTodoList(){
        while (true) {
            showTodoList();

            System.out.println("\nMENU TODO LIST");
            System.out.println("1. Tambah To Do List");
            System.out.println("2. Hapus To Do List");
            System.out.println("3. Tampilkan To Do List");
            System.out.println("x. Keluar");
            var input = input("Pilih");
            if(input.equals("1")){
                viewAddTodoList();
                continue;
            }else if(input.equals("2")){
                viewRemoveTodoList();
                continue;
            }else if(input.equals("3")){
                showTodoList();
                continue;
            }else if(input.equals("x")){
                break;
            } else{
                System.out.println("Input tidak valid");
                // continue;
            }
            
        }


    }
    
    /**
     * Menampilkan view menambahkan todo List
     */

    public static void viewAddTodoList(){
        System.out.println("\nMENAMBAHKAN TODO LIST");
        var input = input("Text (ketik x jika batal)");
        if(input.equals("x")){
            // batal
        }else{
            addTodoList(input);
        }
    }
    
    /**
     * Menampilkan view menghapus todo List
     */

    public static void viewRemoveTodoList(){
        System.out.println("\nMENGHAPUS TODO LIST");
        var number = input("Nomor TODO yang ingin dihapus(x jika batal)");
        if(number.equals("x")){
            // batal
        }else{
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todo : " + number);
            }
        }

    }

    // TESTING
    public static void testViewRemoveTodoList(){
        addTodoList("Belajar Java");
        addTodoList("Belajar Python");

        viewRemoveTodoList();
    }

    // TESTING
    public static void testShowTodoList(){
        showTodoList();
    }

    // TESTING
    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi "+ name);

    }

    // TESTING
    public static void testRemoveTodoList(){
        addTodoList("Belajar MySQL");
        addTodoList("Belajar PHP");
        addTodoList("Belajar C++");
        addTodoList("Belajar JavaScript");
        addTodoList("Belajar Machine Learning");
        addTodoList("Belajar NoSQL");

        var result = removeTodoList(20);
        System.out.println(result);
        result = removeTodoList(0);
        System.out.println(result);
        result = removeTodoList(2);
        System.out.println(result);
        showTodoList();
    }

    // TESTING
    public static void testViewShowTodoList(){
        addTodoList("Belajar");
        addTodoList("Makan");
        addTodoList("Minum");
        viewShowTodoList();
    }

    // TESTING
    public static void testAddTodoList(){
        for(var i = 0; i < 25; i++){
            addTodoList("contoh todo list ke " + i);
        }
        // showTodoList();

    }

}