package edu.iesam.domain;

import edu.iesam.mocks.EmptyTrainMock;
import edu.iesam.mocks.NullTrainMock;
import edu.iesam.mocks.TrainMockRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetTrainUseCaseTest {
    TrainMockRepository trainMockRepository;
    NullTrainMock nullTrainMock;
    EmptyTrainMock emptyTrainMock;
    GetTrainUseCase getTrainUseCase;
    @Test
    public void deberiaDevolverUnTrainCuandoSeEjecuteElCasoDeUso() {


        trainMockRepository  = new TrainMockRepository();
        getTrainUseCase = new GetTrainUseCase(trainMockRepository);

        ArrayList<Train> trains = getTrainUseCase.execute();

        assertEquals(3, trains.size());
        assertEquals("MD5-001", trains.get(0).getId());
    }
    @Test
    void deberiaDevolverUnaListaDeTrainsVaciaCuandoSeEjecuteElCasoDeUso() {
        emptyTrainMock = new EmptyTrainMock();
        getTrainUseCase = new GetTrainUseCase(emptyTrainMock);

        List<Train> trains = getTrainUseCase.execute();

        assertEquals(0, trains.size());
    }

    @Test
    void deberiaDevolverUnaListaDeTrainsNulaCuandoSeEjecuteElCasoDeUso() {
        nullTrainMock = new NullTrainMock();
        getTrainUseCase = new GetTrainUseCase(nullTrainMock);

        List<Train> trains = getTrainUseCase.execute();

        assertNull(trains);
    }
}