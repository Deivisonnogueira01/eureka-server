package com.ifms.workerserve.model;

public class WorkerModel {

    String name;
    Double dayliUncome;

    public WorkerModel(String name,  double dayliUncome) {

        this.name = name;
        this.dayliUncome = dayliUncome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public Double getDayLiUncome() {
        return this.dayliUncome;
    }

    public void setDayliUncome() {

        this.dayliUncome = dayliUncome;
    }

  public Double getConta(Double dayliUncome){

    return dayliUncome + 10;

  }

}
