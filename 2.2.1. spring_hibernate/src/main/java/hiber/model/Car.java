package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private String series;

    public Car() {}

    public Car(User user, String model, String series) {
        this.user = user;
        this.model = model;
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "user=" + user +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
