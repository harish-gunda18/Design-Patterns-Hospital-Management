package com.edu.neu.csye7374.finalProject.models;

public class BillGenerationInvoker implements InvokerAPI {
    @Override
    public double execute(double doctorCharge, double medicineCharge, double labCharge) {
        return new AddCommand(new AddReceiver(doctorCharge, medicineCharge, labCharge)).execute();
    }
}
