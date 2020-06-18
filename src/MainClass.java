
public class MainClass { 
    public static String baseConversion(String number, 
                                 int sBase, int dBase) 
    { 
        // Parse the number with source radix  
        // and return in specified radix(base) 
        return Integer.toString( 
            Integer.parseInt(number, sBase), 
            dBase); 
    } 
    public static void main(String[] args) 
    { 
        String number = "555"; // Number 
        int sBase = 8; // Source Base Octal 
        int dBase = 10; // Destination Base Decimal 
        System.out.println("Octal to Decimal: "
            + baseConversion(number, sBase, dBase)); 
        dBase = 16; // Destination Base Hexadecimal 
        System.out.println("Octal to Hex: "
            + baseConversion(number, sBase, dBase)); 
    } 
} 
