package edu.iesam.presentation;

import edu.iesam.data.TrainDataRepository;
import edu.iesam.data.TrainMemLocalDataSource;
import edu.iesam.domain.AddTrainUseCase;
import edu.iesam.domain.GetTrainUseCase;
import edu.iesam.domain.Train;

import java.util.ArrayList;

public class TrainView {
    public static void addTrain() {
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
    }
    public static void getTrain() {
        GetTrainUseCase getTrainUseCase = new GetTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        ArrayList<Train> trains = getTrainUseCase.execute();
        System.out.println("Listado de trenes: " + trains);
    }
}
