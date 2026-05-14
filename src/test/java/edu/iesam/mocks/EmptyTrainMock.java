package edu.iesam.mocks;

import edu.iesam.domain.Train;
import edu.iesam.domain.TrainRepository;

import java.util.ArrayList;

public class EmptyTrainMock implements TrainRepository {
    @Override
    public ArrayList<Train> getAll() {
        return new ArrayList<>();
    }

    @Override
    public void add(Train train) {

    }

    @Override
    public void delete(String id) {

    }
}
