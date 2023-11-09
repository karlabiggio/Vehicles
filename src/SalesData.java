public class SalesData {
    private Integer saleCode;
    private Integer saleDate;
    private String customerData;
    private String vehicleData;
    private String paymentForm;
    private Double salePrice;

    public Integer getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(Integer saleCode) {
        this.saleCode = saleCode;
    }

    public String getCustomerData() {
        return customerData;
    }

    public void setCustomerData(String customerData) {
        this.customerData = customerData;
    }

    public String getVehicleData() {
        return vehicleData;
    }

    public void setVehicleData(String vehicleData) {
        this.vehicleData = vehicleData;
    }

    public String getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Integer saleDate) {
        this.saleDate = saleDate;
    }
}
