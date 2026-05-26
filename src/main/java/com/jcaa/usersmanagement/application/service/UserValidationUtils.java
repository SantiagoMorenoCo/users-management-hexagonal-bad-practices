package com.jcaa.usersmanagement.application.service;

/**
 * ARREGLADO: Se eliminaron todos los métodos utilitarios que violaban la cohesión
 * y duplicaban lógica de dominio. Las validaciones ahora viven correctamente 
 * dentro de sus respectivos Value Objects y Modelos de Dominio.
 */
public final class UserValidationUtils {
    // Clase vacía para mantener compatibilidad de archivos, libre de violaciones.
    private UserValidationUtils() {
        // Constructor privado para evitar instanciación de clase utilitaria
    }
}