package com.sysventas.repository;

import java.util.List;

import com.sysventas.exeption.ModelNotFoundException;

/**
 * Contrato generico para las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * que debe implementar el repositorio de cada entidad del modelo.
 *
 * @param <T>  tipo de la entidad (por ejemplo Producto, Cliente, Usuario)
 * @param <ID> tipo del identificador de la entidad (por ejemplo Long, String)
 */
public interface ICrudGenericoRepository<T, ID> {

    T save(T entity);

    T update(T entity);

    void deleteById(ID id);

    /**
     * @throws ModelNotFoundException si no existe una entidad con ese id.
     */
    T findById(ID id) throws ModelNotFoundException;

    List<T> findAll();
}
