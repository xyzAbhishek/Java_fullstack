
import java.util.Optional;
import java.lang.classfile.ClassFile.Option;
import java.util.ArrayList;
import java.util.List;
public class optionalex {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("Abhishek");
        // Optional is used to save us from null exceptions.
                Optional<String> optional = lst.stream()
                                .filter(Str -> Str.contains("Abhishekk"))
                                .findFirst();
                                
                                    
        System.err.println(optional);



        /* ==========================================================
 * IMPORTANT POINTS ABOUT JAVA'S Optional<T> CLASS:
 * ==========================================================
 * 
 * 1. PURPOSE:
 *    - Optional is a container object used to represent 'null' with 
 *      better expressive power, helping avoid NullPointerException (NPE).
 * 
 * 2. CREATING AN OPTIONAL:
 *    - Optional.of(val)        -> Throws NPE if val is null. Use only when 
 *                                 guaranteed non-null.
 *    - Optional.ofNullable(val)-> Safely wraps val if non-null, or returns 
 *                                 an empty Optional if val is null.
 *    - Optional.empty()        -> Creates an explicitly empty Optional.
 * 
 * 3. EXTRACTING VALUES SAFELY:
 *    - orElse(defaultVal)      -> Returns value if present, else defaultVal.
 *    - orElseGet(Supplier)     -> Computes defaultVal lazily only if empty.
 *    - orElseThrow()           -> Throws NoSuchElementException if empty.
 *    - Avoid opt.get()         -> Throws exception if empty; only use if 
 *                                 presence is already guaranteed.
 * 
 * 4. FUNCTIONAL OPERATIONS:
 *    - isPresent() / isEmpty() -> Checks if a value exists.
 *    - ifPresent(Consumer)     -> Executes block only if value exists.
 *    - map(Function)           -> Transforms value if present.
 *    - filter(Predicate)       -> Keeps value only if it matches condition.
 * 
 * 5. BEST PRACTICES (WHAT NOT TO DO):
 *    - NEVER use Optional as class fields/instance variables (not serializable).
 *    - NEVER use Optional as method parameters (adds unnecessary boilerplate).
 *    - NEVER assign `null` to an Optional variable (use Optional.empty()).
 * ========================================================== */
    }
}
