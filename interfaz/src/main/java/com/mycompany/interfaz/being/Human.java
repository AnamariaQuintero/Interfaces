package com.mycompany.interfaz.being;

public class Human implements Move { //implements para las interfaces
    private int height;
    private String name;

    public Human(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    
    
    //Debe tener los dos metodos porque estoy implementando la interfaz
    @Override  //Para decir que es sobreescritura
    public void walk(){
        System.out.println("Estoy caminando erguido");
    }
    
    @Override
    public void run(){
        System.out.println("Corriendo como naruto");
    }
    
}
