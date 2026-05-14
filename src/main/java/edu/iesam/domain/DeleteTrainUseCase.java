package edu.iesam.domain;

public class DeleteTrainUseCase {
    TrainRepository trainRepository;

    public DeleteTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(String id) {
        trainRepository.delete(id);
    }
}
