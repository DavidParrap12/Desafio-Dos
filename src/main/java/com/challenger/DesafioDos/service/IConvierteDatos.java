package com.challenger.DesafioDos.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
