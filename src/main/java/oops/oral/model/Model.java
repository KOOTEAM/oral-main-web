/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.model;

import oops.oral.model.enums.ModelEnum;

import javax.persistence.*;

/**
 * Description:
 * <p>
 * Create Author  : lilZhang
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : Model.java
 */
@Entity
public class Model extends BaseEntity
{
    private ModelEnum modelType;
    private Patient patient;

    @Enumerated(EnumType.ORDINAL)
    public ModelEnum getModelType()
    {
        return modelType;
    }

    public void setModelType(ModelEnum modelType)
    {
        this.modelType = modelType;
    }

    @ManyToOne(targetEntity = Patient.class)
    @JoinColumn(name="patient_id")
    public Patient getPatient()
    {
        return patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }
}
