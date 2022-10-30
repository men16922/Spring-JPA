package hello.jpa;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * packageName    : hello.jpa
 * fileName       : Item
 * author         : men16
 * date           : 2022-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-30        men16       최초 생성
 */

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn
public abstract class Item {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;

}

