package hello.jpa;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * packageName    : hello.jpa
 * fileName       : MemberProduct
 * author         : men16
 * date           : 2022-10-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-16        men16       최초 생성
 */
@Entity
public class MemberProduct {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name ="MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    private int cont;

    private int price;

    private LocalDateTime orderDateTime;

}

