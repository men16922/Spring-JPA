package hello.jpa;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * packageName    : hello.jpa
 * fileName       : Movie
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
@DiscriminatorValue("M")
public class Movie extends Item{

    private String director;
    private String actor;
}

