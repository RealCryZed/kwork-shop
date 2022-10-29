package shop.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "zakaz")
public class Zakaz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long zakaz_id;

    @NotNull(message = "Поле не может быть пустым")
    private String date;
    @NotNull(message = "Поле не может быть пустым")
    private Integer price;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "zakaz", fetch = FetchType.EAGER)
    @JoinTable(name = "user_id")
    private List<Tovar> tovar;

    @OneToOne(mappedBy = "zakaz", fetch=FetchType.LAZY)
    @JoinTable(name = "check_id")
    private Check check;
}
