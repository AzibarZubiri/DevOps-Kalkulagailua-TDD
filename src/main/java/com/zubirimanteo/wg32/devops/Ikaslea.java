
package com.zubirimanteo.wg32.devops;

import java.util.Objects;

/**
 * Representa un estudiante con su identificador, nombre,
 * estado de actividad y calificaciones.
 */
public final class Ikaslea {

    /** Identificador único del estudiante. */
    private String id;

    /** Nombre del estudiante. */
    private String izena;

    /** Indica si el estudiante está activo. */
    private boolean aktibo;

    /** Calificaciones del estudiante. */
    private int[] notak;

    /**
     * Construye un estudiante.
     *
     * @param pId identificador del estudiante
     * @param pIzena nombre del estudiante
     * @param pAktibo estado de actividad
     * @param pNotak calificaciones del estudiante
     */
    public Ikaslea(
            final String pId,
            final String pIzena,
            final boolean pAktibo,
            final int[] pNotak) {

        this.id = pId;
        setIzena(pIzena);
        this.aktibo = pAktibo;
        this.notak = pNotak;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param pIzena nombre que se asignará
     * @throws IllegalArgumentException si el nombre es null
     */
    public final void setIzena(final String pIzena) {
        if (pIzena == null) {
            throw new IllegalArgumentException(
                    "Izena ezin da hutsa (null) izan");
        }

        this.izena = pIzena;
    }

    /**
     * Devuelve el identificador del estudiante.
     *
     * @return identificador del estudiante
     */
    public String getId() {
        return id;
    }

    /**
     * Indica si el estudiante está activo.
     *
     * @return true si está activo
     */
    public boolean isAktibo() {
        return aktibo;
    }

    /**
     * Devuelve las calificaciones del estudiante.
     *
     * @return array de calificaciones
     */
    public int[] getNotak() {
        return notak;
    }

    /**
     * Compara estudiantes mediante su identificador.
     *
     * @param obj objeto que se desea comparar
     * @return true si ambos objetos tienen el mismo identificador
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Ikaslea ikaslea = (Ikaslea) obj;
        return Objects.equals(id, ikaslea.id);
    }

    /**
     * Calcula el código hash a partir del identificador.
     *
     * @return código hash del estudiante
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

