package Structural.Proxy.SecondImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerUtil {
    public static List<Worker> workers=new ArrayList<>();

    public static List<Worker> fillWorkerList() {
        workers.add(new Worker("user1", "pass1", false));
        workers.add(new Worker("user2", "pass2", false));
        workers.add(new Worker("Jalal", "Jalal", true));
        return workers;
    }

    public static Map<String, Worker> getWorkerAsMap() {
        List<Worker> workers = fillWorkerList();
        Map<String, Worker> workerMap = new HashMap<>();
        for (Worker worker : workers) {
            workerMap.put(worker.getUserName(), worker);
        }
        return workerMap;
    }

    public static Worker getWorkerByName(String name) {
        Map<String, Worker> workerAsMap = getWorkerAsMap();
        return workerAsMap.get(name);
    }

    public static boolean isPassValid(String name, String pass) {
        boolean valid = false;
        Worker worker = getWorkerByName(name);
        if (worker != null) {
            valid = worker.getPassword().equals(pass);
        }
        return valid;
    }

}
