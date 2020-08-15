package com.example.test_1;

public class Usuario {

    private String correo;
    private String nombres;
    private String apellidos;
    private String contra;
    private int edad;
    private String genero;
    private int puntaje;
    private int nivel;

    public Usuario(String correo,String nombres,String apellidos,String contra,int edad,
                   String genero){
        this.correo=correo;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.contra=contra;
        this.edad=edad;
        this.genero=genero;
        this.puntaje=0;
        this.nivel=1;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
