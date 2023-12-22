import org.python.util.PythonInterpreter;

public class JythonIntegration {
     public static void main(String[] args) {
         // Create a Python interpreter
         PythonInterpreter pythonInterpreter = new PythonInterpreter();

         // Call Python code from Java
         pythonInterpreter.exec("execfile('app.py')");
     }
}