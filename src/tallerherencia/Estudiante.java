
package tallerherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucho
 */
public class Estudiante extends Persona{
    private String carnet;
    private double promedioNotas;
     private int numeroMaterias;
   public Estudiante(){}
    public Estudiante(String nombre,String apellido,int edad,String carnet,double promedioNotas, int numeroMaterias) {
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }


    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the promedioNotas
     */
    public double getPromedioNotas() {
        return promedioNotas;
    }

    /**
     * @param promedioNotas the promedioNotas to set
     */
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    /**
     * @return the numeroMaterias
     */
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    /**
     * @param numeroMaterias the numeroMaterias to set
     */
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public int leerNotasEstudiante(int numeroMaterias){
        int suma = 0,nota;
        numeroMaterias=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de materias"));
        for(int i=1; i<= numeroMaterias; i++){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota"+" "+i+" "+"de"+" "+numeroMaterias+":"));
            suma = suma + nota;
            }
         promedioNotas= suma /numeroMaterias;
         
        return (int) (promedioNotas);
      
    }
    public Estudiante ingresarDatosEstudiante(){
    Estudiante nuevoEstudiante=new Estudiante();
        
    carnet = leerDatoTipoCadena("Ingrese el código del estudiante: ");
    nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
    apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        
    nuevoEstudiante.setNombre(nombre);
    nuevoEstudiante.setApellido(apellido);
    nuevoEstudiante.setCarnet(carnet);
    
            return (nuevoEstudiante);
    }
   public void imprimirReporteNotasEstudiante(){
    JOptionPane.showMessageDialog(null,"El estudiante identificado con carnet : "+carnet+"\n"+" Nombre: "+nombre+" "+apellido+"\n"
    +"Promedio de notas: "+leerNotasEstudiante((int) promedioNotas));
    }

   
}

