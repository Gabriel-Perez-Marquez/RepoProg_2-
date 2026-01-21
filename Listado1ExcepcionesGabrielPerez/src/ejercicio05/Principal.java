package ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Usuario> usuarios = new ArrayList<>();
		Gestion gestor = new Gestion();
        Usuario u1 = new Usuario(1L, "Ana");
        usuarios.add(u1);
        Usuario u2 = new Usuario(0L, "Pedro");

        try {
            System.out.println("--- INICIO DE PRUEBAS ---");

            gestor.generarNumerosAleatorios(5, 4, 1); 

            gestor.asignarIdUnico(u2, 1, usuarios); 

            gestor.validarNumeroPar(7); 

            gestor.realizarBizum(100.0, 50.0); 

            gestor.guardarContrasena("1234"); 

            gestor.verificarTemperaturaMotor(120.5); 
            
            System.out.println("--- FIN DE PRUEBAS ---");

        } catch (NumYaGeneradoException e) {
            System.out.println("Error números: " + e.getMessage());
        } catch (IdDuplicadaException e) {
            System.out.println("Error ID: " + e.getMessage());
        } catch (NumeroImparException e) {
            System.out.println("Error Par/Impar: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error Saldo: " + e.getMessage());
        } catch (ContrasenaInseguraException e) {
            System.out.println("Error Password: " + e.getMessage());
        } catch (TemperaturaCriticaException e) {
            System.out.println("Error Temperatura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general no controlado: " + e.getMessage());
        }
    }

}
