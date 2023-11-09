package controllers;

import interfaces.TaxesInterface;

public class TaxController {
  private TaxesInterface service;

  public TaxController(TaxesInterface service) {
    this.service = service;
  }

  public void setService(TaxesInterface service) {
    this.service = service;
  }

  public double calculate(double value) {
    return service.calculate(value);
  }
}
