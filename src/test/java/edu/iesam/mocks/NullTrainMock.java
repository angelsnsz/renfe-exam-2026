package edu.iesam.mocks;

import edu.iesam.domain.Train;
import edu.iesam.domain.TrainRepository;

import java.util.ArrayList;

public class NullTrainMock implements TrainRepository {
    @Override
    public void add(Train train) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<Train> getAll() {
        return null;
    }
}
