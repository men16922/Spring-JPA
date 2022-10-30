package hello.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * packageName    : hello.jpa
 * fileName       : Album
 * author         : men16
 * date           : 2022-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-30        men16       최초 생성
 */
@Entity
@DiscriminatorValue("A")
public class Album extends Item{
    private String artist;
}

