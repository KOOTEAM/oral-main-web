package oops.oral.model;

import javax.persistence.*;
import java.util.Date;

/**
 * 实体基类
 *
 */
@MappedSuperclass
public class BaseEntity {
	protected Long id;
    protected Date addTime;
    protected Date updateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

	public void setId(Long id) {
		this.id = id;
	}

    @Temporal(TemporalType.TIMESTAMP)
    public Date getAddTime()
    {
        return addTime;
    }

    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
}
