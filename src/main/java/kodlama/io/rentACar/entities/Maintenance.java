package kodlama.io.rentACar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String information;
    private boolean isCompleted;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
}
