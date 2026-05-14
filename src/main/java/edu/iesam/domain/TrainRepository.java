package edu.iesam.domain;

import java.util.ArrayList;

public interface TrainRepository {

    void add(Train train);

    void delete(String id);

    ArrayList<Train> getAll();

}
