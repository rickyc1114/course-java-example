/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_3a;

/**
 *
 * @author vanting
 */
public class GBox<T> {
    
    // T stands for "Type"

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
