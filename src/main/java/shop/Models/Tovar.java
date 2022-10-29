package shop.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tovar")
public class Tovar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tovar_id;
    @Size(min = 1, max = 100, message = "Поле должно содержать от 1 до 100 символов")
    @NotBlank(message = "Поле не должно быть пустым!")
    private String nameTovar;
    @NotBlank(message = "Поле не должно быть пустым!")
    private String cvet;
    @NotNull(message = "Поле не может быть пустым")
    private Integer articul;
    @NotNull(message = "Поле не может быть пустым")
    private Integer price;

    @ManyToOne()
    private Zakaz zakaz;
}
