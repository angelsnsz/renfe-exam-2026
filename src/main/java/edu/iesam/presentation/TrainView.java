package edu.iesam.presentation;

import edu.iesam.data.TrainDataRepository;
import edu.iesam.data.TrainMemLocalDataSource;
import edu.iesam.domain.AddTrainUseCase;
import edu.iesam.domain.DeleteTrainUseCase;
import edu.iesam.domain.GetTrainUseCase;
import edu.iesam.domain.Train;

import java.awt.*;
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
    public static void deleteTrain() {
        DeleteTrainUseCase deletetrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        deletetrainUseCase.execute("MD5-001");
    }
    public static void funcion1() {
        System.out.println("--Listado antes de añadir--");
        getTrain();
        Train train = new Train("MD5-001","Alvia","12","Atocha");
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        addTrainUseCase.execute(train);
        System.out.println("--Listado despues de añadir--");
        getTrain();
    }
    public static void funcion2() {
        GetTrainUseCase getTrainUseCase = new GetTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        ArrayList<Train> trains = getTrainUseCase.execute();
        System.out.println("Listado de trenes: " + trains);
    }
    public static void funcion3() {
        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        System.out.println("--Listado antes de eliminar--");
        getTrain();
        deleteTrainUseCase.execute("MD5-001");
        System.out.println("--Listado despues de eliminar");
        getTrain();
    }


}
