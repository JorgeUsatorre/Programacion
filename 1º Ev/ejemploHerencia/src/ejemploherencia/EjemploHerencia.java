
package ejemploherencia;


public class EjemploHerencia {


    public static void main(String[] args) {

        Ensinante en = new Ensinante("prog","aaaaa","bbbbbb");
        en.setNome("Jorge");
        Estudiante es = new Estudiante("nashe","alto","ooooo","ppppp");
        EstudianteInternacional esin = new EstudianteInternacional("asd","pas","asdasd","asddsa","asdasd");
       
        
        
        System.out.println("Ensinante: "+en.toString() + "\nEstudiante: " + es.toString() + "\nEstudiante Internacional: " + esin.toString());
        
    }
    
}
