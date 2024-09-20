package aed.actividad1_5;

public class Actividad1_5_Con_Try_Catch {

    public static void main(String[] args) {
        
        int nume = 10, denom = 0, cociente;
        
        try{
            cociente = nume / denom;
            System.out.println("Resultado" + cociente);
        } catch (ArithmeticException a) {
            System.err.println("getLocalizedMessage(): "
                    + a.getLocalizedMessage());
            System.out.print("getLocalizedMessage():"
                    + a.getLocalizedMessage());
            System.err.print("getLocalizedMessage():"
                    + a.getMessage());
        }
        
        catch (NumberFormatException n) {
                System.err.println("Exception");
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Se ejecuta siempre");
        }
        
    }
}
