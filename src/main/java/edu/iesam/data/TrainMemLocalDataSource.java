package edu.iesam.data;

import edu.iesam.domain.Train;

import java.util.ArrayList;
import java.util.Objects;

public class TrainMemLocalDataSource {
    private static TrainMemLocalDataSource instance;

    private ArrayList<Train> storage = new ArrayList<>();

    public ArrayList<Train> findAll() {
        return storage;
    }

    public void add(Train train) {
        storage.add(train);
    }

    public void delete(String trainId) {
        storage.removeIf(train -> Objects.equals(train.getId(), trainId));
    }

    public static TrainMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new TrainMemLocalDataSource();
        }
        return instance;
    }
}
