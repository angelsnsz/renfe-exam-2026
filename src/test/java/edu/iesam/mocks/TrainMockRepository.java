package edu.iesam.mocks;

import edu.iesam.domain.Train;
import edu.iesam.domain.TrainRepository;

import java.util.ArrayList;

public class TrainMockRepository implements TrainRepository {
    public Integer countAddTrain = 0;

    @Override
    public void add(Train train) {
        countAddTrain++;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<Train> getAll() {

        ArrayList<Train> trains = new ArrayList<>();
        Train train = new Train  ("MD5-001", "Alvia", "12", "Atocha");
        Train  train2 = new Train  ("MD5-002", "Ouigo", "14", "Chamartin");
        Train train3 = new Train  ("MD5-003", "Talgo", "19", "Atocha");
        trains.add(train);
        trains.add(train2);
        trains.add(train3);
        return trains;
    }
}
