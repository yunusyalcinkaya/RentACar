package kodlama.io.rentACars.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int modelYear;
    private String plate;
    private int state; // 1- available, 2- rented, 3 - maintance
    private double dailyPrice;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}
