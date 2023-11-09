package services;

import interfaces.TaxesInterface;

public class IcmsService implements TaxesInterface {
  public double calculate(double value) {
    return value + (value * 0.12);
  }
}
