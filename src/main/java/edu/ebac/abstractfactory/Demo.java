package edu.ebac.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        Customer customerOne =new Customer("B", true);
        Factory factory = getCarFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getCarFactory(Customer customerOne) {
        if (customerOne.hasCompanyContract()){
            return new CompanyCarFactory();
        }
        else {
            return new CarFactory();
        }
    }
}
