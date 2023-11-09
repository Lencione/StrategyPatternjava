package services;

import interfaces.TaxesInterface;

public class IofService implements TaxesInterface {
  public double calculate(double value) {
    return value + (value * 0.025);
  }
}
