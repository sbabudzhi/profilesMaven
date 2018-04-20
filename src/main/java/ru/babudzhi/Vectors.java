package ru.babudzhi;

import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;

/**
 * Класс создающий новый вектор на основе предыдущег.
 *
 * @author Babudzhi
 */
public class Vectors {

    /**
     * Главный метод
     * @param args
     */
    public static void main(String[] args) {

        Vector1D vector1 = new Vector1D(7.8);
        Vector1D vector2 = vector1;
        System.out.println(vector2.toString());

    }
}
