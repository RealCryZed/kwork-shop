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
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Tovar> tovar;

    @OneToOne(mappedBy = "zakaz", fetch=FetchType.LAZY)
    private Check check;
}
