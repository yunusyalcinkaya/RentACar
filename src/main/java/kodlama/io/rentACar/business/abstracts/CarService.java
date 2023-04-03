package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.dto.requests.create.CreateCarRequest;
import kodlama.io.rentACar.business.dto.requests.update.UpdateCarRequest;
import kodlama.io.rentACar.business.dto.responses.create.CreateCarResponse;
import kodlama.io.rentACar.business.dto.responses.get.GetAllCarsResponse;
import kodlama.io.rentACar.business.dto.responses.get.GetCarResponse;
import kodlama.io.rentACar.business.dto.responses.update.UpdateCarResponse;
import kodlama.io.rentACar.entities.enums.State;

import java.util.List;

public interface CarService {
    List<GetAllCarsResponse> getAll(boolean includeMaintenance);
    GetCarResponse getById(int id);
    CreateCarResponse add(CreateCarRequest request);
    UpdateCarResponse update(int id, UpdateCarRequest request);
    void delete(int id);
    void changeState(int carId, State state);
}
