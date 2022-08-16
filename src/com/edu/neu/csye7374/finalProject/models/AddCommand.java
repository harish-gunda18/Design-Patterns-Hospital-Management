package com.edu.neu.csye7374.finalProject.models;

public class AddCommand implements CommandAPI{
    ReceiverAPI receiverObj;

    public AddCommand(ReceiverAPI receiverObj){
        this.receiverObj = receiverObj;
    }

    @Override
    public double execute() {
        System.out.println("Generating Total Payable Charge");
        return receiverObj.execute();
    }
}
