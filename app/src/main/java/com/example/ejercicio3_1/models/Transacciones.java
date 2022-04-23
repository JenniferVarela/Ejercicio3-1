package com.example.ejercicio3_1.models;

public class Transacciones {

    public static final String NameDatabase = "PM01DB";

    public static final String tblEmpleados = "empleado";
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String edad = "edad";
    public static final String direccion = "direccion";
    public static final String puesto = "puesto";


    public static final String CREATETABLEEMPLEADOS = "CREATE TABLE " + tblEmpleados +
            "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nombres TEXT, apellidos TEXT, edad INTEGER, direccion TEXT, puesto TEXT)";

    public static final String DROPTABLEEMPLEADOS = "DROP TABLE IF EXIST" + tblEmpleados;
}
