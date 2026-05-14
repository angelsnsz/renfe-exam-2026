package edu.iesam.domain;

import java.util.ArrayList;

public class GetTrainUseCase {
    TrainRepository trainRepository;

    public GetTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public ArrayList<Train> execute() {
        return trainRepository.getAll();
    }
}
