package demo.sqlmx.domain;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TRCATEGORY")
@Data
public class CategoryCode {
    @Id
    @Column(name = "CATEGORY_CODE")
    private  Integer categoryCode;
    @Column(name = "CATEGORY_NAME")
    private  String description;
    
    @Column(name = "END_DATE")
    private  Date endDate; 
    
    @Column(name = "REC_CREATE_USERID", nullable = true)
    private  String createUser; 
    @Column(name = "REC_CREATE_TIMESTAMP", nullable = true)
    private  Timestamp createTime; 
    
    @Column(name = "LAST_UPDATE_USERID", nullable = true)
    private  String updateUser;  
    @Column(name = "LAST_UPDATE_TIMESTAMP", nullable = true)
    private  Timestamp updateTime;
}