package edu.iesam.domain;

public class AddTrainUseCase {
    TrainRepository trainRepository;

    public AddTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(Train train) {
        trainRepository.add(train);
    }
}
