
package edu.touro.mco152.bm;

import edu.touro.mco152.bm.persist.DiskRun;

import java.util.concurrent.Callable;

/**
 *Not sure if this interface name is good and if the all current methods are good.
 */

public interface InputsForBenchmark {

    boolean IsCancelled();

    void setCallable(Callable callable);

    boolean lastStatus();
    void handleMark(DiskMark Mark);
    void handleProgress(int progress);

    void handleMessage(String message);

    void showMessage(String message, String title, int type);

    void updateUser(String update);

    void addRun(DiskRun run);

    /*boolean done();*/

    void updateUserInterface(String message);

    void setProperties();
    
    void start();

    void cancel();
}
