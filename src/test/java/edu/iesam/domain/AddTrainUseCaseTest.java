package edu.iesam.domain;

import edu.iesam.mocks.TrainMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTrainUseCaseTest {
    @Test
    public void deberiaLlamarAlMetodoAddTrainCuandoSeEjecuta() {
        TrainMockRepository trainMockRepository = new TrainMockRepository();
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(trainMockRepository);
        Train train = new Train ("MD5-001", "Alvia", "12", "Atocha");
        addTrainUseCase.execute(train);
        assertEquals(1, trainMockRepository.countAddTrain);
    }

}