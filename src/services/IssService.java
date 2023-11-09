package services;

import interfaces.TaxesInterface;

public class IssService implements TaxesInterface {
  public double calculate(double value) {
    return value + (value * 0.06);
  }
}
