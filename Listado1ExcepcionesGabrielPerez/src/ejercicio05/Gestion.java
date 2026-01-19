package ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gestion {
	
	
	public Gestion() {
		// TODO Auto-generated constructor stub
	}

	
	public List<Integer> generarNumerosAleatorios(int cant, int numMax, int numMin) throws NumYaGeneradoException {
        List<Integer> lista = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i < cant; i++) {
            int numeroGenerado = rnd.nextInt((numMax - numMin) + 1) + numMin;

            if (lista.contains(numeroGenerado)) {
                throw new NumYaGeneradoException("El número " + numeroGenerado + " ya ha salido anteriormente.");
            }

            lista.add(numeroGenerado);
        }
        return lista;
    }

    public void asignarIdUnico(Usuario usuarioObjetivo, Long nuevoId, List<Usuario> listaUsuarios) throws IdDuplicadaException {
        for (Usuario u : listaUsuarios) {
            if (u.getId() == nuevoId) {
                throw new IdDuplicadaException("El ID " + nuevoId + " ya está asignado.");
            }
        }
        usuarioObjetivo.setId(nuevoId);
    }

    public void validarNumeroPar(int numero) throws NumeroImparException {
        if (numero % 2 != 0) {
            throw new NumeroImparException("El número " + numero + " es impar.");
        }
    }

    public void realizarBizum(double cantidadEnvio, double saldoDisponible) throws SaldoInsuficienteException {
        if (cantidadEnvio > saldoDisponible) {
            throw new SaldoInsuficienteException("No tienes saldo suficiente.");
        }
    }

    public void guardarContrasena(String password) throws ContrasenaInseguraException {
        if (password == null || password.length() < 8) {
            throw new ContrasenaInseguraException("La contraseña es demasiado corta.");
        }
    }

    public void verificarTemperaturaMotor(double temperaturaActual) throws TemperaturaCriticaException {
        if (temperaturaActual > 90.0) {
            throw new TemperaturaCriticaException("Temperatura crítica excedida.");
        }
    }
	
	
	
}
