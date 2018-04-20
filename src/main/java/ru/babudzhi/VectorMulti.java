package ru.babudzhi;

import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;

/**
 * Класс, скалярно умножающий вектор.
 *
 * @author Babudzhi
 */
public class VectorMulti {
    /**
     * Главный метод
     * @param args
     */

    public static void main(String[] args) {
        Vector1D vector1 = new Vector1D(3.6);
        vector1 = vector1.scalarMultiply(12.5);
        System.out.println(vector1.toString());
    }
}
