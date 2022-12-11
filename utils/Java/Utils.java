package utils.Java;

import java.util.logging.*;

public final class Utils {
    static final Logger log = Logger.getLogger("[MyExercise - JAVA]");

    public static <T> void printArray(T[] array, boolean useStdErr) {
        final StringBuilder sBuilder = new StringBuilder();
        
        for(int i = 0; i < array.length; i++) {
            sBuilder.append("[" + i + "] = " + array[i] + " \n");
        }

        if(useStdErr)
            log.log(Level.SEVERE, "\n" + sBuilder);
        else
            log.log(Level.WARNING, "\n" + sBuilder);
    }
}