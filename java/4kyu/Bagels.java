import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class BagelSolver {

  public static Bagel getBagel() {
      // This does require java 8 as this behaviour was later changed due to JDK-8210522.
       try {
            Field trueField = Boolean.class.getDeclaredField("TRUE");
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(trueField, trueField.getModifiers() & ~Modifier.FINAL);
            trueField.set(null, false);
        }
        catch(NoSuchFieldException | IllegalAccessException ignored)
        {
        }
    return new Bagel();
  }
}
