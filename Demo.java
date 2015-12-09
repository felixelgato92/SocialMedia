

/**
 * This is the main driver for the program.
 * 
 * @author sburton
 */
public class Demo implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Demo().run();
    }

    @Override
    public void run() {
        // TODO: Add code here to run all three experiements
        
        Experimenter experimenter = new RandomClassifier();
        Experimenter exp2 = new TrueClassifier();
        experimenter.runTest();
    }
    
   
    
}
