package shop.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Size(min = 1, max = 100, message = "Поле должно содержать от 1 до 100 символов")
    @NotBlank(message = "Поле не должно быть пустым!")
    private String lastName;
    @Size(min = 1, max = 100, message = "Поле должно содержать от 1 до 100 символов")
    @NotBlank(message = "Поле не должно быть пустым!")
    private String firstName;
    @Size(min = 1, max = 100, message = "Поле должно содержать от 1 до 100 символов")
    @NotBlank(message = "Поле не должно быть пустым!")
    private String middleName;
    @Size(min = 4, max = 4, message = "Поле должно содержать 4 символа")
    @NotBlank(message = "Поле не должно быть пустым!")
    private Integer seriya_passport;
    @Size(min = 6, max = 6, message = "Поле должно содержать 6 символов")
    @NotBlank(message = "Поле не должно быть пустым!")
    private Integer nomer_passport;
    @NotBlank(message = "Поле не должно быть пустым!")
    private String login;
    @NotBlank(message = "Поле не должно быть пустым!")
    private String password;

    @OneToOne()
    @JoinColumn(name = "role_id")
    private Role role;
}
