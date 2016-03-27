/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.model;

import javax.persistence.*;
import java.util.List;

/**
 * Description:
 * <p>
 * Create Author  : lilZhang
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : Patient.java
 */
@Entity
public class Patient extends BaseEntity
{
    private List<Doctor> doctors;
    private List<CaseReport> caseReports;
    private List<Model> models;

    @ManyToMany(fetch= FetchType.LAZY, targetEntity=Doctor.class)
    @JoinTable(
            name="doctor_patient",
            joinColumns=@JoinColumn(name="patient_id"),
            inverseJoinColumns=@JoinColumn(name="doctor_id")
    )
    public List<Doctor> getDoctors()
    {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors)
    {
        this.doctors = doctors;
    }

    @OneToMany(mappedBy="patient", targetEntity = CaseReport.class)
    public List<CaseReport> getCaseReports()
    {
        return caseReports;
    }

    public void setCaseReports(List<CaseReport> caseReports)
    {
        this.caseReports = caseReports;
    }

    @OneToMany(mappedBy="patient", targetEntity = Model.class)
    public List<Model> getModels()
    {
        return models;
    }

    public void setModels(List<Model> models)
    {
        this.models = models;
    }
}
