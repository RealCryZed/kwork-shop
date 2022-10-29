package shop.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shop_id;

    @NotBlank(message = "Поле не должно быть пустым!")
    private String address;
    @NotBlank(message = "Поле не должно быть пустым!")
    private String shop_name;
    @NotBlank(message = "Поле не должно быть пустым!")
    private String phone;

    @OneToOne(mappedBy = "shop", fetch=FetchType.LAZY)
    private Check check;
}
