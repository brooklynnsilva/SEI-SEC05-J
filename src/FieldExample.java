import java.lang.reflect.Field;

class FieldExample {
    private int i = 3;
    private int j = 4;

    public String toString() { return "FieldExample: i=" + i + ", j=" + j; }

    public void zeroI() { this.i = 0; }

    public void zeroField(String fieldName) {           // Not compliant
//    private void zeroField (String fieldName) {         // Compliant
        try {
            Field f = this.getClass().getDeclaredField(fieldName);                  // This is the reflection code
            // Subsequent access to field f passes language access checks
            // because zeroField() could have accessed the field via
            // ordinary field references
            f.setInt(this, 0);
            // Log appropriately or throw sanitized exception; see EXC06-J
        } catch (NoSuchFieldException ex) {
            // Report to handler
            System.out.println("NoSuchFieldException");
        } catch (IllegalAccessException ex) {
            // Report to handler
            System.out.println("IllegalAccessException");
        }
    }
}