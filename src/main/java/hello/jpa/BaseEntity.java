package hello.jpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * packageName    : hello.jpa
 * fileName       : BaseEntity
 * author         : men16
 * date           : 2022-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-30        men16       최초 생성
 */
@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "INSERT_MEMBER")
    private String createBy;

    private LocalDateTime createdDate;

    @Column(name = "UPDATE_MEMBER")
    private String lastModified;

    private LocalDateTime lastModifiedDate;
}

