package model;

import java.util.Map;

public class PaymentInfo {

        static long idGen = 1;
        long transactionId;
        double amount;
        String currency;
        PaymentMethod paymentType;
        Map<String,String> paymentMethodDetails;
        Map<String,String> callBackUrls;
        public PaymentInfo( double amount, String currency, PaymentMethod paymentType,
                Map<String, String> paymentMethodDetails, Map<String, String> callBackUrls) {
            this.transactionId = idGen++;
            this.amount = amount;
            this.currency = currency;
            this.paymentType = paymentType;
            this.paymentMethodDetails = paymentMethodDetails;
            this.callBackUrls = callBackUrls;
        }
        public long getTransactionId() {
            return transactionId;
        }
        public void setTransactionId(long transactionId) {
            this.transactionId = transactionId;
        }
        public double getAmount() {
            return amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        public String getCurrency() {
            return currency;
        }
        public void setCurrency(String currency) {
            this.currency = currency;
        }
        public PaymentMethod getPaymentType() {
            return paymentType;
        }
        public void setPaymentType(PaymentMethod paymentType) {
            this.paymentType = paymentType;
        }
        public Map<String, String> getPaymentMethodDetails() {
            return paymentMethodDetails;
        }
        public void setPaymentMethodDetails(Map<String, String> paymentMethodDetails) {
            this.paymentMethodDetails = paymentMethodDetails;
        }
        public Map<String, String> getCallBackUrls() {
            return callBackUrls;
        }
        public void setCallBackUrls(Map<String, String> callBackUrls) {
            this.callBackUrls = callBackUrls;
        }



        

}
