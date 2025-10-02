package model.services;

public interface OnlinePaymentService {
    
    double paymentFee(double amount);
    double interst(double amount, int months);
}
