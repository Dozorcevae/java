package Hospital.util;

public class generateId {

     public static String nextId(String prefix) {
        return prefix + System.nanoTime(); 
    }
}
