package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.dto.requests.create.CreateMaintenanceRequest;
import kodlama.io.rentACar.business.dto.requests.update.UpdateMaintenanceRequest;
import kodlama.io.rentACar.business.dto.responses.create.CreateMaintenanceResponse;
import kodlama.io.rentACar.business.dto.responses.get.GetAllMaintenancesResponse;
import kodlama.io.rentACar.business.dto.responses.get.GetMaintenanceResponse;
import kodlama.io.rentACar.business.dto.responses.update.UpdateMaintenanceResponse;

import java.util.List;

public interface MaintenanceService {
    List<GetAllMaintenancesResponse> getAll();
    GetMaintenanceResponse getById(int id);
    CreateMaintenanceResponse add(CreateMaintenanceRequest request);
    UpdateMaintenanceResponse update(int id, UpdateMaintenanceRequest request);
    void delete(int id);
    GetMaintenanceResponse returnCarFromMaintenance(int carId);// bakımdan çıkan
}
