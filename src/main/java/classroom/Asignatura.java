package classroom;

public class Asignatura {

    /*
    *  Taller 4 Java
    *  Realizado el 29 de febrero del 2024
    *  Desarrollado por Carlos Yazid Padilla
    *  Topico: Sobrecarga y Destructores
    * 
    *  Dependencias:
    * 
    *  - classroom > Asignatura
    *  - classroom > Grupo
    *  - classroom > Persona
    *  - classroom > Tipo
    * 
    */

    public String nombre;
    String n = nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",0,0,Tipo.FUNDAMENTACION);
    }

    public Asignatura(double codigoInterno,Tipo tipo) {
        this("Sin nombre", (int) codigoInterno, 0,tipo);
    }

    public Asignatura(int codigoExterno,Tipo tipo) {
        this("Sin nombre", 0, codigoExterno,tipo);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(double codigoExterno) {
        this.codigoExterno = (int) codigoExterno;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
} // Anti-copy: Carlos Padilla Royero